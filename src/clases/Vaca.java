
package clases;

import java.time.LocalDate;


public class Vaca {
    private int idvaca;
    private int numero;
    private LocalDate fechaNacimiento;
    private String estado;
    private boolean vendido;
    private String genero;
    private float kilos;
    private String tipoVaca;
    private String potrero;
    private String descripcion;
    private String cedula;
    private int idVacaMadre;

    public Vaca() {
    }
    //manejo de id
    public Vaca(int idvaca, int numero, LocalDate fechaNacimiento, String estado, boolean vendido, String genero, float kilos, String tipoVaca, String potrero, String descripcion, String cedula) {
        this.idvaca = idvaca;
        this.numero = numero;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.vendido = vendido;
        this.genero = genero;
        this.kilos = kilos;
        this.tipoVaca = tipoVaca;
        this.potrero = potrero;
        this.descripcion = descripcion;
        this.cedula = cedula;
    }
    //insertar una vaca con todos los datos
    public Vaca(int idvaca, int numero, LocalDate fechaNacimiento, String estado, boolean vendido, String genero, float kilos, String tipoVaca, String potrero, String descripcion, String cedula, int idVacaMadre) {
        this.idvaca = idvaca;
        this.numero = numero;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.vendido = vendido;
        this.genero = genero;
        this.kilos = kilos;
        this.tipoVaca = tipoVaca;
        this.potrero = potrero;
        this.descripcion = descripcion;
        this.cedula = cedula;
        this.idVacaMadre = idVacaMadre;
    }
    
    //insertar vacas a las que no se les sepa la fecha de nacimiento
    public Vaca(int numero, String estado, boolean vendido, String genero, float kilos, String tipoVaca, String potrero, String descripcion, String cedula) {
        this.numero = numero;
        this.estado = estado;
        this.vendido = vendido;
        this.genero = genero;
        this.kilos = kilos;
        this.tipoVaca = tipoVaca;
        this.potrero = potrero;
        this.descripcion = descripcion;
        this.cedula = cedula;
    }

    

    public int getIdvaca() {
        return idvaca;
    }

    public void setIdvaca(int idvaca) {
        this.idvaca = idvaca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getKilos() {
        return kilos;
    }

    public void setKilos(float kilos) {
        this.kilos = kilos;
    }

    public String getTipoVaca() {
        return tipoVaca;
    }

    public void setTipoVaca(String tipoVaca) {
        this.tipoVaca = tipoVaca;
    }

    public String getPotrero() {
        return potrero;
    }

    public void setPotrero(String potrero) {
        this.potrero = potrero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getIdVacaMadre() {
        return idVacaMadre;
    }

    public void setIdVacaMadre(int idVacaMadre) {
        this.idVacaMadre = idVacaMadre;
    }

    @Override
    public String toString() {
        return "Vaca{" + "idvaca=" + idvaca + ", numero=" + numero + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + ", vendido=" + vendido + ", genero=" + genero + ", kilos=" + kilos + ", tipoVaca=" + tipoVaca + ", potrero=" + potrero + ", descripcion=" + descripcion + ", cedula=" + cedula + ", idVacaMadre=" + idVacaMadre + '}';
    }

    
    

    
    
    
}
