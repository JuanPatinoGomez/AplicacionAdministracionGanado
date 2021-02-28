package clases;

public class Propietario extends Persona {

    private int numeroVacas;

    public Propietario() {
    }

    public Propietario(String cedula, String nombres, String apellidos) {
        super(cedula, nombres, apellidos);
    }

    public Propietario(String cedula, String nombres, String apellidos, int numeroVacas) {
        super(cedula, nombres, apellidos);
        this.numeroVacas = numeroVacas;
    }

    public int getNumeroVacas() {
        return numeroVacas;
    }

    public void setNumeroVacas(int numeroVacas) {
        this.numeroVacas = numeroVacas;
    }

    @Override
    public String toString() {
        return super.toString() + "Propietario{" + "numeroVacas=" + numeroVacas + '}';
    }
    
    
}
