//Programa que faga o cambio de dólares a €.

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce a cantidade en dolares que desexe convertir ");
    double dolar= entrada.nextDouble();
    double valorEuros=0.93;
    double resultado= (dolar*valorEuros)/1;

    System.out.println(dolar +" dolares son "+resultado+" euross ");
}
    
}