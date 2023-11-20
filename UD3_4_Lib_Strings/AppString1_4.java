/*4. Fai un programa que pida frases por teclado e as copie noutro String sen letras ‘a’. Mostrará cada frase
sen letras ‘a’ e pedirá outra frase. Rematará cando a frase non teña letras ‘a’. */
package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_4 {
public static void main(String[] args) {

        String cadea;

        boolean bol= true;

        while(bol == true) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce unha frase");

        cadea = entrada.nextLine();

        System.out.println(cadea.replace("a", ""));

        bol = cadea.contains("a");



}
}
    
}
