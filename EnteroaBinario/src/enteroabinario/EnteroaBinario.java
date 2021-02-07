//DIEGOGABRIEL CABALLERO CANTARELL*
//201843326
package enteroabinario;

import java.util.Stack;
import java.util.Scanner;
public class EnteroaBinario {

   
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        Stack pila1=new Stack();//PASO #1 PILA VACÍA, AL SER DINÁMICA,EN ESTA GUARDAREMOS LOS RESTOS.
        int numero;
        int resto=0;
        Object resto2;
        int cociente=0;
        int contador=0;
        
        System.out.println(" \tPROGRAMA QUE PERMITE REPRESENTAR DE FORMA BINARIO UN NÚMERO ENTERO POSITIVO\n");
         System.out.println("INGRESE EL NUMERO ENTERO POSITIVO");
         numero=teclado.nextInt();
         if(numero>0){//SE VÁLIDA QUE SEA POSITIVO
         while(numero!=0){//PASO #2 MIENTRASS NUMERO!=0*****
         System.out.println("NÚMERO INGRESADO ");
         resto=numero%2;//PASO #3 CALCULAMOS RESTO AL DIVIDIR ENTRE 2*****
          System.out.println("SU RESTO AL SER DIVIDIDO ENTRE 2 ES:  "+resto);
          pila1.push(resto);//PASO #4 PONEMOS RESTO EN LA PARTE SUPERIOR DE LA PILA*****
          contador++;
          cociente=numero/2;
          System.out.println("SU COCIENTE AL SER DIVIDIDO ENTRE 2 ES:  "+cociente);
          numero=cociente;//PASO #5 SUSTITUIMOS COCIENTE ENTERO DE NÚMERO DIVIDIDO ENTRE 2*****
           
          
          
          
         }
 
         
         if(contador>0){    
                
            System.out.println("TIENE "+contador+" DATOS GUARDADOSS EN SU PILA, LOS CUALES SON EN BINARIO:\n");
          
          
           for(int i=0;i<contador;i++){
           System.out.println(pila1.pop());
           
           }
           contador=0;
            }else{
             System.out.println("ACTUALICE SU PILA");
            
            }
         
         
         
         
         
        while(!pila1.empty()){//PASO #6 MIENTRAS PILA DE RESTOS NO ESTE VACÍA*****
         resto2=pila1.peek();// PASO #7 RECUPERAMOS RESTO DE LA PARTE SUPERIOR DE LA PILA DE RESTOS*****
          pila1.pop();//PASO #8 ELIMINAMOS RESTO DE LA PARTE SUPERIOR DE LA PILA DE RESTOS*****
           pila1.push(resto2);//PASO #9 AÑADIMOS RESTO A LA SALIDA GENERADA*****
         
         
         }
        
        
        
        //PARTE CREADA PARA IMPRESIÓ DEL NÚMERO
         
        if(contador>0){    
                
            System.out.println("TIENE "+contador+" GUARDADOSS EN SU PILA, LOS CUALES SON:\n");
          
          
           for(int i=0;i<contador;i++){
           System.out.print(pila1.pop());
           
           }
           contador=0;
            }else{
             System.out.println("ACTUALICE SU PILA");
            
            }
          
         
         }
         else{
         System.out.println("NÚMERO INGRESADO NO VÁLIDO,DEBE SER POSITIVO,POR FAVOR, EJECUTE DE NUEVO CON UN NÚMERO POSITIVO");
         
         
         }
    }
         
    
}
