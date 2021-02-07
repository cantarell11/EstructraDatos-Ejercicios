//Autor cantarell11
package listadoblementeligada;


public class LISTADOBLEMENTELIGADA {

    
    public static void main(String[] args) {
        
        
        LDL l1 = new LDL();
        float x;
    
           l1.ordenar1(3);
           l1.ordenar1(4);
           l1.ordenar1(1);
           l1.ordenar1(2);
           l1.ordenar1(4);
           l1.ordenar1(5);
           l1.ordenar1(7);
           l1.ordenar1(0);
           
          
        System.out.println(l1);
        x=l1.mediana();
        System.out.println(x);
          
        System.out.println(l1);
        //l1.ordenar1(3);
        x=l1.mediana();
        System.out.println(x);
          
        System.out.println(l1);
        x=l1.mediana();
        System.out.println(x);
          
        System.out.println(l1);
        
        
        
    }
    
}
