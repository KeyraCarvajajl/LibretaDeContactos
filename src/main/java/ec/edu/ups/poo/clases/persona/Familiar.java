package ec.edu.ups.poo.clases.persona;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;
    public Familiar() {}

    public Familiar(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaNacimiento, String parentesco, String tipoDeSangre) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaNacimiento = fechaNacimiento;
        System.out.println("Siempre mantenerse unidos.");
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        return (anioActual - anioNacimiento);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nParentesco: " + parentesco +
                "\nTipo de sangre: " + tipoDeSangre +
                "\nEdad: " + calcularEdad();
    }
}
