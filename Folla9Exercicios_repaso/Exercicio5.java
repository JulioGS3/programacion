/*5. Programa que vaia pedindo números polo teclado. Ao final, debe mostrar cantos números
introducidos foron negativos, cantos positivos, e a suma total de todos os números. O
programa rematará se o número introducido foi o 1111 ou a suma dá 7. O 1111 non se contará
na suma, pero o 7 si */

package Folla9Exercicios_repaso;

import java.util.Scanner;

public class Exercicio5 {

public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce un numero");
    int num = entrada.nextInt();
    int suma = 0;
    int contadorNeg = 0;
    int contadorPos = 0;

    while(num != 1111){

        suma = suma + num;
    
        if (num < 0){

        contadorNeg++;
        }
        if (num > 0){
        
        contadorPos++;
        }
        if(suma == 7){

            System.out.println(" fin do progrma");

            break;
        }

        System.out.println(suma + " acumulado. mete outro numero");
        num = entrada.nextInt();

    }
    System.out.println("a suma total foi " + suma + " e introduciches "+ contadorNeg + " numeros negativos e " + contadorPos + " positivos");

}
    
}
