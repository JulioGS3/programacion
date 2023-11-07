/*2. Modifica o anterior programa para facer a suma de dous números enteiros (introducidos por teclado
no main( ) ), chamando a unha función que devolve o valor da suma. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce 2 enteiros");

    int num1 = entrada.nextInt();
    int num2 = entrada.nextInt();
    int resultado = 0;

    resultado = suma(num1 , num2);

    System.out.println( "o resultado da suma e " + resultado);


    }

    public static int suma (int i , int j){

        return i + j;
} 


}

