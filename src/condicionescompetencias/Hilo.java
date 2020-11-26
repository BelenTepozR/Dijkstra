package condicionescompetencias;
import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private boolean pausado = false;   
    private boolean corriendo = true;   
    private int numHilo0;
    private final static int ini = 100;
    private final static int fin = 200;
    private boolean dead;
    private Dijkstra d;
    
    Hilo(JTextArea area, RCompartido rc, int n, Dijkstra d){
        this.area = area;
        this.rc = rc;
        this.setName("Perrito" + n);
        this.numHilo0 = n;
        this.d = d;
    }
   
    @Override
    public void run(){
            int numHilo = numHilo0 -1;
                try{
                    while(true){
                              int j, k = 0;
                d.setB(false, numHilo);
                do{
                    d.setC(true, numHilo);
                    if(d.getB()[k])
                        k = numHilo;
                }while(k != numHilo);
                d.setC(false, numHilo);
                for(j = 0; j< 4; j++){
                    if(j != numHilo && !d.getC()[j])
                            break;
                }
                if(!d.getB()[numHilo] && !d.getC()[numHilo]){
                        d.setB(true, numHilo);
                        d.setC(true, numHilo);
                        Sc(this.getName());
                }

                    
                    
                if(isDead()){
                                area.append(rc.getDatoCompartido()+" Me matan ... \n");
                                stop(); 
                        }  
                    int inic = (int) ( Math.random()*10);
                        sleep((int) (inic +Math.random() * fin)); 
                

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    private void Sc(String name){
              rc.setDatoCompartido(name);
              area.append(rc.getDatoCompartido()+": entra... \n"); 
    }
     public boolean isDead() {
                return dead;
        }

        public void setDead(boolean dead) {
                this.dead = dead;
        }

       
}
