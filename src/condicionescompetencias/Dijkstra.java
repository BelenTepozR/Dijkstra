package condicionescompetencias;
public class Dijkstra {
    private int k;
    private boolean[] b, c;

    Dijkstra(){
        this.k = 0;
         b = new boolean[4];
         c = new boolean[4];
        for(int i = 0; i < 4; i ++){
            b[i] = true; c[i] = true;
        }
    }

    public int getK(){
        return k;
    }

    public void setK(int k){
        this.k = k;
    }

    public boolean[] getB(){
        return b;
    }

    public void setB(boolean b, int pos){
        this.b[pos] = b;
    }

    public boolean[] getC(){
        return c;
    }

    public void setC(boolean c, int pos){
        this.c[pos] = c;
    }
    
}
