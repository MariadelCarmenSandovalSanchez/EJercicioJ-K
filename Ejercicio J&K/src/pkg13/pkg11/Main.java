/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.pkg11;

/**
 *
 * @author ms3240
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] a=new int[10];
       for(int i=0;i<=9;i++)
           a[i]=(int)(Math.random()*50);
       Arbol x = new Arbol();
       for(int i=0;i<10;i++)
           x.alta(a[i]);
       System.out.println("LOS DATOS SON : ");
       x.imprimir();
       System.out.println("\n NUMERO MAYOR: ");
       x.mayor();
       
       //EJERCICIO 13.11
       
       System.out.println("LA SUMA DE NUMEROS DE IZQUIERDA: ");
       x.sumaizquierda();
       System.out.println("SUMA DE NUMEROS DE DERECHA: ");
       x.sumaderecha();
   
       //EJERCICIO 13.12
          System.out.println("CANTIDAD DE NODOS HOJA: "+x.cantidadNodosHoja());
    }
    
}
