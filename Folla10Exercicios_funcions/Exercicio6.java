/*6. Escribe un programa que reciba 3 números flotantes e devolva a media dos 3. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
    
    float media = 0.0f;

    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce 3 numeros");

    float num1 = entrada.nextFloat();
    float num2 = entrada.nextFloat();
    float num3 = entrada.nextFloat();

    media = calcularMedia(num1, num2, num3);
    System.out.println("a media e " + media);
}

public static float calcularMedia( float i, float j, float k){

    return (i + j + k)/3;
}
}
