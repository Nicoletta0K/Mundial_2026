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
    
public class Partido {
      private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    public boolean esEmpate() {
        return this.golesLocal == this.golesVisitante;
    }
    public int calcularDiferenciaGoles() {
        return Math.abs(this.golesLocal - this.golesVisitante);
    }
    public int totalGoles() {
        return this.golesLocal + this.golesVisitante;
    }
    public boolean ambosAnotaron() {
        return this.golesLocal > 0 && this.golesVisitante > 0;
    }
    public String obtenerGanador() {
        if (this.golesLocal > this.golesVisitante) {
            return "Ganador: " + this.equipoLocal;
        } else if (this.golesVisitante > this.golesLocal) {
            return "Ganador: " + this.equipoVisitante;
        } else {
            return "El partido terminó en Empate";
        }
    }
}
}
