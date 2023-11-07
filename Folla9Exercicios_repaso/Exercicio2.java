/*2. Programa que vaia pedindo números repetidamente e mostra o máximo dos seus divisores
distintos del mesmo, e indique tamén se o número inicial é primo. Remata cando o número
introducido é o 0, ou cando o máximo dos divisores foi o 5 */

package Folla9Exercicios_repaso;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    int divisor = 0;

    System.out.println("mete un numero");

    int num = entrada.nextInt();


    while ( num != 0){

            for (int i = 1; i < num; i++){

                if (num % i == 0){

                    divisor = i;
                }
                } 

    
           
    if(divisor == 1){

        System.out.println(num + " e primo");
    }                

        System.out.println("o divisor maior e " + divisor);
    
    if (divisor == 5){
        
        System.out.println("fin do programa");

        break;
    }   
    
        System.out.println("mete outro numero");

        num = entrada.nextInt();
    
    }

    
    }
}
    
    

