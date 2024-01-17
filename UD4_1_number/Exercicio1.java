/*1. Empregando a clase Integer fai un programa que pida unha cadea de texto en binario, e mostres o seu
correspondente número enteiro */
package UD4_1_number;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce un binario");
    String binario = entrada.nextLine();

    int enteiro = Integer.parseInt(binario, 2);
    System.out.println(enteiro);

}
    
}