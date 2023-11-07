/*1. Crea un programa que sume os dous números enteiros 123 e 345 chamando a unha función suma
que devolva o valor da suma. */

package Folla10Exercicios_funcions;

public class Exercicio1 {
public static void main(String[] args) {
    
int num1 = 123;
int num2 = 345;
int resultado = 0;

resultado = suma(num1 , num2);

System.out.println( "o resultado da suma e " + resultado);


}

public static int suma (int i , int j){

    return i + j;
} 


}
