/*10. Declara un array de 12 doubles. Fai un menú para facer o seguinte:
a) Introducir os 12 números.
b) Mostrar os 12 números.
c) Pide unha posición e escribe nesa posición o valor 0
d) Pide unha posición e escribe nesa posición o valor introducido por teclado.
e) Intercambia os 2 primeiros valores do array.
f) Intercambia o 3º e o 4º valor do array.
g) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.
h) Sair. */

package Folla7Exercicios_arrays;
import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    Double [] arrayDouble = new Double[12];
    String opcion= " ";
    int posicion = 0;
    Double num = 0.0;
    Double caixa = 0.0;
    Double caixa2= 0.0;

    while(!opcion.equals("h")){

        System.out.println("elixe unha opcion: ");
        System.out.println("a " +". introducir os 12 numeros");
        System.out.println("b "+ ". Mostrar os 12 numeros");
        System.out.println("c "+". Pide unha posición e escribe nesa posición o valor 0");
        System.out.println("d "+". Pide unha posición e escribe nesa posición o valor introducido por teclado.");
        System.out.println("e "+ ". Intercambia os 2 primeiros valores do array.");
        System.out.println("f "+". Intercambia o 3º e o 4º valor do array.");
        System.out.println("g "+". Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.");
        System.out.println("h "+". sair");


        opcion = entrada.nextLine();
        
            if (opcion.equals("a")){

                for( int i = 0; i < arrayDouble.length; i++ ){

                    System.out.println("introduce 12 numeros ");

                    arrayDouble[i]= entrada.nextDouble();
                    
                }
             
            }
                
            if (opcion.equals("b")){

                for (Double i : arrayDouble) {
                    
                    System.out.println(i);

                }
               
            }

            if (opcion.equals("c")){

                System.out.println("introduce unha posicion");

                posicion = entrada.nextInt();
                arrayDouble[posicion-1] = 0.0;
                
            }

            if (opcion.equals("d")){

                System.out.println("introduce unha posicion e despois o numero desa posicion");

                posicion = entrada.nextInt();
                num = entrada.nextDouble();

                arrayDouble[posicion-1] = num;
                

             }

             if (opcion.equals("e")){

                caixa = arrayDouble[0] ;
                arrayDouble[0] = arrayDouble[1];
                arrayDouble[1] = caixa;
             }

             if (opcion.equals("f")){

                caixa2 = arrayDouble[2];
                arrayDouble[2] = arrayDouble[3];
                arrayDouble[3] = caixa2;
             }

             if (opcion.equals("g")){

                for (int i = 1; i < arrayDouble.length; i = i + 2){

                    caixa2 = arrayDouble[i];
                    arrayDouble[i] = arrayDouble[i-1];
                    arrayDouble[i-1] = caixa2;
                    
                }
             }
}
}
}
