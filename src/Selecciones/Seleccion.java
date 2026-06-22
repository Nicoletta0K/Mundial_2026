package selecciones;
import Entrenador.Entrenador;
import Jugadores.Jugador;
import Selecciones.Grupos;

public class Seleccion {
    private String nombre;
    private Grupos grupo;
    private Entrenador entrenador;
    private Jugador[] jugadores;
    private int contadorJugadores;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Grupos getGrupo() {
        return grupo;
    }
    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }
    public Entrenador getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }
    
    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = new Jugador[26];
        this.contadorJugadores = 0;
}
    
    public void agregarJugador(Jugador jugador) {
        if (contadorJugadores < jugadores.length) {
            jugadores[contadorJugadores] = jugador;
            contadorJugadores++;
            System.out.println("Jugador agregado: " + jugador.getNombre());
        } else {
            System.out.println("La plantilla está llena.");
        }
    }
    
    public boolean eliminarJugadorPorCamiseta(int numeroCamiseta) {
    int posicionEncontrada = -1;
    for (int i = 0; i < contadorJugadores; i++) {
        if (jugadores[i].getNumeroCamiseta() == numeroCamiseta) {
            posicionEncontrada = i; 
            break; 
        }
    }
    if (posicionEncontrada == -1) {
        System.out.println("No se encontró ningún jugador con ese numero de camiseta.");
        return false; 
    }
    jugadores[posicionEncontrada] = jugadores[contadorJugadores - 1];
    jugadores[contadorJugadores - 1] = null;
    contadorJugadores--;
    System.out.println("Jugador eliminado exitosamente.");
    return true;
}
    public Jugador buscarJugadorPorNombre(String buscarNombre) {
    for (int i = 0; i < contadorJugadores; i++) {
        if (jugadores[i].getNombre().equalsIgnoreCase(buscarNombre)) {
            return jugadores[i]; 
        }
    }
    System.out.println("Error: El jugador '" + buscarNombre + "' no está registrado.");
    return null; 
}
       public Jugador buscarJugadorPorCamiseta(int buscarCamiseta) {
    for (int i = 0; i < contadorJugadores; i++) {
        if (jugadores[i].getNumeroCamiseta()==buscarCamiseta) {
            return jugadores[i]; 
        }
    }
    return null; 
}
    public int cantidadJugadoresRegistrados() {
    return this.contadorJugadores;
}
 public boolean existeJugadorPorCamiseta(int numeroCamiseta) {
    Jugador jugadorEncontrado = buscarJugadorPorCamiseta(numeroCamiseta);
    return jugadorEncontrado != null;
}
}