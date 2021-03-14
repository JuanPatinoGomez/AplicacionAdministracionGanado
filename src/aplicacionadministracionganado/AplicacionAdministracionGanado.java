
package aplicacionadministracionganado;

import database.Conexion;


public class AplicacionAdministracionGanado {

    public static void main(String[] args) {
        Conexion cone = new Conexion();
        cone.abrirConexion();
        cone.cerrarConexion();
    }
    
}
