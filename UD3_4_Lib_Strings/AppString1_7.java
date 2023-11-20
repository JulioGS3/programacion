/*7. Programa que conte o numero de palabras que aparecen nunha cadea de caracteres. As palabras
poderán estar separadas por un espacio ou por varios. */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_7 {
public static void main(String[] args) {

    int numTotal = 0;
    int numSenEspazos = 0;
    int totalPalabras = 0;
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce unha frase");

    String cadea = entrada.nextLine();

    cadea = cadea.trim();

    while( cadea.contains("  ")){

    cadea = cadea.replaceAll("  ", " ");
    }

    numTotal = cadea.length();

    System.out.println(numTotal);

    cadea = cadea.replace(" ", "");

    numSenEspazos = cadea.length();

    System.out.println(numSenEspazos);

totalPalabras = (numTotal - numSenEspazos) + 1;

System.out.println("a frase ten " + totalPalabras + " palabras");

    
}
    
}
