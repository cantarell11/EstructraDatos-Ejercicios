//Autor cantarell11
package listadoblementeligada;


public class LDL {
    
       private Nodo raiz;
    private Nodo fin=null;
    int tamaño=0;
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
        tamaño++;
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
    
    
    
    
        public void eliminarNodo(Nodo i){
       Nodo actual;
     
        
        for(actual = raiz; actual != null && actual!= i; actual = actual.getSig());
        
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

     //INSERTAR ORDEN DESCENDENTE
     public void ordenar1(int dato){
     Nodo nuevo= new Nodo(dato);
     Nodo reco1;
     Nodo reco2;
     
     if(raiz==null){
      
       
        raiz = nuevo;
     }
     else
     {
         reco1=raiz;
         while(reco1!=null){
          reco2=reco1.getSig();
          //SABER SI VA AL FINAL DE LA LISTA
          if(nuevo.getDato()>=reco1.getDato()){
              nuevo.setSig(raiz);//ASIGNAMOS DIRECCION DE  RAIZ AL NUEVO DATO
              raiz.setAnt(nuevo);//DIREECION ANTEIOR A RAIZ LE ASIGNAMOS NUEVO
              raiz=nuevo;//DIRECCION RAIZ =NUEVO
              break;
              
          }
          
          else{
              //SABER SI VA AL INICIO DE LA LISTA
            if(nuevo.getDato()<reco1.getDato()&&reco2==null){//
            Nodo aux = raiz;//CREA NODO AUXILIAR CON DIRECCION EN RAIZ
            while(aux.getSig() != null){
            aux = aux.getSig();//COLOCA A AUX AL FINAL DE LA LISTA EN EL ULTIMO NODO
           
            }
            aux.setSig(nuevo);//AUX EN LA DIRECCION SIG COLOCARA EL NUEVO NODO
            nuevo.setAnt(aux); //LA DIRECCION ANTERIOR A NUEVO TENDRA A AUXILIAR 
            reco1.setSig(nuevo);//RECO1 TENDRA LA DIRECCION SIG DE DONDE SE COLOCO EL DATO NUEVO
            
            
           
               break;
            }
            else
                 {
                //SABER SI VA ENTRE NODOS
               if(reco1.getDato()>nuevo.getDato()&&reco2.getDato()<=nuevo.getDato())
               {
                    
                   
                   reco1.setSig(nuevo);//LA DIRECCION SIG DE RECO1 TENDRA LA DIRECCION NUEVA
                   nuevo.setSig(reco2);//LA DIRECCION SIG A NUEVO LE ASIGNAMOS RECO2(PARA AUX)
                   nuevo.setAnt(reco1.getAnt());//LA DIRECCION ANTERIOR A NUEVO SERA LA ANTERIOR DE RECO1
                   break;
                   
               }
               //cerrar ciclo(comprobara todas las posibilidades sltando de valor)
               else
                    {
                   
                   reco1=reco1.getSig();//MOVER EL AUXILIAR Y RECORRER
                     }
                  }
                }
          
          
          
         }
         
     }
     tamaño++; //EXTRA PARA MEDIANA 
    }
  

  //OBTENER MEDIANA
     public float  mediana(){
         float s=0,s1=0,s2=0;
         int j=0;
         int med;
         //NODOS IMPARES
        if(tamaño%2==1){
            med=(tamaño/2)+1;
            for(Nodo i = raiz; i!= null; i = i.getSig()){
            j++;
              if(j==med){
                s=i.getDato();
                }
            }
        
        return s;
        }//NODOS PARES
         else{
             j=tamaño;
           int dat=(tamaño/2);//nodo en la mitad
              for(Nodo i = raiz; i!= null; i = i.getSig()){//BUSCAR VALOR 1
            j--;
            if(j==dat){
                //ELIMINAR NODO
             //SALVAR VALOR PARA MEDIANA
             s1=i.getDato();
            eliminarNodo(i);
            tamaño=tamaño-1;
              }
              }
              j=tamaño+1;
            for(Nodo i = raiz; i!= null; i = i.getSig()){//BUSCAR VALOR 2
            j--;
            if(j==dat){
               //ELIMINAR NODO
             //SALVAR VALOR PARA MEDIANA 
             s2=i.getDato();
            eliminarNodo(i);
            tamaño=tamaño-1;
              }
              }
              s=(s1+s2)/2;//CALCULAR MEDIANA
        }
             
     return s;
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
