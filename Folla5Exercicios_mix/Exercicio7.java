/*7. Programa que pida un número e mostre todos os seus divisores. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio7 {
    
public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
    System.out.println("mete un número");
    int num= entrada.nextInt(); 

    for (int i = 1; i <= num; i++){

        if(num%i == 0){
            System.out.println(i);
        }
    }
}
}
