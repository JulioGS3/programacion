/*16. Programa que calcule o factorial dun número introducido por teclado. O factorial é o producto do propio
número por todos os enteiros menores que el. Ex. Factorial de 5! = 5 * 4 * 3 * 2 = 120. */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio16 {
public static void main(String[] args) {
    
    Scanner escaner= new Scanner(System.in);
    System.out.println("introduce un enteiro");
    int numero= escaner.nextInt();
    int resultado=1;
    
    
        for (int i = numero; i>1 ; i--){
            
            resultado=resultado*i;

           
           System.out.println(resultado);
        
            }
          
    


}    
}
