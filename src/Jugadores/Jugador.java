package Jugadores;
import Personas.Persona;

public class Jugador extends Persona {

    private int numero;
    private String posicion;

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Jugador(int numero, String posicion, String nombre, String nacionalidad,
                 int edad, String fechaNacimiento) {
        super(nombre, nacionalidad, edad, fechaNacimiento);
        this.numero = numero;
        this.posicion = posicion;
    }
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
               "\nNacionalidad: " + nacionalidad +
               "\nEdad: " + edad +
               "\nFecha Nacimiento: " + fechaNacimiento +
               "\nNumero: " + numero +
               "\nPosicion: " + posicion;
    }
}