
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    static Connection con = null;
 
    public Connection abrirConexion(){
        
        try {
            String url = "jdbc:postgresql://localhost:5432/pruebavacasjohan";
            String user = "postgres";
            String password = "iguani3000";
            
            con = (Connection) DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Se conecto");
        return con;
    }
    
    public void cerrarConexion(){
        
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
