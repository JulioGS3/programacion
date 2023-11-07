/*9. Programa que pida repetidamente un ano, e mostre se é bisesto ou non. Rematará cando introduza o
3000. Tenta tilizar un único if, con varias condicións. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce un ano");
    int ano = entrada.nextInt();

    while (ano != 3000){

        if(ano % 4 == 0){
            System.out.println(ano+ " é bisiesto");
        }else{
            System.out.println("non e bisiesto");
        }
        ano = entrada.nextInt();
    }
}    
}
