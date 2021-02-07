//Autor cantarell11
package piladinamica;



public class Pila {
    
    
    
    
     Nodo cima;
    int tamaño;
 
    public boolean estaVacia() {
        return cima == null;
    }
 
    public void insertar(Character elemento) {
        Nodo nuevo = new Nodo(elemento);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamaño++;
    }
 
    public Character sacar() {
        Character auxiliar = cima.getElemento();
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
