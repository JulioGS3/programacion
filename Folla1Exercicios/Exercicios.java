// 1. Programa que pida 2 números enteiros, primeiro o número maior, e logo o menor, e mostre o
//resultado de restalos. 

import java.util.Scanner;

public class Exercicios {
public static void main(String[] args) {
    
Scanner escaner = new Scanner(System.in);
System.out.println("introduce o número maior ");
int numeroMaior = escaner.nextInt();
System.out.println("ahora introduce o número menor ");
int numeroMenor = escaner.nextInt();

int resultado = numeroMaior - numeroMenor;
System.out.println(" o resultado e "+ resultado);




}
    
}