/*5. Declara un array a[5] de 5 enteiros. Declara outro array copia[5] de outros 5 elementos. Pide os
elementos de a[5] por teclado. Fai que todos os elementos do array copia sexan 1. Copia o 1º
elemento do array a[] no 1º elemento do array copia[]. Copia o 3º elemento do array a[] no 5º
elemento do array copia[]. Mostra o array copia[]. */

package Folla7Exercicios_arrays;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    int  [] arrayA = new int [5];
    int [] arrayCopia = new int [5];

        for (int i = 0; i < arrayA.length; i++){

            System.out.println("introduce un enteiro");
            arrayA[i] = entrada.nextInt();
        }

        for (int i = 0; i < arrayCopia.length; i ++){

            arrayCopia[i] = 1;
            
            arrayCopia[0] = arrayA[0];
            arrayCopia[4] = arrayA[2];
        }
        for (int valor : arrayCopia){
            System.out.println(valor);
        }

        

        }




} 

