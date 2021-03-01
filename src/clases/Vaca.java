
package clases;

import java.time.LocalDate;


public class Vaca {
    private int idvaca;
    private int numero;
    private LocalDate fechaNacimiento;
    private boolean estado;
    private char genero;
    private float kilos;
    private String tipoVaca;
    private String cedula;

    public Vaca() {
    }

    public Vaca(int idvaca, int numero, LocalDate fechaNacimiento, boolean estado, char genero, float kilos, String tipoVaca, String cedula) {
        this.idvaca = idvaca;
        this.numero = numero;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.genero = genero;
        this.kilos = kilos;
        this.tipoVaca = tipoVaca;
        this.cedula = cedula;
    }

    public Vaca(int numero, LocalDate fechaNacimiento, boolean estado, char genero, float kilos, String tipoVaca, String cedula) {
        this.numero = numero;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.genero = genero;
        this.kilos = kilos;
        this.tipoVaca = tipoVaca;
        this.cedula = cedula;
    }

    public Vaca(int numero, boolean estado, char genero, float kilos, String tipoVaca, String cedula) {
        this.numero = numero;
        this.estado = estado;
        this.genero = genero;
        this.kilos = kilos;
        this.tipoVaca = tipoVaca;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Vaca{" + "idvaca=" + idvaca + ", numero=" + numero + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + ", genero=" + genero + ", kilos=" + kilos + ", tipoVaca=" + tipoVaca + ", cedula=" + cedula + '}';
    }
    
    
    
}
