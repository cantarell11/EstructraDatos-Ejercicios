//Autor cantarell11
package listaligada;




public class Nodo {
    
     private int dato;
    private Nodo sig;
    
    public Nodo(int d){
        dato = d;
        sig = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
        
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
        System.out.println("EL VALOR DE SIGUIENTE ES:  "+sig);
    }
    public String toString(){
        return dato+"->";
    }    
    
    
    
}
