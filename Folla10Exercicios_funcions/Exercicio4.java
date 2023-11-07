/*4. Fai un programa que multiplique 4 valores double introducidos por teclado chamando a unha
función multiplica4Double. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce 4 numeros");

    Double num1 = entrada.nextDouble();
    Double num2 = entrada.nextDouble();
    Double num3 = entrada.nextDouble();
    Double num4 = entrada.nextDouble();
    Double resultado = 0.0;


    resultado = multiplica4Double(num2, num3, num4, num1);
    System.out.println(resultado);
}

public static Double multiplica4Double(Double i, Double j, Double k, Double l){

    return i * j * k * l;
}


}

