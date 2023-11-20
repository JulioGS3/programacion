/*12. Fai un programa que vaia pedindo cadeas e mostre 2 veces todas as que teñan algunha 'a', as outras
unha vez. Cando vaian 3 frases seguidas con algunha 'a' acabará o programa. */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_12 {
public static void main(String[] args) {

    String cadea="";
    int contador=0;

    Scanner entrada = new Scanner(System.in);

    while(contador < 3){

    System.out.println("introduce unha frase");

    cadea = entrada.nextLine();

        if(cadea.contains("a")){

            System.out.println(cadea);
            System.out.println(cadea);
            contador++;
        }else{

            System.out.println(cadea);
        }

    }
        
    }
    
}

