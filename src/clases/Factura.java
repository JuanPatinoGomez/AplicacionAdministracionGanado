
package clases;


public class Factura {
    
    private int idFactura;
    private int kilosTotal;
    private int valorTotal;

    public Factura() {
    }

    public Factura(int serial, int kilosTotal, int valorTotal) {
        this.idFactura = serial;
        this.kilosTotal = kilosTotal;
        this.valorTotal = valorTotal;
    }

    public Factura(int kilosTotal) {
        this.kilosTotal = kilosTotal;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getKilosTotal() {
        return kilosTotal;
    }

    public void setKilosTotal(int kilosTotal) {
        this.kilosTotal = kilosTotal;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" + "serial=" + idFactura + ", kilosTotal=" + kilosTotal + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
