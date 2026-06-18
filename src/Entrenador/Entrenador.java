package Entrenador;
import Personas.Persona;


public class Entrenador extends Persona{
    protected double añosExperiencia;

    public Entrenador(double añosExperiencia, String nombre, String nacionalidad, int edad, String fechaNacimiento) {
        super(nombre, nacionalidad, edad, fechaNacimiento);
        this.añosExperiencia = añosExperiencia;   
       }
    public double getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    @Override
    public int getEdad() {
        return edad;
    }
    
    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setAñosExperiencia(double añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    @Override
    public String toString() {
        return "\n Nombre: "+nombre+
               "\n Nacionalidad: "+nacionalidad+
               "\n Edad: "+edad+
               "\n Fecha de Nacimiento: "+fechaNacimiento+
               "\n Años de Experiencia: "+añosExperiencia;
               
    }
    
}
