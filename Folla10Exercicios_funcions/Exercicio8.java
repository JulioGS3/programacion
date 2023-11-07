/*8. Escribe un programa que, dado un enteiro x, calcule x3+ 2x2+ 3x +1. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce un numero");
    int x = entrada.nextInt();

    int resultado = 0;

    resultado = calculo(x);
    System.out.println(resultado);

}
public static int calculo ( int i){

    return (i * i * i) + (2 * i * i) + (3 * i ) + 1;
}    
}
