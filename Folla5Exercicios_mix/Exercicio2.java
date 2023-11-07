/*2. Programa que simule o lanzamento dun dado. O programa irá lanzando o dado e o xogador tentará
atinar cun único intento por cada lanzamento. Rematará cando acerte, e mostrará o número de veces
xogadas. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce un numero");

    int num=entrada.nextInt();
    int tirada=0;
    int cont=0;

        while(num!=tirada){

        tirada= (int)(Math.random()*6)+1;
        cont++;

        if(tirada==num){
            System.out.println("saliu o "+tirada+", acertaches. costouche "+cont+" tiradas");
        }else{
            System.out.println("saliu o "+tirada+ " volve a tirar");
            num=entrada.nextInt();
        }
        
       

     }

}    
}
