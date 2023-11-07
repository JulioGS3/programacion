/*5. Escribe un programa que devolva a área dun círculo dado o seu radio (double). PI * radio* radio */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    

    Scanner entrada = new Scanner(System.in);
    Double area = 0.0;
    Double pi = 3.14;

    System.out.println("introduce o radio");
    Double radio = entrada.nextDouble();

    area = calculaArea(radio, pi);
    System.out.println("a area e " + area);
}

public static Double calculaArea( Double i, Double j){


    return i * i * j;
}
}
