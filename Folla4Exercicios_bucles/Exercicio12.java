/*12. Programa que pida 10 números double e mostre o mínimo e o máximo. */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
    
    Scanner escaner= new Scanner(System.in);
    System.out.println("introduce 10 numeros");
    double numero=escaner.nextInt();
    
    double gardarMax=numero;
    double gardarMin=numero;

        for(double i=0; i<9; i++){

            numero=escaner.nextInt();

            if (numero>gardarMax){
            gardarMax= numero;
            }
            if(numero<gardarMin){
            gardarMin=numero;
            }
            }
   System.out.println("o maximo e"+gardarMax);
   System.out.println("o minimo e"+gardarMin);



}
 
}
