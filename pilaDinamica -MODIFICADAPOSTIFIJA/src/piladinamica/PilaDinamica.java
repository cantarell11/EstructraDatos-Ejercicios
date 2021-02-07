//Autor cantarell11
package piladinamica;

import java.util.Scanner;
public class PilaDinamica {

    
   public static void main(String[] args){
        
   Scanner teclado = new Scanner(System.in);
   int opc;
   String cadena="";
   int longitud;
   int cPila=0;
   int cCola=0;
   
   Pila P=new Pila();//ENTRADA
   Cola C2=new Cola();//ENTRADA
   Cola C=new Cola();//TEMPORAL
   String temporal="";
  
   
    do{
        System.out.println("Menu de Pila");
        System.out.println("1. Agregar");
       // System.out.println("2. Eliminar cima");
        System.out.println("2. Desplegar Pila y cola");
        System.out.println("3. Salir");
        System.out.println("Teclee la opcion");
        opc = teclado.nextInt();

        switch(opc)
        {
            case  1: 
                  System.out.println("Ingrese cadena ");
                  teclado.nextLine();
                  cadena=teclado.nextLine();
                  System.out.println("LA CADENA ES: "+cadena);
                  longitud=cadena.length();
                  for(int i=0;i<longitud;i++){//INICIO FOR
                     // cadena.charAt(i);
                      //System.out.println("CARACTER EN "+i+"ES"+cadena.charAt(i));
                      
                      if(cadena.charAt(i)!=' '){
                      if(cadena.charAt(i)>=48 && cadena.charAt(i)<=57 || cadena.charAt(i)>=65 && cadena.charAt(i)<=90 || cadena.charAt(i)>=97 && cadena.charAt(i)<=122 ){
                      C.insertar(cadena.charAt(i));
                      cCola++;
                      }
                      /*
                       if(cadena.charAt(i)>=65 && cadena.charAt(i)<=90){
                      C.insertar(cadena.charAt(i));
                      cCola++;
                      
                      
                      
                      }
                       if(cadena.charAt(i)>=97 && cadena.charAt(i)<=112){
                      C.insertar(cadena.charAt(i));
                      cCola++;
                      
                      
                      
                      }*/
                      
                      else if(cadena.charAt(i)==61 || cadena.charAt(i)==43 || cadena.charAt(i)==45 || cadena.charAt(i)==47 || cadena.charAt(i)==42){
                      
                      P.insertar(cadena.charAt(i));
                      cPila++;
                      }
                  
                      }
                      else{//ESPACIO DETECTADO
                          
                          for(int j=cCola;i<longitud;i++){
                          
                          System.out.println("CHAR ES: "+i);
                          
                          
                          }
                          
                      
                      
                      }//FIN ESPACIO DETECTADO
                      
                      
                  }//FIN FOR
                  
                  for(int i=0;i<cCola;i++){
                      Character a=C.sacar();
                  C2.insertar(a);
                  
                  }
                  for(int i=0;i<cPila;i++){
                      Character a=P.sacar();
                  C2.insertar(a);
                  
                  }
                  
                  
                  
                  
                  
                  
                  //p.insertar(teclado.nextInt());
                  
              break;

             /* case 2: 
                {
                    if(p.estaVacia())
                    {
                        System.out.println("Pila vacia");//1.-
                    }
                    else
                        p.sacar();
                }
              break;
                    */
              case 2:
                  System.out.println("MOSTRANDO PILA");
                  P.mostrar();
                  System.out.println("MOSTRANDO COLA");
                  C.mostrar();
                  System.out.println("MOSTRANDO FINAL");
                  C2.mostrar();
              break;

              case 3:
                  System.out.println("Adios");
                  System.exit(0);

              default:
                  System.out.println("Error\nOpcion invalida");
                //Isqruaq
        }
        }while(opc!=3);
    }
    
}
