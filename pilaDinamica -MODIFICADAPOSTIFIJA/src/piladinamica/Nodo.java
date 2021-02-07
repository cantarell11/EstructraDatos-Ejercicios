
package piladinamica;


public class Nodo {
    
    
    
    
     private Character elemento;
    private Nodo siguiente;
 
    public Nodo(Character elemento) {
       this.elemento=elemento;
        siguiente = null;
    }

    public Character getElemento() {
        return elemento;
    }

    public void setElemento(Character elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
