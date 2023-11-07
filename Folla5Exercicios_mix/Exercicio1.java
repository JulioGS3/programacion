/*1. Programa que vaia pedindo números e mostre se son pares ou impares. Rematará cando se introduza
o 0. */
package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
        
    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce un numero");
    int num= entrada.nextInt();

        while(num!=0){

            if(num%2==0){
                System.out.println("e par");
            }else{
            System.out.println("e impar");             
            }
            num=entrada.nextInt();
        }
        System.out.println("fin");



    }
}
