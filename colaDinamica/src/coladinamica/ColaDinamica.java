//Autor cantarell11
package coladinamica;

import java.util.Scanner;
public class ColaDinamica {

     public static void main(String[] args) {
        
   Scanner teclado = new Scanner(System.in);
   int opc;
   
   Cola p=new Cola();
    do{
    
      System.out.println("Menu de Cola");
      System.out.println("1. Agregar");
      System.out.println("2. Eliminar");
      System.out.println("3. Desplegar Cola");
      System.out.println("4. Salir");
      System.out.println("Teclee la opcion");
      opc = teclado.nextInt();

      switch(opc){
          case  1: 
                System.out.println("Ingrese dato a insertar");
                p.insertar(teclado.nextInt());
            break;
            
            case 2: 
            {
                if(p.estaVacia()){
                    System.out.println("Cola Vacia");
                }else{
                    p.sacar();
                }
                
                //p.sacar();
                //Esta parte de codigo la modifique para la excepcion
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
