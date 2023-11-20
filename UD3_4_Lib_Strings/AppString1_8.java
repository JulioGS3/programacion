/*8. Programa que intercambie a primeira metade dunha cadea de caracteres coa segunda metade. */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_8 {
public static void main(String[] args) {

    String cadea1 = "";
    String cadea2 = ""; 
    String cadeaUnida = "";
    int metade =0;

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce unha frase");

    String cadea = entrada.nextLine();     
    
    int num = cadea.length();

        metade = num/2;

    cadea1 = cadea.substring(0, metade);

    cadea2 = cadea.substring(metade);

    cadeaUnida= cadea2.concat(cadea1);

    System.out.println(cadeaUnida);
}
    
}
