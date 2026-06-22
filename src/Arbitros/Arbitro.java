package Arbitros;

import Personas.Persona;
import java.time.LocalDate;

public class Arbitro extends Persona {
    private String categoria;

    public Arbitro(String nombre, String nacionalidad, LocalDate fechaNacimiento, String categoria) {
        super(nombre, nacionalidad, fechaNacimiento);
        this.categoria = categoria;
    }

    public String getCategoria() { 
        return categoria; }
    public void setCategoria(String categoria) {
        this.categoria = categoria; }
}