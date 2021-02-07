//Autor cantarell11
package listadoblementeligada;


public class Nodo {
    
     private int dato;
    private Nodo ant;
    private Nodo sig;
    
    public Nodo(int dato){
        this.dato = dato;
        ant = sig = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    public String toString(){
        return "<-  "+dato+"  ->";
    } 
    
    
    
}
