
package colaconpila;
//Autor cantarell11

public class Cola {
    
        Pila unicaPila;
       
	 public Cola(){
	   unicaPila=new Pila();
	    }        
    public void encolar(int dato){  
         unicaPila.push(dato);
      
    }
    public int desencolar(){
    Integer retorno=null;
    if(unicaPila.isEmpty()){
                        retorno=null;
                        System.out.println("Cola vacia");//1.-
                    }
    else{         
        if(!unicaPila.isEmpty()){
                    
                        System.out.println("SACANDO DATO");//1.-
                        retorno=unicaPila.pop();
                       // p.sacar();
                        
                    }
                   
    }
    return retorno;
    }
    public boolean isEmpty(){
    return unicaPila.isEmpty();
    
    } 
}
