
package colaconpila;


public class Pila {
    
      
     Nodo cima;
    int tamaño=0;
 
    public boolean isEmpty() {
        return cima == null;
    }
 
    public void push(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamaño++;
    }
 
    public int pop() {
       
        int auxiliar = cima.getElemento();
        cima = cima.getSiguiente();
        tamaño--;
        
       
        return auxiliar;
    }
     
    public void mostrar() {
        Nodo recorre=cima;
        while(recorre!=null) {
            System.out.print("->[" + recorre.getElemento() + "]"+"\n");
            recorre = recorre.getSiguiente();
        }
    }
    
    
    
}
