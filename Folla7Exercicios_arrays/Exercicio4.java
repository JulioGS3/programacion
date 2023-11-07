/*4. Declara un array de 8 enteiros. Pídeos por teclado. Móstraos. Cambia agora o último polo primeiro,
e o segundo polo penúltimo. Mostra todos os valores. */

package Folla7Exercicios_arrays;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int [] arrayInt = new int [8];
    int caixa1 =0;
    int caixa2 =0;

        for(int i = 0; i < arrayInt.length; i++){

            System.out.println("introduce un enteiro");
            arrayInt[i]= entrada.nextInt();
            }
            for( int valor : arrayInt){
                
                System.out.println(valor);
            }

            caixa1 = arrayInt[0];
            arrayInt [0] = arrayInt [7];
            caixa2 = arrayInt [1];
            arrayInt [1] = arrayInt [6];
            arrayInt [7] = caixa1;
            arrayInt [6] = caixa2;

            for (int ent : arrayInt){

                System.out.println(ent);
            }

        }


    }

