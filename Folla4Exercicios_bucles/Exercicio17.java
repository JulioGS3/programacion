/*17. Fai un programa que faga o producto de 2 números enteiros introducidos por teclado empregando só a
operación suma */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio17 {
public static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce 2 numeros");
    int num1= entrada.nextInt();
    int num2= entrada.nextInt();

    int suma=0;

        for(int i = 1; i <= num2; i++){

          suma= suma+num1;

    
        }
   System.out.println(suma);
      


}    

}