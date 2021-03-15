
package modelo;

import clases.Propietario;
import database.CRUD;
import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object listarUno(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
