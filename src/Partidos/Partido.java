package Partidos;
import selecciones.Seleccion;
import Arbitros.Arbitro;
import java.time.LocalDate;
import java.time.LocalTime;
import resultados.Resultado;

public class Partido {
    private Seleccion seleccionLocal;
    private Seleccion seleccionVisitante;
    private String estadio;
    private LocalDate fecha;
    private LocalTime hora;
    private Arbitro arbitros[];
    private int cantidadArbitros;
    private Resultado resultado;

    public Partido(Seleccion seleccionLocal, Seleccion seleccionVisitante, String estadio, LocalDate fecha, LocalTime hora) {
        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;
        this.arbitros = new Arbitro[10];
        this.cantidadArbitros = 0;
        this.resultado = new Resultado();
    }

    public void agregarArbitro(Arbitro arbitro) {
        if (cantidadArbitros < arbitros.length) {
            arbitros[cantidadArbitros] = arbitro;
            cantidadArbitros++;
        }
    }

    public void eliminarArbitro(Arbitro arbitro) {
        for (int i = 0; i < cantidadArbitros; i++) {
            if (arbitros[i] == arbitro) {
                arbitros[i] = arbitros[cantidadArbitros - 1];
                arbitros[cantidadArbitros - 1] = null;
                cantidadArbitros--;
                break;
            }
        }
    }

    public Arbitro buscarArbitroPorNombre(String nombre) {
        for (int i = 0; i < cantidadArbitros; i++) {
            if (arbitros[i].getNombre().equalsIgnoreCase(nombre)) {
                return arbitros[i];
            }
        }
        return null;
    }

    public boolean estaRegistrado(Arbitro arbitro) {
        for (int i = 0; i < cantidadArbitros; i++) {
            if (arbitros[i] == arbitro) {
                return true;
            }
        }
        return false;
    }

    public int contarArbitros() {
        return cantidadArbitros;
    }

    public Seleccion getSeleccionLocal() { return seleccionLocal; }
    public Seleccion getSeleccionVisitante() { return seleccionVisitante; }
    public String getEstadio() { return estadio; }
    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public Arbitro[] getArbitros() { return arbitros; }
    public Resultado getResultado() { return resultado; }

    public void setSeleccionLocal(Seleccion seleccionLocal) { this.seleccionLocal = seleccionLocal; }
    public void setSeleccionVisitante(Seleccion seleccionVisitante) { this.seleccionVisitante = seleccionVisitante; }
    public void setEstadio(String estadio) { this.estadio = estadio; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public void setResultado(Resultado resultado) { this.resultado = resultado; }

    public Object getVisitante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getLocal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getVisitante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}