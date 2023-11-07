/*15. Programa que pida dous números n e m e mostre os números que hai entre eles indicando se son
pares ou impares co formato que se mostra a continuación. Se introducimos 2 e 5 sairá:
3.- impar
4.- par */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce dous numeros");
    int n = entrada.nextInt();
    int m = entrada.nextInt();


        for( int i = n+1; i < m; i++){

            if(i%2 == 0){
                System.out.println(i+" .- par");
            }else{
                System.out.println(i+" .- impar");
            }       
        }
    }

    
    }
    