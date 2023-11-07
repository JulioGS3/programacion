/*2. Declara un array de 5 doubles e pídeos por teclado. Escribe na segunda posición o valor de último
elemento e mostra de novo todos os valores.*/

package Folla7Exercicios_arrays;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
    

Double [] arrayDouble = new Double[5];
Scanner entrada = new Scanner(System.in);

    for(int i = 0; i < arrayDouble.length; i++){

        System.out.println("introduce numero");
        arrayDouble [i] = entrada.nextDouble();
    }
    arrayDouble[1] = arrayDouble[4];

    for(Double i : arrayDouble){
        System.out.println(i);
    }

}    
}
