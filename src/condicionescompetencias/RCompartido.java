package condicionescompetencias;
import java.util.ArrayList;

public class RCompartido {
    private String datoCompartido;
    private Dijkstra d;
    
    RCompartido(Dijkstra dijkstra){
        this.datoCompartido = "";
        this.d = dijkstra;
    }
    
    public String getDatoCompartido(){
            return datoCompartido;
    }
      
    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }

    public Dijkstra getD() {
        return d;
    }

    public void setD(Dijkstra d) {
        this.d = d;
    }
}
