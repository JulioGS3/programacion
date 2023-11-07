/*4. Exercicio que pida a nota obtida nun traballo de 0 a 10, e mostre en función dos seus valores
“Suspenso”, “Aprobado”, “Notable” ou “Sobresaliente”. */

package Folla9Exercicios_repaso;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println(" introduce a tua nota");
    Double nota = entrada.nextDouble();

    if (nota < 5.0){

        System.out.println("suspenso");
    }

    if(nota >= 5.0 && nota < 7.0){

        System.out.println("aprobado");
    }

    if(nota >= 7.0 && nota < 9.0){

        System.out.println("notable");
    }

    if( nota >= 9.0 && nota <= 10.0){

        System.out.println("sobresaliente");
    }
        
    }
    
}
