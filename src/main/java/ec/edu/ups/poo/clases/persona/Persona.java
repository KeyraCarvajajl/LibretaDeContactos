package ec.edu.ups.poo.clases.persona;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona() {}

    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override     public String toString() {
        return "Cedula: " + cedula +
                ", Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Direccion: " + direccion;
    }
}
