/*
 OCTAVIO HERNANDEZ ROMERO
CESAR DANIEL FLORES FREEMAN
DIEGO GABRIEL CABALLERO CANTAREL
 */
package com.mycompany.pilaestatica;

/**
 *
 * @author canta
 */
import java.util.Scanner;
public class Main {
    
     public static void main(String[] args) {
        
   Scanner teclado = new Scanner(System.in);
   int opc;
   System.out.println("\tBIENVENIDO AL MENÚ DE PILA");
   System.out.println("INGRESE TAMAÑO DE LA PILA:");
   int t=teclado.nextInt();
   Pila p=new Pila(t);
    do{
    
      System.out.println("\t*****MENU DE PILA*****");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Desplegar Pila");
      System.out.println("4. Salir");
      System.out.println("INGRESE LA OPCIÓN");
      opc = teclado.nextInt();

      switch(opc){
          case  1: 
          if(p.llena()){
            System.out.println("\tPILA LLENA\n");
          }
           else
          {System.out.println("INGRESE DATO\n");
            p.apilar(teclado.nextInt());
          }
            break;
            
            case 2: 

              p.desapilar();
            break;
            
            case 3:
                p.mostrar();
            break;
            
            case 4:
            System.out.println("Adios");
             System.exit(0);
            
            default:
              System.out.println("Error\nOpcion invalida");
              //Isqruaq
        }
    }while(opc!=4);
}

    
    
    
    
    
    
}
