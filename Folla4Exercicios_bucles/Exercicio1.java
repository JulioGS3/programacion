/*1. Fai un programa que pida un número e o mostre. Debe repetir isto varias veces ata que se pulse o 100. */


package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
        
Scanner ent= new Scanner(System.in);
System.out.println("introduce un numero");
int numero= ent.nextInt();

while(numero!=100){
    System.out.println("meteches o "+numero+" introduce outro");
    numero= ent.nextInt();
}


    }
}
