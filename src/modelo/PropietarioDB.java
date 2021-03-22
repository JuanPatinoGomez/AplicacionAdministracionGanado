
package modelo;

import clases.Propietario;
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


public class PropietarioDB extends Conexion implements CRUD{

    @Override
    public Object insertar(Object obj) {
        Propietario objPropietario = (Propietario) obj;
        Connection conex = abrirConexion();
        
        try {
            
            String sql = "INSERT INTO propietario VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objPropietario.getCedula());
            preparedStatement.setString(2, objPropietario.getNombres());
            preparedStatement.setString(3, objPropietario.getApellidos());
            preparedStatement.setInt(4, objPropietario.getNumeroVacas());
            preparedStatement.execute();
            preparedStatement.close();
            
            JOptionPane.showMessageDialog(null, "El propietario fue insertado con exito");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return null;
    }

    @Override
    public Object actualizar(Object obj) {
        
        Propietario objPropietario = (Propietario) obj;
        Connection conex = abrirConexion();
        
        try {
            
            String sql = "UPDATE propietario set nombres = ?, apellidos = ?, numero_vacas= ? WHERE cedula = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objPropietario.getNombres());
            preparedStatement.setString(2, objPropietario.getApellidos());
            preparedStatement.setInt(3, objPropietario.getNumeroVacas());
            preparedStatement.setString(4, objPropietario.getCedula());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Se ha actualizado de manera correcta");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        return null;
    }

    @Override
    public Object eliminar(Object obj) {
        
        Propietario objPropietario = (Propietario) obj;
        Connection conex = abrirConexion();
        
        try {
            String sql = "DELETE FROM propietario WHERE cedula = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objPropietario.getCedula());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado de manera correcta");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        
        return null;
    }

    @Override
    public List<Object> listar() {
        List<Object> rowsQuery = new ArrayList();
        Propietario objPropietario;
        Connection conex = abrirConexion();
        
        try {
            String sql = "SELECT * FROM propietario";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objPropietario = new Propietario();
                objPropietario.setCedula(resultSet.getString("cedula"));
                objPropietario.setNombres(resultSet.getString("nombres"));
                objPropietario.setApellidos(resultSet.getString("apellidos"));
                objPropietario.setNumeroVacas(resultSet.getInt("numero_vacas"));
                rowsQuery.add(objPropietario);
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
        
        Propietario objPropietario = (Propietario) obj;
        Connection conex = abrirConexion();
        
        try {
            String sql = "SELECT * FROM propietario WHERE cedula = ?";
            PreparedStatement preparedStatement =  (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objPropietario.getCedula());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                objPropietario.setCedula(resultSet.getString("cedula"));
                objPropietario.setNombres(resultSet.getString("nombres"));
                objPropietario.setApellidos(resultSet.getString("apellidos"));
                objPropietario.setNumeroVacas(resultSet.getInt("numero_vacas"));
            }
            preparedStatement.close();
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        cerrarConexion();
        
        return objPropietario;
    }
    
    
}
