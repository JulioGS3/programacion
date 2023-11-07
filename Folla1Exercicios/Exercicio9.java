//Programa que faga o cambio de ºF a ºC, vendo que a conversión segue a regra
//ºC= ( ºF-32) / 1.80. P.ex. 0ºC son 32 ºF e 100ºC son 212 ºF.

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);

System.out.println(" introduce os grados ºF "); 
int far= entrada.nextInt();

double resultado= (far-32)/1.80;

System.out.println( far +" ºF son "+resultado+ " grados ");
    

    }

    
}