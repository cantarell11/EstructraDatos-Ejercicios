
package com.mycompany.pilaestatica;


public class Pila {
    
 int tamaño;
   int vector[];
   int cima;
   
    //Conctructor
   public Pila(int tamaño){
       this.tamaño=tamaño;
       vector= new int[tamaño];
       cima=-1;
   }
    public boolean vacia(){
        if(cima==-1)
            return true;
        else
            return false;
    }
    public boolean llena(){
        if(cima==tamaño-1)
            return true;
        else
            return false;
    }
    public void apilar(int e){
        if(llena())
            System.out.println("PILA LLENA");
        else{
            cima=cima+1;
            vector[cima]=e;
        }
    }
    public void desapilar(){
        if(vacia())
         System.out.println("PILA VACIA");
        else
            cima=cima-1;
    }
    public void mostrar(){
        if(vacia())
            System.out.println("PILA VACIA");
        else{
            System.out.println("---------PILA---------");
            for(int i=cima;i>=0;i--){
                System.out.println(vector[i]);
            }
            System.out.println("------------------------");
        }
    }   
    
    
    
    
}
