/*6. Imprime os múltiplos de 7 que hai entre n e m, dous números introducidos por teclado. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce dous enteiros");
    
    int n = entrada.nextInt();
    int m = entrada.nextInt();
   
    if(n < m){
        for (int i = n; i <= m; i++){

            if(i%7 == 0){
                System.out.println(i);
            }

        }
    }if(n > m){
        for (int i = m; i <= n; i++){

            if(i%7 == 0){
                System.out.println(i);
            }
    }
    
    }
}
}
