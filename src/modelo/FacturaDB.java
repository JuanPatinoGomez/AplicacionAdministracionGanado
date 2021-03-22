
package modelo;

import clases.Factura;
import database.CRUD;
import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FacturaDB extends Conexion implements CRUD{

    @Override
    public Object insertar(Object obj) {
        
        Factura objFactura = (Factura) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "INSERT INTO factura(kilostotal, valortotal) VALUES (?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objFactura.getKilosTotal());
            preparedStatement.setInt(2, objFactura.getValorTotal());
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se inserto la factura de manera correcta");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return null;
    }

    @Override
    public Object actualizar(Object obj) {
        Factura objFactura = (Factura) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "UPDATE factura set kilostotal = ?, valortotal = ? WHERE idfactura = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objFactura.getKilosTotal());
            preparedStatement.setInt(2, objFactura.getValorTotal());
            preparedStatement.setInt(3, objFactura.getIdFactura());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Se actualizo de manera correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return null;
    }

    @Override
    public Object eliminar(Object obj) {
        Factura objFactura = (Factura) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "DELETE FROM factura WHERE idfactura = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objFactura.getIdFactura());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Eliminado de manera correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return null;
    }

    @Override
    public List<Object> listar() {
        List<Object> rowsQuery = new ArrayList();
        Factura objFactura;
        Connection conex = abrirConexion();
        try {
            String sql = "SELECT * FROM factura";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            ResultSet resultSet =  preparedStatement.executeQuery();
            while (resultSet.next()) {
                objFactura = new Factura();
                objFactura.setIdFactura(resultSet.getInt("idfactura"));
                objFactura.setKilosTotal(resultSet.getInt("kilostotal"));
                objFactura.setValorTotal(resultSet.getInt("valortotal"));
                rowsQuery.add(objFactura);
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
        Factura objFactura = (Factura) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "SELECT * FROM factura WHERE idfactura = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objFactura.getIdFactura());
            ResultSet resultSet =  preparedStatement.executeQuery();
            while (resultSet.next()) {
                objFactura.setIdFactura(resultSet.getInt("idfactura"));
                objFactura.setKilosTotal(resultSet.getInt("kilostotal"));
                objFactura.setValorTotal(resultSet.getInt("valortotal"));
                
            }
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return objFactura;
    }
    
}
