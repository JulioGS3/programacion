/*6. Programa que vaia pedindo números enteiros polo teclado. Ao final, debe mostrar cantos números
introducidos foron menores que 1000, cantos maiores, e a suma total de todos os números. O
programa rematará se o número introducido foi o 2332 ou a suma dá 99. O 2332 non se contará na
suma, pero o 99 si. */
package Repaso;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int num = 0;
    int contadorMenos1000 = 0;
    int contadorMais1000 = 0;
    int suma = 0;

    while (suma != 99 && num !=2332){

        System.out.println("introduce un numero enteiro");
        num = entrada.nextInt();
    if (num < 1000){

        contadorMenos1000++;
    }else{
        contadorMais1000++;
    }
    if (num == 2332){
         suma = suma + num - 2332;
    }else{
    suma = suma + num;
    }
    }
    System.out.println("numeros menores de 1000 " + contadorMenos1000 + " e numeros de mais de 1000 houbo " + contadorMais1000 + " . a suma e " + suma);
    }
    
}
