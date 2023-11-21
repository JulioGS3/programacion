/*13. Programa que cambie a primeira letra de cada palabra e a poña en maiúsculas se está en minúsculas.
Busca como funciona o método toUpperCase( ) da clase Character. */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_13 {

public static void main(String[] args) {


    int pos1 = 0;
    
    String palabra1="";
    String primerLetra= "";
    String cadeaFinal= "";
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("introduce unha frase");

    String cadea = entrada.nextLine();
    StringBuilder fraseFin = new StringBuilder();
    String primeiraLetra;

    cadea = cadea.trim();

    while(cadea.contains(" ")){

        
        pos1 = cadea.indexOf(" ");
        palabra1 = cadea.substring(0, pos1);
        cadea = cadea.substring(pos1+1);
        primerLetra = palabra1.substring(0, 1);
        primerLetra = primerLetra.toUpperCase();
        palabra1 = palabra1.substring(1, pos1);
       
        cadeaFinal = primerLetra + palabra1;
        fraseFin = fraseFin.append(cadeaFinal + " ");
        
        }
        primeiraLetra = cadea.substring(0,1);
        primeiraLetra = primeiraLetra.toUpperCase();
        cadea = cadea.substring(1);
        primeiraLetra = primeiraLetra+cadea;


        System.out.println(fraseFin + primeiraLetra);
   
        
}    
}
