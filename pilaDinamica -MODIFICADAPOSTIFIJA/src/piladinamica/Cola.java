//Autor cantarell11
package piladinamica;


public class Cola {
    
    
      
    int tamaño;
    Nodo inicio, fin;
 
    public Cola() {
        inicio = fin = null;
    }
 
    public boolean estaVacia() {
        return inicio == null;
    }
 
    public void insertar(Character elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        tamaño++;
    }
 
    public Character sacar() {
        //NullPointerException, solo verificar que si el objeto ya se creo (Cola)
        Character auxiliar = inicio.getElemento();
        inicio = inicio.getSiguiente();
        tamaño--;
        return auxiliar;
    }
 
    public void mostrar() {
        Nodo aux = inicio;
        
        System.out.println();
        while (aux != null) {
            System.out.print("->[" + aux.getElemento() + "]"+"\n");
            aux = aux.getSiguiente();
        }
                
        
    }
 
    public int inicioCola() {
        return inicio.getElemento();
    }
 
    public int tamañoCola() {
        return tamaño;
    } 
    
    
    
    
}
