
package aplicacionadministracionganado;

import clases.Propietario;
import database.Conexion;
import modelo.PropietarioDB;


public class AplicacionAdministracionGanado {

    public static void main(String[] args) {
//        Conexion cone = new Conexion();
//        cone.abrirConexion();
//        cone.cerrarConexion();

        Propietario objPro = new Propietario("10256546458", "Johan", "Parra", 3);
        PropietarioDB objProDB = new PropietarioDB();
        objProDB.insertar(objPro);
    }
    
}
