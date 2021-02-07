//Autor cantarell11
package listaligada;


public class LSL {
    
    
    
    
      private Nodo raiz;
      
    int tamaño=0;
    
    public LSL(){
        raiz = null;
    }
    
    public boolean isEmpty(){
        return raiz == null;
    }
    public void insertar(int dato){
        System.out.println("0 VALOR DE DATO  "+dato);
       
        
        Nodo nuevo = new Nodo(dato);
        System.out.println("1 VALOR DE RAIZ  "+raiz);
        System.out.println("2 VALOR DE NUEVO  "+nuevo);
        if(raiz != null)
            nuevo.setSig(raiz);
        System.out.println("3 VALOR DE NUEVO  "+nuevo);
        raiz = nuevo;
        System.out.println("4 VALOR DE RAIZ  "+raiz);
         System.out.println("  FINAL  ");
    }
    
    public Nodo buscar(int dato){
        for(Nodo i = raiz; i!= null; i = i.getSig()){
            System.out.println("EL VALOR BUSCADO ES:  "+ i);
            if(i.getDato()== dato){
                return i;
            }
        }
        return null;
    }
     public Nodo buscarnodo(Nodo nodo){
        for(Nodo i = raiz; i!= null; i = i.getSig()){
            System.out.println("SE ESTA BUSCANDO EL NODO"+ i);
            if(nodo==i){
                return i;
            } else {
            }
        }
        return null;
    }
  
    
    private Nodo buscarAnterior(Nodo actual){
        Nodo anterior = null;
        if(actual != null){
            for (Nodo i = raiz; i != actual; i = i.getSig()){
                anterior = i;
            }
        }
        return anterior;        
    }
    
    public void eliminar(int dato){
        Nodo actual = buscar(dato);
        Nodo anterior = buscarAnterior(actual);
        
        if(actual != null){
            if(anterior == null){
                raiz = raiz.getSig();
            }
            else{
                anterior.setSig(actual.getSig());
            }
        }
    
    }
    
    
    
    
    //INSERTAR EN ORDEN
 public void ordenar(int dato){
     Nodo nuevo= new Nodo(dato);
     Nodo reco1;
     Nodo reco2;
     
     if(raiz==null){
      
       nuevo.setSig(raiz);
        raiz = nuevo;
     }
     else
     {
         reco1=raiz;
         while(reco1!=null){
          reco2=reco1.getSig();
          //saber si debe ir al inicio de la lista
          if(nuevo.getDato()<=reco1.getDato()){
              nuevo.setSig(raiz);
              raiz=nuevo;
              break;
              
          }
          //saber si debe ir al final de la lista
          else{
            if(nuevo.getDato()>reco1.getDato()&&reco2==null){
               reco1.setSig(nuevo);
               nuevo.setSig(null);
               break;
            }
            else
                 {
                //saber si debe ir entre dos nodos
               if(reco1.getDato()<nuevo.getDato()&&reco2.getDato()>=nuevo.getDato())
               {
                   reco1.setSig(nuevo);
                   nuevo.setSig(reco2);
                   break;
                   
               }
               //cerrar ciclo(comprobara todas las posibilidades sltando de valor)
               else
                    {
                   
                   reco1=reco1.getSig();
                     }
                  }
                }
          
          
          
         }
         
     }
     tamaño++;  
    }
  
  

    
    //ELIMINAR NODO
   public void remover(){
        int j=tamaño;
        for(Nodo i = raiz; i!= null; i = i.getSig()){
            
            if(j%2==0){
       
         Nodo actual = buscarnodo(i);
        Nodo anterior = buscarAnterior(actual);
        
        if(actual != null){
            if(anterior == null){
                raiz = raiz.getSig();
            }
            else{
                anterior.setSig(actual.getSig());
            }
        }
        }
            j--;
     } 
        
    }
    
    
    
    
    
    @Override
    public String toString(){
        Nodo i;
        String cad = "";
        for (i = raiz; i != null; i = i.getSig()) {
            cad+=i;
        }
        return cad;
    }
    
}
