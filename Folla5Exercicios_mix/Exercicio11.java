/*11. Programa que pregunte primeiro: ¿cantos números queres introducir?, pida eses números e calcule a
súa suma e o máximo deles. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("cantos numero queres introducir"); 
    int num = entrada.nextInt();
    int acumulado = 0;

    for(int i = 0; i <= num; i++){

        num= entrada.nextInt();
        acumulado= acumulado+num;
    }
System.out.println("a suma e "+acumulado);
}    
}
