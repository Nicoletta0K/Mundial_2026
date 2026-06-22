package Entrenador;
import personas.Persona;
import java.time.LocalDate;
public class Entrenador extends Persona {
    private double añosExperiencia;
    
    public double getAñosExperiencia() {
        return añosExperiencia;
    }
    
    public void setAñosExperiencia(double añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public Entrenador(double añosExperiencia, String nombre,  String nacionalidad, String fechaNacimiento) {
         super(nombre, nacionalidad, LocalDate.parse(fechaNacimiento));
         this.añosExperiencia = añosExperiencia;
    }
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
               "\nNacionalidad: " + nacionalidad +
               "\nEdad: " + edad +
               "\nFecha Nacimiento: " + fechaNacimiento +
               "\nAños de Experiencia: " + añosExperiencia;
    }
}