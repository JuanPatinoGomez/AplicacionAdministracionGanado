
package modelo;

import clases.Vaca;
import database.CRUD;
import database.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VacaDB extends Conexion implements CRUD{

    @Override
    public Object insertar(Object obj) {
        
        Vaca objVaca = (Vaca) obj;
        Connection conex = abrirConexion();
        
        try {
            String sql = "INSERT INTO vaca(numero, fecha_nacimiento, estado, vendido, genero, kilos, tipodevaca, cedula) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVaca.getNumero());
            preparedStatement.setDate(2, Date.valueOf(objVaca.getFechaNacimiento()));
            preparedStatement.setString(3, objVaca.getEstado());
            preparedStatement.setBoolean(4, objVaca.isVendido());
            preparedStatement.setObject(5, objVaca.getGenero());
            preparedStatement.setFloat(6, objVaca.getKilos());
            preparedStatement.setString(7, objVaca.getTipoVaca());
            preparedStatement.setString(8, objVaca.getCedula());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Vaca insertada de manera correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        cerrarConexion();
        
        return null;
    }

    @Override
    public Object actualizar(Object obj) {
        
        Vaca objVaca = (Vaca) obj;
        Connection conex = abrirConexion();
        
        try {
            String sql = "UPDATE vaca set numero = ?, fecha_nacimiento = ?, estado = ?, vendido = ?, genero = ?, kilos = ?, tipodevaca = ?, cedula = ?"
                    + "WHERE idvaca = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVaca.getNumero());
            preparedStatement.setDate(2, Date.valueOf(objVaca.getFechaNacimiento()));
            preparedStatement.setString(3, objVaca.getEstado());
            preparedStatement.setBoolean(4, objVaca.isVendido());
            preparedStatement.setObject(5, objVaca.getGenero());
            preparedStatement.setFloat(6, objVaca.getKilos());
            preparedStatement.setString(7, objVaca.getTipoVaca());
            preparedStatement.setString(8, objVaca.getCedula());
            preparedStatement.setInt(9, objVaca.getIdvaca());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Vaca actulizada de manera correcta");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return null;
    }

    @Override
    public Object eliminar(Object obj) {
        
        Vaca objVaca = (Vaca) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "DELETE FROM vaca WHERE idvaca = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVaca.getIdvaca());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Eliminado de manera correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
    }

    @Override
    public List<Object> listar() {
        List<Object> rowsQuery = new ArrayList();
        Vaca objVaca;
        Connection conex = abrirConexion();
        
        try {
            String sql = "SELECT * FROM vaca";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                objVaca = new Vaca();
                objVaca.setIdvaca(resultSet.getInt("idvaca"));
                objVaca.setNumero(resultSet.getInt("numero"));
                objVaca.setFechaNacimiento(resultSet.getDate("fecha_nacimiento").toLocalDate());
                objVaca.setEstado(resultSet.getString("estado"));
                objVaca.setVendido(resultSet.getBoolean("vendido"));
                objVaca.setGenero(resultSet.getString("vendido").charAt(0));
                objVaca.setKilos(resultSet.getFloat("kilos"));
                objVaca.setTipoVaca(resultSet.getString("tipodevaca"));
                objVaca.setCedula(resultSet.getString("cedula"));
                rowsQuery.add(objVaca);
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
        Vaca objVaca = (Vaca) obj;
        Connection conex = abrirConexion();
        
        try {
            String sql = "SELECT * FROM vaca WHERE idvaca = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objVaca.getIdvaca());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                
                objVaca.setIdvaca(resultSet.getInt("idvaca"));
                objVaca.setNumero(resultSet.getInt("numero"));
                objVaca.setFechaNacimiento(resultSet.getDate("fecha_nacimiento").toLocalDate());
                objVaca.setEstado(resultSet.getString("estado"));
                objVaca.setVendido(resultSet.getBoolean("vendido"));
                objVaca.setGenero(resultSet.getString("vendido").charAt(0));
                objVaca.setKilos(resultSet.getFloat("kilos"));
                objVaca.setTipoVaca(resultSet.getString("tipodevaca"));
                objVaca.setCedula(resultSet.getString("cedula"));
                
            }
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return objVaca;
    }
    
    //metodos fuera del crud
    public List<Object> listarVacasPorPropietario(Object obj) {
        List<Object> rowsQuery = new ArrayList();
        Vaca objVaca = (Vaca) obj;
        Connection conex = abrirConexion();
        
        try {
            String sql = "SELECT * FROM vaca WHERE cedula = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objVaca.getCedula());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                objVaca = new Vaca();
                objVaca.setIdvaca(resultSet.getInt("idvaca"));
                objVaca.setNumero(resultSet.getInt("numero"));
                objVaca.setFechaNacimiento(resultSet.getDate("fecha_nacimiento").toLocalDate());
                objVaca.setEstado(resultSet.getString("estado"));
                objVaca.setVendido(resultSet.getBoolean("vendido"));
                objVaca.setGenero(resultSet.getString("vendido").charAt(0));
                objVaca.setKilos(resultSet.getFloat("kilos"));
                objVaca.setTipoVaca(resultSet.getString("tipodevaca"));
                objVaca.setCedula(resultSet.getString("cedula"));
                rowsQuery.add(objVaca);
            }
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return rowsQuery;
    }
}
