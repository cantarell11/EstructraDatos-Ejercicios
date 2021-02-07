//Autor cantarell11
package ldl;

public class LDL {
    private Nodo raiz;
    
    public LDL(){
        raiz = null;
    }
    public boolean isEmpty(){
        return raiz == null;
    }
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(raiz != null){
            nuevo.setSig(raiz);
            raiz.setAnt(nuevo);
        }
        raiz = nuevo;
    }
    public void eliminar(int dato){
        Nodo actual;
        for(actual = raiz; actual != null && actual.getDato()!= dato; actual = actual.getSig());
        
        if(actual != null){
            if(raiz == actual){
                if(actual.getSig()!= null){
                    actual.getSig().setAnt(null);
                    
                }
                raiz = actual.getSig();
               
            }
            else{
                if(actual.getSig()!= null){
                    actual.getSig().setAnt(actual.getAnt());
                }
                actual.getAnt().setSig(actual.getSig());        
            }
        }
    }
    @Override
    public String toString(){
        String cad = "";
        for(Nodo i = raiz; i != null; i = i.getSig()){
            cad+=i;
        }
        return cad;
    }
}
