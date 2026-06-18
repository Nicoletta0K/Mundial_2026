package Mundial;
import Selecciones.Seleccion;


public class Mundial extends Seleccion{
    protected String nombre;
    protected double año;
    protected String pais;
    protected String seleccion;
    protected String partidos;

    public String getNombre() {
        return nombre;
    }

    public double getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public String getPartidos() {
        return partidos;
    }

    public Mundial(String nombre, double año, String pais, String seleccion, String partidos) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
        this.seleccion = seleccion;
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return 
               "\n Nombre: "+nombre+
               "\n Año: "+año+ 
               "\n Pais: "+pais+
               "\n Seleccion: "+seleccion+
               "\n Partidos: "+partidos;
    }
    
}
