/*2. Fai un programa que pida un String, e diga a posición da primeira ‘a’ da frase */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_2 {

public static void main(String[] args) {
    

Scanner entrada = new Scanner(System.in);

System.out.println("introduce un string");

String cadea = entrada.nextLine();

System.out.println("a primeira a esta na posicion " + cadea.indexOf("a"));
}
}
