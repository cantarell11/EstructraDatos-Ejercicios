//Autor cantarell11
package colaconpila;
import java.util.Scanner;
public class ColaConPila {

    
   
   public static void main(String[] args){
        
   Scanner teclado = new Scanner(System.in);
   int opc;
   
   Cola c=new Cola();
    do{
        System.out.println("Menu de Cola");
        System.out.println("1. Agregar a la Cola");
        System.out.println("2. Eliminar dato de la Cola");
        System.out.println("3. Verificar si esta vacía");
        System.out.println("4. Salir");
        System.out.println("Teclee la opcion");
        opc = teclado.nextInt();

        switch(opc)
        {
            case  1: 
                  System.out.println("Ingrese dato a insertar");
                  c.encolar(teclado.nextInt());
              break;

              case 2: 
                {
                    c.desencolar();
                }
              break;

              case 3:
                  
                  System.out.println("EL ESTADO DE LA COLA VACIA ES:  "+c.isEmpty());
                  
                  
              break;

              case 4:
                  System.out.println("Saliendo de la implementación de la Cola....");
                  System.exit(0);

              default:
                  System.out.println("Error\nOpcion invalida");
                
        }
        }while(opc!=4);
    }
    
   
    
}
