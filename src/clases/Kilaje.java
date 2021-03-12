package clases;

public class Kilaje {

    private int idKilaje;
    private String cedula;
    private int kilos;
    private int ano;
    private String tipoDeVaca;

    public Kilaje(int idKilaje, String cedula, int kilos, int ano, String tipoDeVaca) {
        this.idKilaje = idKilaje;
        this.cedula = cedula;
        this.kilos = kilos;
        this.ano = ano;
        this.tipoDeVaca = tipoDeVaca;
    }

    public Kilaje(String cedula, int kilos, int ano, String tipoDeVaca) {
        this.cedula = cedula;
        this.kilos = kilos;
        this.ano = ano;
        this.tipoDeVaca = tipoDeVaca;
    }

    public int getIdKilaje() {
        return idKilaje;
    }

    public void setIdKilaje(int idKilaje) {
        this.idKilaje = idKilaje;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipoDeVaca() {
        return tipoDeVaca;
    }

    public void setTipoDeVaca(String tipoDeVaca) {
        this.tipoDeVaca = tipoDeVaca;
    }

    @Override
    public String toString() {
        return "Kilaje{" + "idKilaje=" + idKilaje + ", cedula=" + cedula + ", kilos=" + kilos + ", ano=" + ano + ", tipoDeVaca=" + tipoDeVaca + '}';
    }
    
    
    

}
