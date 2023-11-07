/*6. Declara un array de 3 enteiros. Pídeos por teclado. Escribe na primeira posición o valor gardado na
segunda posición, e na segunda posición o gardado na 3ª. Mostra o array. Volve pedir os valores
por teclado. Fai o que fixeches antes cun bucle. Mostra de novo o array. */

package Folla7Exercicios_arrays;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int [] arrayInt = new int [3];
    int caixa = 0;

        for (int i = 0; i < arrayInt.length; i++){

            System.out.println("introduce un enteiro");
            arrayInt[i] = entrada.nextInt();
        }

        caixa = arrayInt[0];
        arrayInt[0] = arrayInt [1];
        arrayInt[1] = arrayInt [2];
        
        for (int i : arrayInt) {
            System.out.println(i);
        }

        for (int a = 0; a < 2; a++){

            System.out.println("mete mas numeros");
            arrayInt[a] = entrada.nextInt();
        }
        for( int a = 0; a < 2; a++){
            
            arrayInt[a] = arrayInt[a+1];
        
        }
        for (int valor : arrayInt) {

            System.out.println(valor);
        }
        }
}

