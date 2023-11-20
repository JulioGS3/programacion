/*6. Programa que pida unha cadea, e quite os espazo en branco repetidos entre 2 palabras. De cada
“conxunto” de espazos en branco, só quedará un espacio. Exemplo: “o espazo” quedará “o espazo */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_6 {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce unha frase");

    String cadea = entrada.nextLine();

    
    cadea =cadea.replace("  ", " ");

   System.out.println(cadea);
}
}
