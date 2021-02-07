//Autor cantarell11
package pilalistacola;




//PAQUETES USADOS
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
public class PilaListaCola {

    //USAMOS LAS CLASES QUE NOS PROVEE JAVA, ASÍ USAMOS LOS MÉTODOS DE CADA UNA DE ELLAS DIRECTAMENTE
 
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
      //VARIABLES ELEMENTALES USADAS EN EL PROGRAMA   
        int  parametro;
         int  parametroEstructura;
          int valor; 
          int contador=0;
          
         int bucle=1;
        
         
         
         
       while (bucle>0){ 
           
        contador=0;
        System.out.println("\tSELECCIONE LA OPCIÓN A REALIZAR\n");
          System.out.println("1)USO DE PILA\n2)USO DE COLA\n3)USO DE LISTA\n4)SALIR");
        
        
           parametro=teclado.nextInt();
           
           //CREACIÓN OBJETOS 
              Stack pila1=new Stack();//OBJETO PILA
               Queue <Integer> cola1=new LinkedList();//OBJETO COLA
                LinkedList lista1=new LinkedList();//OBJETO LISTA
                Collections.sort(lista1);
                    Comparator <Integer> comparador = Collections.reverseOrder();
           
           
        if(parametro==1){//PILA
          
         bucle=1;
          
          while(bucle==1){//WHILE
       System.out.print("\tUSO DE PILA SELLECIONADO\nPUEDE USAR LOS SIGUIENTES MÉTODOS\n");
       System.out.print("INGRESE TODOS LOS DATOS NECESARIOS PARA MOSTRAR PILA\n");
        System.out.println("1)APILAR\n2)DESAPILAR\n3)MOSTRAR PILA\n4)SALIR DE PILA Y VOLVER AL MENU PRINCIPAL\n");
          parametroEstructura=teclado.nextInt();
              
              
            if(parametroEstructura==1){
              System.out.println("INGRESE EL VALOR QUE DESEA GUARDAR EN LA NUEVA POSICIÓN DE LA PILA...(PUSH)");  
               valor=teclado.nextInt();
                
                     pila1.push(valor);
                     contador++;
                System.out.println("DATOS GUARDADOS EN LA COLA:  "+contador);  
                     
            
            }
            else if(parametroEstructura==2){
            System.out.println("OPCIÓN DESAPILAR ELEGIDA");  
             pila1.pop();
             contador--;
             
            
            
            
            }else if(parametroEstructura==3){
                
            if(contador>0){    
                
            System.out.println("TIENE "+contador+" GUARDADOSS EN SU PILA, LOS CUALES SON:\n");
          
          
           for(int i=0;i<contador;i++){
           System.out.println(pila1.pop());
           
           }
           contador=0;
            }else{
             System.out.println("ACTUALICE SU PILA");
            
            }
            }else if(parametroEstructura==4){
            bucle=10;
            
            }
             
          }//while
       
        
        }//PILA
        
        
        
        
        
        else if(parametro==2){//COLA
         bucle=2;
        while(bucle==2){
        System.out.print("\tUSO DE COLA SELLECIONADO\nPUEDE USAR LOS SIGUIENTES MÉTODOS\n");
          System.out.println("1)AÑADIR\n2)DESENCOLAR\n3)MOSTRAR COLA\n4)SALIR DE COLA Y VOLVER AL MENU PRINCIPAL\n");
           parametroEstructura=teclado.nextInt();
          
            if(parametroEstructura==1){
              System.out.println("INGRESE EL VALOR QUE DESEA ENCOLAR");  
               valor=teclado.nextInt();
                
                     cola1.add(valor);
                     contador++;
                System.out.println("DATOS GUARDADOS EN LA PILA:  "+contador);  
                     
            
            }
            else if(parametroEstructura==2){
            System.out.println("OPCIÓN DESAPILAR ELEGIDA");  
             cola1.remove();
             contador--;
             
            
            
            
            }else if(parametroEstructura==3){
                
            if(contador>0){    
                
            System.out.println("TIENE "+contador+" GUARDADOSS EN SU COLA, LOS CUALES SON:\n");
          
          
          
           
           while(cola1.peek()!=null){
            System.out.println(cola1.poll());
           
           }
           
           
           
           contador=0;
            }else{
             System.out.println("ACTUALICE SU COLA");
            
            }
            }
            
            
            else if(parametroEstructura==4){
            bucle=10;
            
            }
        }
        
        }//COLA
         else if(parametro==3){
          
         bucle=2;
        while(bucle==2){
        System.out.print("\tUSO DE LISTA SELLECIONADO\nPUEDE USAR LOS SIGUIENTES MÉTODOS\n");
          System.out.println("1)INSERTAR AL INICIO\n2)INSERTAR AL FINAL\n3)ORDENAR LISTA\n4)VOLTEAR LISTA\n5)MOSTRAR LISTA\n6)SALIR");
           parametroEstructura=teclado.nextInt();
          
            if(parametroEstructura==1){
              System.out.println("INGRESE EL VALOR QUE DESEA INSERTAR AL INICIO");  
               valor=teclado.nextInt();
                
                     lista1.addFirst(valor);
                     contador++;
                System.out.println("DATOS GUARDADOS EN LA LISTA:  "+contador);  
                     
            
            }
            else if(parametroEstructura==2){
            System.out.println("INGRESE EL VALOR QUE DESEA INSERTAR AL FINAL");  
             valor=teclado.nextInt();
                
                     lista1.addLast(valor);
                     contador++;
                System.out.println("DATOS GUARDADOS EN LA LISTA:  "+contador);  
             
            
            
            
            }else if(parametroEstructura==3){
                
            System.out.println("ORDENAR LISTA,SE ORDENA DE MAYOR A MENOR");  
               /*Ordenando la misma lista de mayor a menor con un comparator*/
            
         
                Collections.sort(lista1, comparador);
 
                    System.out.println(lista1); 
                
                
            }
            
            
            else if(parametroEstructura==4){
            System.out.println("VOLTEAR LISTA");  
             System.out.println("EL TAMAÑO DE LA LISTA "+ lista1.size());
           for(int i=lista1.size()-1;i>=0;i--){
            System.out.println(lista1.get(i));
            
           
            
            
           }
            }
            
           else if(parametroEstructura==5){
             System.out.println("EL TAMAÑO DE LA LISTA "+ lista1.size());
           for(int i=0;i<lista1.size();i++){
            System.out.println(lista1.get(i));
            
           
            
            
           }
            } 
            
            
             else if(parametroEstructura==6){
            bucle=10;
            
            } 
            
            
        }
        
        
        
        }
        
         else if(parametro==4){
          
        System.out.print("FUNCIONA 4\n");
        
        System.exit(0);
        }
        
         else if(parametro!=1 && parametro!=2 && parametro!=3){
          
        System.out.print("OPCIÓN SELECCIONADA NO VÁLIDA\n");
        
        
        }
        
       }
        
        
        
        
        
        
        
        
        
        
    }
    
}
