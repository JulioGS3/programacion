/*9. O programa deberá ir pedindo cadeas de caracteres, sen puntos, e para cada unha delas cambiar todas
as letras 'a' por 'e', e todas as 'e' por 'a', e despois imprimir a cadea. O programa rematará se o tamaño da
cadea introducida é 2 (ten só 2 letras) */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_9 {
public static void main(String[] args) {

String cadea = "non";

Scanner entrada = new Scanner(System.in);


    while (cadea.length() > 2) {

    System.out.println("introduce unha frase sen puntos");

    cadea = entrada.nextLine(); 

    cadea = cadea.replace("a", ".");
    cadea = cadea.replace("e", "a");
    cadea = cadea.replace(".", "e");
        
    System.out.println(cadea);


    }
}
    
}
