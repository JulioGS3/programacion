//Programa que calcule o producto de 3 números e mostre o resultado indicando os números.
//P. ex. se os números son 1, 2 e 3 a mensaxe será:
//1 x 2 x 3 vale 6.

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

System.out.println("introduce o primeiro número ");
int numero1 = entrada.nextInt(); 
System.out.println("introduce o segundo número ");
int numero2 = entrada.nextInt(); 
System.out.println("introduce o terceiro número ");
int numero3 = entrada.nextInt(); 

int resultado = numero1*numero2*numero3;

System.out.println(numero1+" x "+numero2+ " x "+numero3+" vale "+resultado);

}
    
}