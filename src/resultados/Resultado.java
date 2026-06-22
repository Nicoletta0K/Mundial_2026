package resultados;
public class Resultado {
    protected String seleccionGanadora;
    protected String marcador;
    
    public Resultado (String seleccionGanadora, String marcador){
       this. seleccionGanadora = seleccionGanadora;
       this.marcador = marcador;
  }
    public Resultado(){
    this.seleccionGanadora = "";
     this.marcador = "";
    } 
}
