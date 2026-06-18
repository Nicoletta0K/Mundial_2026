package Jugadores;
import Personas.Persona;

public final class Jugador extends Persona{
    protected int numero;
    protected String posicion;
    public Jugador(String nombre, String nacionalidad, int edad, String fechaNacimiento) {
        super(nombre, nacionalidad, edad, fechaNacimiento);
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
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

    public Jugador(int numero, String posicion, String nombre, String nacionalidad, int edad, String fechaNacimiento) {
        super(nombre, nacionalidad, edad, fechaNacimiento);
        this.numero = numero;
        this.posicion = posicion;
        this.nombre=getNombre();
        this.nacionalidad=getNacionalidad();
        this.edad=getEdad();
        this.fechaNacimiento=getFechaNacimiento();
    }
    
}
