package Mundial;
import Selecciones.Seleccion;
import Partidos.Partido;
import java.util.Date;

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
        selecciones[cantSelecciones] = s;
        cantSelecciones++;
    }

    public boolean eliminarSeleccion(String nombre) {

        for (int i = 0; i < cantSelecciones; i++) {
            if (selecciones[i].getNombre().equals(nombre)) {

                for (int j = i; j < cantSelecciones - 1; j++) {
                    selecciones[j] = selecciones[j + 1];
                }

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
        partidos[cantPartidos] = p;
        cantPartidos++;
    }

    public boolean eliminarPartido(Partido p) {
        for (int i = 0; i < cantPartidos; i++) {
            if (partidos[i].equals(p)) {

                for (int j = i; j < cantPartidos - 1; j++) {
                    partidos[j] = partidos[j + 1];
                }
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
        if (partidos[i].getVisitante().getNombre().equals(nombre) ||
            partidos[i].getLocal().getNombre().equals(nombre)) {

            resultado[cont] = partidos[i];
            cont++;
        }
    }
    return resultado;
    }
    
    public Seleccion[] obtenerSeleccionesGrupo(String grupo) {
    Seleccion[] resultado = new Seleccion[50];
    int cont = 0;

    for (int i = 0; i < cantSelecciones; i++) {
        if (selecciones[i].getGrupo().equals(grupo)) {
            resultado[cont] = selecciones[i];
            cont++;
        }
    }

    return resultado;
    }
    public Partido[] buscarPartidosPorFecha(Date fecha) {
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