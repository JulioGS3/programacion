/*15. Programa que tire unha moeda ao aire tantas veces como queira o xogador, indicando se acerta ou
non. Ao final deberá mostrar cantos acertos houbo e o número de veces xogadas */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {

    String resposta;
    String cara="cara";
    String cruz="cruz";
  
    do{
    Scanner escaner= new Scanner(System.in);
    System.out.println("elixe entre cara ou cruz");
    String tirada= escaner.nextLine(); 

    int aleatorio1= (int)(Math.random()*2)+1;
    
        if(tirada.equals("cara") && aleatorio1==1){
            System.out.println("acertaches, saliu cara!");
        }
        if(tirada.equals("cruz")&& aleatorio1==2){
            System.out.println("acertaches, saliu cruz");
        } 
        else if(tirada.equals("cara") && aleatorio1==2){
            System.out.println("oohhhh non acaertaches saliu cruz");
        }
        else if(tirada.equals("cruz") && aleatorio1==1){
            System.out.println("oohhhh non acaertaches saliu cara");
        }
    

    System.out.println("queres volver a xogar");
    resposta= escaner.nextLine();
    }while( resposta.equals("si"));

    }
}
