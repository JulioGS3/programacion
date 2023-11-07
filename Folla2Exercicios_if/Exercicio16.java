/*16. Fai un programa que pida por teclado un número de 4 cifras e o mostre invertido. Por exemplo,
dado o número 1234 mostrará o 4321. Vai calculando a cifra de millar, de centena, decena e
unidade. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio16 {
public static void main(String[] args) {
    Scanner ent= new Scanner(System.in);

    System.out.println("introduce un numero de 4 cifras");
    int numero= ent.nextInt();


    int millar= numero/1000;
    int centena=numero/100;
    int decena=numero/10;
    System.out.println(centena);
} 
}
