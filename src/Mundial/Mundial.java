package Mundial;
public class Mundial {

    private String nombre;
    private int año;
    private String pais;

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }
    public Mundial(String nombre, int año, String pais) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
               "\nAño: " + año +
               "\nPais: " + pais;
    }
}