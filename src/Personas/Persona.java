package personas;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected int edad; 
    protected LocalDate fechaNacimiento; 
    
    public Persona(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(); 
    }

    public int calcularEdad() {
        if (this.fechaNacimiento != null) {
            LocalDate fechaActual = LocalDate.now();
            return Period.between(this.fechaNacimiento, fechaActual).getYears();
        }
        return 0;
        
    } 
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        this.edad = calcularEdad();
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
    }   
}