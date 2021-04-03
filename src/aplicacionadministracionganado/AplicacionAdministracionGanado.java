
package aplicacionadministracionganado;

import clases.Factura;
import clases.Kilaje;
import clases.Propietario;
import clases.Vaca;
import clases.Venta;
import database.Conexion;
import formularios.FrmPrincipal;
import java.time.LocalDate;
import java.time.Month;
import modelo.FacturaDB;
import modelo.KilajeDB;
import modelo.PropietarioDB;
import modelo.VacaDB;
import modelo.VentaDB;


public class AplicacionAdministracionGanado {

    public static void main(String[] args) {
        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setVisible(true);
//        Conexion cone = new Conexion();
//        cone.abrirConexion();
//        cone.cerrarConexion();

        //Propietario
        //insertar
        
//        Propietario objPro = new Propietario("102548264", "nombreeee", "Parra", 20);
//        PropietarioDB objProDB = new PropietarioDB();
//        objProDB.insertar(objPro);

        //actualizar
//        Propietario objPro = new Propietario("10256546458", "Johanactualizado", "Parra", 3);
//        PropietarioDB objProDB = new PropietarioDB();
//        objProDB.actualizar(objPro);

        //eliminar
//         Propietario objPro = new Propietario();
//         objPro.setCedula("1025463698");
//         PropietarioDB objProDB = new PropietarioDB();
//         objProDB.eliminar(objPro);

        //listar
//        PropietarioDB objProDB = new PropietarioDB();
//        Propietario objPropietario;
//        for(Object obj: objProDB.listar()){
//            objPropietario = (Propietario) obj;
//            System.out.println(objPropietario.toString());
//        }
        //listar uno
//        Propietario objPro = new Propietario();
//        objPro.setCedula("10256546458");
//        PropietarioDB objProDB = new PropietarioDB();
//        objPro = (Propietario) objProDB.listarUno(objPro);
//        System.out.println(objPro);

//---------------------------------------------------------------------------------------------------------------------------------------------------
        //insertar
//        Vaca objVaca = new Vaca(112, LocalDate.of(2021, Month.MARCH, 05), "sana", true, 'h', 220, "vacota", "10256546458");
//        VacaDB objVacaDB = new VacaDB(); 
//        objVacaDB.insertar(objVaca);

        //actualizar
//        Vaca objVaca = new Vaca(1 ,111, LocalDate.now(), "sanacolitaderana", true, 'h', 500, "vacocota", "10256546458");
//        VacaDB objVacaDB = new VacaDB(); 
//        objVacaDB.actualizar(objVaca);

        //eliminar 
//        Vaca objVaca = new Vaca();
//        objVaca.setIdvaca(1);
//        VacaDB objVacaDB = new VacaDB();
//        objVacaDB.eliminar(objVaca);

        //listar
//        VacaDB objVacaDB = new VacaDB();
//        Vaca objVaca;
//        for (Object obj : objVacaDB.listar()) {
//            objVaca = (Vaca) obj;
//            System.out.println(objVaca);
//        }

        //listar uno
//        VacaDB objVacaDB = new VacaDB();
//        Vaca objVaca = new Vaca();
//        objVaca.setIdvaca(3);
//        System.out.println(objVacaDB.listarUno(objVaca));

        //-----------------------------------------------------------------------------------------------------------------------
        //insertar 
        
//        Kilaje objKilaje = new Kilaje("10252564", 400, 2019, "vacaiguana");
//        KilajeDB objKilajeDB = new KilajeDB();
//        objKilajeDB.insertar(objKilaje);

        //actualizar 
//        Kilaje objKilaje = new Kilaje(1, "10256546458", 100, 2019, "vacasapa");
//        KilajeDB objKilajeDB = new KilajeDB();
//        objKilajeDB.actualizar(objKilaje);

        //eliminar
//        Kilaje objKilaje = new Kilaje();
//        objKilaje.setIdKilaje(2);
//        KilajeDB objKilajeDB = new KilajeDB();
//        objKilajeDB.eliminar(objKilaje);

        //Listar
//        KilajeDB objKilajeDB = new KilajeDB();
//        Kilaje objKilaje;
//        for(Object obj : objKilajeDB.listar()){ 
//            objKilaje = (Kilaje) obj;
//            System.out.println(objKilaje);
//        }

        //listar uno
//        KilajeDB objKilajeDB = new KilajeDB();
//        Kilaje objKilaje = new Kilaje();
//        objKilaje.setIdKilaje(3);
//        System.out.println(objKilajeDB.listarUno(objKilaje));
//----------------------------------------------------------------------------------------------------------
        //Insertar
//        Factura objFactura = new Factura(30000, 150000000);
//        FacturaDB objFacturaDB = new FacturaDB();
//        objFacturaDB.insertar(objFactura);

        //actualizar
//        Factura objFactura = new Factura(3, 9, 150000000);
//        FacturaDB objFacturaDB = new FacturaDB();
//        objFacturaDB.actualizar(objFactura);

        //eliminar
//        Factura objFactura = new Factura();
//        objFactura.setIdFactura(1);
//        FacturaDB objFacturaDB = new FacturaDB();
//        objFacturaDB.eliminar(objFactura);

        //listar
//        FacturaDB objFacturaDB = new FacturaDB();
//        Factura objFactura;
//        for(Object obj : objFacturaDB.listar()){
//            objFactura = (Factura) obj;
//            System.out.println(objFactura);
//        }

        //listar uno
//        FacturaDB objFacturaDB = new FacturaDB();
//        Factura objFactura = new Factura();
//        objFactura.setIdFactura(3);
//        System.out.println(objFacturaDB.listarUno(objFactura));
//        objFactura = (Factura) objFacturaDB.listarUno(objFactura);
//        System.out.println(objFactura);
//---------------------------------------------------------------------------------------------------------------------------------------
        //insertar
//        Venta objVenta = new Venta(3, 500, 200000, 2);
//        VentaDB objVentaDB = new VentaDB();
//        objVentaDB.insertar(objVenta);

        //Actualizar
//        VentaDB objVentaDB = new VentaDB();
//        Venta objVenta = new Venta(5, 3, 30, 100000, 2);
//        objVentaDB.actualizar(objVenta);

        //eliminar
//        VentaDB objVentaDB = new VentaDB();
//        Venta objVenta = new Venta();
//        objVenta.setIdVenta(4);
//        objVentaDB.eliminar(objVenta);

        //listar
//        VentaDB objVentaDB = new VentaDB();
//        Venta objVenta;
//        for(Object obj : objVentaDB.listar()){
//            objVenta = (Venta) obj;
//            System.out.println(objVenta);
//        }

        //listar uno
//        VentaDB objVentaDB = new VentaDB();
//        Venta objVenta = new Venta();
//        objVenta.setIdVenta(3);
//        objVenta = (Venta) objVentaDB.listarUno(objVenta);
//        System.out.println(objVenta);
    }
    
}

