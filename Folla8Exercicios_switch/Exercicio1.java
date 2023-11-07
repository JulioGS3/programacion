/*1. Fai un programa empregando switch no que se mostre o seguinte menú e faga o que se explica a
continuación ao pulsar esa letra:
a) Introducir un double
b) Imprimir o double
c) Sair */

package Folla8Exercicios_switch;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    String opcion = "";
    Double num = 0.0;

    while (!opcion.equals("c")){

        System.out.println("elixe a opción que queiras");
        System.out.println("a "+". Introducir un Double");
        System.out.println("b "+ ". Imprimir o Double");
        System.out.println("c "+". sair");

        opcion = entrada.nextLine();

    

    switch (opcion){

        case ("a"):

            System.out.println("introduce un Double");
            num = entrada.nextDouble();
            break;

        case ("b"):

            System.out.println("este e o Double que insertaches "+ num);
            break;

    
    }
    }    
}    
}
