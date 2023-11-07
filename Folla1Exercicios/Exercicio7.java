//Programa que faga o cambio de € a dólares

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce a cantidade en euros que desexe convertir ");
    double euros= entrada.nextDouble();
    double valorDollar=1.07;
    double resultado= (euros*valorDollar)/1;

    System.out.println(euros+ " euros son "+resultado+" dollares ");
}
    
}