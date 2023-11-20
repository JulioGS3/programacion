/*5. Programa que pida dúas palabras, e diga cal é a que iría primeiro no dicionario. */
package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_5 {

public static void main(String[] args) {

    int posto = 0;

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce duas frases");

    String cadea = entrada.nextLine();

    String cadea2 = entrada.nextLine();

    posto = cadea.compareTo(cadea2);

    System.out.println(posto);

    if (posto == -1){

        System.out.println("vai antes a primeira frase");
    }
    else if ( posto == 0){

        System.out.println("son iguales");

    }else{

        System.out.println("vai primeiro a segunda frase");
    }



    
}
    
}
