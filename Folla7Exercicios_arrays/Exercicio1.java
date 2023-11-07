/*1. Programa que pida 7 números enteiros por teclado e os mostre a continuación na orde na que se
introduciron */

package Folla7Exercicios_arrays;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {

    int [] arrayInt = new int [7];
    Scanner entrada = new Scanner(System.in);

    for( int i = 0; i < arrayInt.length; i ++){

        System.out.println("introduce un numero");
        arrayInt[i]= entrada.nextInt();
    }
    for(int ent : arrayInt){
        System.out.println(ent);
    }


    }
}
