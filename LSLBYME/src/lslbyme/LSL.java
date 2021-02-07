
package lslbyme;


public class LSL {
    
    private Nodo raiz;
    int tamaño=0;
    
    public boolean isEmpty(){
        return raiz==null;
    
    }
    
    public void insertar(int dato){
        Nodo nuevo=new Nodo(dato);
        
        if(raiz !=null)
            nuevo.setSig(raiz);
        raiz=nuevo;
      
    }
    
    
    
    
    
}
