/*3. Crea un programa que sume tres números double introducidos por teclado (a introducción dos
valores no main), chamando a unha función suma3Double que devolva o valor da suma. */

package Folla10Exercicios_funcions;
import java.util.Scanner;
public class Exercicio3 {
 public static void main(String[] args) {
    
        
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce 3 numeros Double");

    Double num1 = entrada.nextDouble();
    Double num2 = entrada.nextDouble();
    Double num3 = entrada.nextDouble();
    Double resultado = 0.0;

    resultado = suma3Double(num1 , num2 , num3);

    System.out.println( "o resultado da suma e " + resultado);


    }

    public static Double suma3Double (Double i , Double j , Double k){

        return i + j + k;
} 


}


