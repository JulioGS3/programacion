//Programa que mostre o resto enteiro de dividir un número dado por teclado entre 2 e 3.

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
    
Scanner entrada= new Scanner(System.in);
    
    System.out.println("introducen un dividendo ");
    int dividendo= entrada.nextInt();

    int resultado1= dividendo%2;
    int resultado2= dividendo%3;
    
    System.out.println("o resto da division entre 2 é "+resultado1);
    System.out.println("o resto da division entre 3 é "+resultado2);
}
    
}