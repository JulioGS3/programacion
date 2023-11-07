/*1. Programa que pida por teclado un número menor que 10: emprega a función rand(10)
explicada na parte dereita desta folla. O xogador debe ter 3 posibilidades de acerto, indicando se
a súa tentativa foi maior ou menor, e mostrando unha mensaxe efusiva no caso de ter acertado */

package Folla3Exercicios_tiradas_random;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
Scanner ent= new Scanner(System.in);

    System.out.println("introduce un numero menor que dez");
    Double num= ent.nextDouble();

    int aleatorio1= (int)(Math.random()*10)+1;
    System.out.println("no sorteo saliu "+aleatorio1);

    if( aleatorio1==num){
        System.out.println("Felicidades! acertaches!");
        return;
    }
    if(num>aleatorio1){
        System.out.println("pasacheste");
    }
    if(num<aleatorio1){
        System.out.println("quedacheste corto");
    }


        System.out.println("introduce un numero menor que dez");
        int num2= ent.nextInt();

        int aleatorio2= (int) (Math.random()*10)+1;
        
        System.out.println("segundo intento... "+aleatorio2);

        if( aleatorio2==num2){
        System.out.println("Felicidades! acertaches!");
        return;
        }
        if(num2>aleatorio2){
        System.out.println("pasacheste");
        }
        if(num2<aleatorio2){
        System.out.println("quedacheste corto");
        }


            System.out.println("introduce un numero menor que dez");
            int num3= ent.nextInt();

            int aleatorio3= (int) (Math.random()*10)+1;

            System.out.println("último  intento... "+aleatorio3);

            if( aleatorio3==num3){
            System.out.println("Felicidades! acertaches!");
            return;
            }
            if(num3>aleatorio3){

            System.out.println("pasacheste, e xa non quedan mais tiradas");
             }
            if(num3<aleatorio3){
             System.out.println("quedacheste corto, e xa non quedan mais tiradas");
    }
    }
}
