
package clases;


public class Venta {
    private int idVenta;
    private int idVaca;
    private float kilos;
    private int precioPorKilo;

    public Venta() {
    }

    public Venta(int idVenta, int idVaca, float kilos, int precioPorKilo) {
        this.idVenta = idVenta;
        this.idVaca = idVaca;
        this.kilos = kilos;
        this.precioPorKilo = precioPorKilo;
    }

    public Venta(int idVaca, float kilos, int precioPorKilo) {
        this.idVaca = idVaca;
        this.kilos = kilos;
        this.precioPorKilo = precioPorKilo;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdVaca() {
        return idVaca;
    }

    public void setIdVaca(int idVaca) {
        this.idVaca = idVaca;
    }

    public float getKilos() {
        return kilos;
    }

    public void setKilos(float kilos) {
        this.kilos = kilos;
    }

    public int getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(int precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", idVaca=" + idVaca + ", kilos=" + kilos + ", precioPorKilo=" + precioPorKilo + '}';
    }
    
    
}
