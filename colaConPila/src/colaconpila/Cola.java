
package colaconpila;
//Autor DIEGO GABRIEL CABALLERO CANTARELL 201843326
/*LA CLASE PILA FUE RENOMBRADA PARA TENER EL MISMO NOMBRE QUE LOS NOMBRES
EN LA PLATAFORMA BLACKBOARD*/
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
