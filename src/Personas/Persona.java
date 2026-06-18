package Personas;
public class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected int edad;
    protected String fechaNacimiento;

    public Persona(String nombre, String nacionalidad, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        if (edad>=0){
            this.edad = edad;        }
    }    
}
