
package piladinamica;

import java.util.Scanner;
public class PilaDinamica {

    
   public static void main(String[] args){
        
   Scanner teclado = new Scanner(System.in);
   int opc;
   
   Pila p=new Pila();
    do{
        System.out.println("Menu de Pila");
        System.out.println("1. Agregar");
        System.out.println("2. Eliminar cima");
        System.out.println("3. Desplegar Pila");
        System.out.println("4. Salir");
        System.out.println("Teclee la opcion");
        opc = teclado.nextInt();

        switch(opc)
        {
            case  1: 
                  System.out.println("Ingrese dato a insertar");
                  p.insertar(teclado.nextInt());
              break;

              case 2: 
                {
                    if(p.estaVacia())
                    {
                        System.out.println("Pila vacia");//1.-
                    }
                    else
                        p.sacar();
                }
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
