/*9. Escribe un programa que dado un número enteiro N, devolva 1+2+3+...+N. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
    
    int resultado = 0;

    Scanner entrada = new Scanner(System.in);
    System.out.println("mete un numero");
    int num = entrada.nextInt();

    resultado = suma(num);
    System.out.println(resultado);

}

public static int suma(int i){

    int suma = 0;

    for (int a = 0; a <= i; a++){

       suma = suma + a; 
       
    }

    return suma;
}
}    

