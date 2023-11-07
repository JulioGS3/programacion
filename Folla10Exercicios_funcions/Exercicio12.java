/*12. Programa que devolva a suma dos divisores dun número enteiro positivo. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
    
    int suma = 0;

    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce un enteiro");
    int num = entrada.nextInt();

suma = calcular(num);
System.out.println(suma);

}    

    public static int calcular (int i){

        int buscaDivisor = 0;
        
        for( int a = 1; a <=i; a++){

            if (i % a == 0){

                buscaDivisor = buscaDivisor + a;
            }
        }
        return buscaDivisor;


        }
}

