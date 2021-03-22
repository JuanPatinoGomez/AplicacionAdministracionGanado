
package modelo;

import clases.Venta;
import database.CRUD;
import database.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VentaDB extends Conexion implements CRUD{

    @Override
    public Object insertar(Object obj) {
        
        Venta objVenta = (Venta) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "INSERT INTO venta(idvaca, kilos, precioxkilo, idfactura) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVenta.getIdVaca());
            preparedStatement.setFloat(2, objVenta.getKilos());
            preparedStatement.setInt(3, objVenta.getPrecioPorKilo());
            preparedStatement.setInt(4, objVenta.getIdFactura());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Venta insertada de manera correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return null;
    }

    @Override
    public Object actualizar(Object obj) {
        Venta objVenta = (Venta) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "UPDATE venta set idvaca = ?, kilos = ?, precioxkilo = ?, idfactura = ? WHERE idventa = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVenta.getIdVaca());
            preparedStatement.setFloat(2, objVenta.getKilos());
            preparedStatement.setInt(3, objVenta.getPrecioPorKilo());
            preparedStatement.setInt(4, objVenta.getIdFactura());
            preparedStatement.setInt(5, objVenta.getIdVenta());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Venta insertada de manera correcta");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return null;
    }

    @Override
    public Object eliminar(Object obj) {
        Venta objVenta = (Venta) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "DELETE FROM venta WHERE idventa = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVenta.getIdVenta());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Venta eliminada de manera correcta");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return null;
    }

    @Override
    public List<Object> listar() {
        List<Object> rowsQuery = new ArrayList();
        Venta objVenta;
        Connection conex = abrirConexion();
        try {
            String sql = "SELECT * FROM venta";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objVenta = new Venta();
                objVenta.setIdVenta(resultSet.getInt("idventa"));
                objVenta.setIdVaca(resultSet.getInt("idvaca"));
                objVenta.setKilos(resultSet.getFloat("kilos"));
                objVenta.setPrecioPorKilo(resultSet.getInt("precioxkilo"));
                objVenta.setIdFactura(resultSet.getInt("idfactura"));
                rowsQuery.add(objVenta);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return rowsQuery;
    }

    @Override
    public Object listarUno(Object obj) {
        
        Venta objVenta = (Venta) obj;
        Connection conex = abrirConexion();
        try {
             String sql = "SELECT * FROM venta WHERE idventa = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVenta.getIdVenta());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objVenta.setIdVenta(resultSet.getInt("idventa"));
                objVenta.setIdVaca(resultSet.getInt("idvaca"));
                objVenta.setKilos(resultSet.getFloat("kilos"));
                objVenta.setPrecioPorKilo(resultSet.getInt("precioxkilo"));
                objVenta.setIdFactura(resultSet.getInt("idfactura"));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return objVenta;
    }
    
}
