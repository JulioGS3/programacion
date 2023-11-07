/*3. Programa que pida 10 palabras e as repita. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce 10 palabras");
    

    for(int i=1; i<=10; i++){
        String palabra=entrada.nextLine();
        System.out.println(palabra);

    }
    }
}
