/*13. Calcula o número de cifras que ten un enteiro introducido por teclado, empregando un bucle que vaia
dividindo por 10. */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
    
    Scanner escaner= new Scanner(System.in);
    System.out.println("introduce un numero enteiro");
    int numero= escaner.nextInt();
    int contador=0;

         while(numero>0){

        numero= numero/10;
        contador++;
         }

    System.out.println(contador);


}    
}
