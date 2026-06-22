package Mundial;
import selecciones.Seleccion;
import Partidos.Partido;
import Selecciones.Grupos; 
import java.time.LocalDate;

public class Mundial {
    private String nombre;
    private int año;
    private String pais;
    private Seleccion[] selecciones = new Seleccion[50];
    private Partido[] partidos = new Partido[50];
    private int cantSelecciones = 0;
    private int cantPartidos = 0;
    
    public Mundial(String nombre, int año, String pais) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
    }

    public void agregarSeleccion(Seleccion s) {
        if (cantSelecciones < selecciones.length) {
            selecciones[cantSelecciones] = s;
            cantSelecciones++;
        }
    }

    public boolean eliminarSeleccion(String nombre) {
        for (int i = 0; i < cantSelecciones; i++) {
            if (selecciones[i].getNombre().equals(nombre)) {
                for (int j = i; j < cantSelecciones - 1; j++) {
                    selecciones[j] = selecciones[j + 1];
                }
                selecciones[cantSelecciones - 1] = null;
                cantSelecciones--;
                return true;
            }
        }
        return false;
    }

    public boolean existeSeleccion(String nombre) {
        for (int i = 0; i < cantSelecciones; i++) {
            if (selecciones[i].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public int contarSelecciones() {
        return cantSelecciones;
    }

    public void agregarPartido(Partido p) {
        if (cantPartidos < partidos.length) {
            partidos[cantPartidos] = p;
            cantPartidos++;
        }
    }

    public boolean eliminarPartido(Partido p) {
        for (int i = 0; i < cantPartidos; i++) {
            if (partidos[i].equals(p)) {
                for (int j = i; j < cantPartidos - 1; j++) {
                    partidos[j] = partidos[j + 1];
                }
                partidos[cantPartidos - 1] = null; 
                cantPartidos--;
                return true;
            }
        }
        return false;
    }

    public int contarPartidos() {
        return cantPartidos;
    }

    public Seleccion buscarSeleccion(String nombre) {
        for (int i = 0; i < cantSelecciones; i++) {
            if (selecciones[i].getNombre().equals(nombre)) {
                return selecciones[i];
            }
        }
        return null;
    }
    public Partido[] obtenerPartidosDeSeleccion(String nombre) {
        Partido[] resultado = new Partido[50];
        int cont = 0;
        for (int i = 0; i < cantPartidos; i++) {
            if (partidos[i].getSeleccionVisitante().getNombre().equals(nombre) ||
                partidos[i].getSeleccionLocal().getNombre().equals(nombre)) {

                resultado[cont] = partidos[i];
                cont++;
            }
        }
        return resultado;
    }
    public Seleccion[] obtenerSeleccionesGrupo(Grupos grupo) {
        Seleccion[] resultado = new Seleccion[50];
        int cont = 0;

        for (int i = 0; i < cantSelecciones; i++) {
            if (selecciones[i].getGrupo() == grupo) {
                resultado[cont] = selecciones[i];
                cont++;
            }
        }
        return resultado;
    }
    public Partido[] buscarPartidosPorFecha(LocalDate fecha) {
        Partido[] resultado = new Partido[50];
        int cont = 0;
        for (int i = 0; i < cantPartidos; i++) {
            if (partidos[i].getFecha().equals(fecha)) {
                resultado[cont] = partidos[i];
                cont++;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + nombre +
               "\n Año: " + año +
               "\n Pais: " + pais +
               "\n Selecciones: " + cantSelecciones +
               "\n Partidos: " + cantPartidos;
    }
}