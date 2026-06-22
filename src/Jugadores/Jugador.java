package Jugadores;
import java.time.LocalDate;
import personas.Persona;
public class Jugador extends Persona {

    private int numeroCamiseta;
    private String posicion;

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNumeroCamiseta(int numero) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Jugador(int numero, String posicion, String nombre, String nacionalidad,
                 int edad, String fechaNacimiento) {
        super(nombre, nacionalidad, LocalDate.parse(fechaNacimiento));
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
               "\nNacionalidad: " + nacionalidad +
               "\nEdad: " + edad +
               "\nFecha Nacimiento: " + fechaNacimiento +
               "\nNumero: " + numeroCamiseta +
               "\nPosicion: " + posicion;
    }
}