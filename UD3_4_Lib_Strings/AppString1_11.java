/*1. Pide unha cadea por teclado. O programa deberá mostrar por pantalla só as 2 primeiras palabras. */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_11 {

public static void main(String[] args) {

    int pos1 = 0;
    int pos2 = 0;
    String palabra1;
    String palabra2;
    

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce unha frase");

    String cadea = entrada.nextLine();

    cadea = cadea.trim();

    pos1 = cadea.indexOf(" ");

    palabra1 = cadea.substring(0, pos1);

    cadea = cadea.substring(pos1);

    cadea = cadea.trim();

    pos2 = cadea.indexOf(" ");

    palabra2 = cadea.substring(0, pos2);

    System.out.println(palabra1 + " " + palabra2);
    
}
    
}
