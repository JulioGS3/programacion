/*1. Crea unha clase que vaia pedindo frases por teclado, e que repita as que teñan como lonxitude maior
que 15 caracteres. Rematará cando a palabra introducida sexa “Fin” */
package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_1 {

public static void main(String[] args) {
    
Scanner entrada = new Scanner(System.in);

String cadea = "";

while (!cadea.equals("fin")) {

    System.out.println("introduce unha frase");

    cadea = entrada.nextLine();
    
    if(cadea.length() > 15){

    System.out.println(cadea);

    }
    
}

}
    
}
