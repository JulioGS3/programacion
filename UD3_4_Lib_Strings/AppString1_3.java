/*3. Fai un programa que pida unha frase, e mostre a mesma sen a primeira ‘a’ da frase */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_3 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce unha frase");

    String cadea = entrada.nextLine();

    cadea = cadea.replaceFirst("a", "");

    System.out.println(cadea);


    }
    
}
