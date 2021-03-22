package modelo;

import clases.Kilaje;
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

public class KilajeDB extends Conexion implements CRUD {

    @Override
    public Object insertar(Object obj) {

        Kilaje objKilaje = (Kilaje) obj;
        Connection conex = abrirConexion();

        try {
            String sql = "INSERT INTO kilaje(cedula, kilos, ano, tipodevaca) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objKilaje.getCedula());
            preparedStatement.setInt(2, objKilaje.getKilos());
            preparedStatement.setInt(3, objKilaje.getAno());
            preparedStatement.setString(4, objKilaje.getTipoDeVaca());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Kilaje insertado de manera correcta");

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }

        cerrarConexion();
        return null;
    }

    @Override
    public Object actualizar(Object obj) {

        Kilaje objKilaje = (Kilaje) obj;
        Connection conex = abrirConexion();

        try {
            String sql = "UPDATE kilaje set cedula = ?, kilos = ?, ano = ?, tipodevaca = ? WHERE idkilaje = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setString(1, objKilaje.getCedula());
            preparedStatement.setInt(2, objKilaje.getKilos());
            preparedStatement.setInt(3, objKilaje.getAno());
            preparedStatement.setString(4, objKilaje.getTipoDeVaca());
            preparedStatement.setInt(5, objKilaje.getIdKilaje());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Actualizado de manera correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return null;
    }

    @Override
    public Object eliminar(Object obj) {
        Kilaje objKilaje = (Kilaje) obj;
        Connection conex = abrirConexion();
        try {
            String sql = "DELETE FROM kilaje WHERE idkilaje = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objKilaje.getIdKilaje());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(null, "Eliminado de manera correcta");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return null;
    }

    @Override
    public List<Object> listar() {

        List<Object> rowsQuery = new ArrayList();
        Kilaje objKilaje;
        Connection conex = abrirConexion();
        try {
            String sql = "SELECT * FROM kilaje";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objKilaje = new Kilaje();
                objKilaje.setIdKilaje(resultSet.getInt("idkilaje"));
                objKilaje.setCedula(resultSet.getString("cedula"));
                objKilaje.setKilos(resultSet.getInt("kilos"));
                objKilaje.setAno(resultSet.getInt("ano"));
                objKilaje.setTipoDeVaca(resultSet.getString("tipodevaca"));
                rowsQuery.add(objKilaje);
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
        Connection conex = abrirConexion();
        Kilaje objKilaje = (Kilaje) obj;
        try {
            String sql = "SELECT * FROM kilaje WHERE idkilaje = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conex.prepareStatement(sql);
            preparedStatement.setInt(1, objKilaje.getIdKilaje());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                objKilaje.setIdKilaje(resultSet.getInt("idkilaje"));
                objKilaje.setCedula(resultSet.getString("cedula"));
                objKilaje.setKilos(resultSet.getInt("kilos"));
                objKilaje.setAno(resultSet.getInt("ano"));
                objKilaje.setTipoDeVaca(resultSet.getString("tipodevaca"));

            }
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        cerrarConexion();
        return objKilaje;
    }

}
