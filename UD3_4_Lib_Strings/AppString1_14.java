/*14. Fai un programa no que definas unha frase. Mostra un menú coas seguintes posibilidades (cada opción
fará exactamente o que di, para mostrar a frase premeremos 'f'):
a) Introducir frase.
b) Pasar as minúsculas a maiúsculas.
c) Borrar espazos, poden ser varios espazos seguidos
d) Inverter a frase.
e) Escriba a primeira letra de cada palabra en maiúscula (se é minúscula).
f) Mostrar a frase
g) Saia do programa. */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_14 {
public static void main(String[] args) {
    
    String opcion="";
    String cadea = "";
    String maiusculas ="";
    Scanner entrada = new Scanner(System.in);

    while (!opcion.equals("g")) {
    
    System.out.println("elixe a tua opcion");
    System.out.println("a " + "introducir frase");
    System.out.println("b " + " pasar a maiusculas");
    System.out.println("c " + "borrar espazos");
    System.out.println("d " + "invertir a frase");
    System.out.println("e " + " escribir a primeria letra en maiuscula");
    System.out.println("f " + " mostra a frase");
    System.out.println("g "+". sair");

    opcion = entrada.nextLine();

    switch (opcion) {

        case "a":
            
            System.out.println("introduce unha frase");
            cadea = entrada.nextLine();
            break;

        case "b":

            cadea = cadea.toUpperCase();
            break;

        case "c":

            while(cadea.contains(" ")){
            cadea = cadea.replace(" ", "");
            }
            break;
        
        case "d":
            
            StringBuilder reves = new StringBuilder();
            reves = reves.append(cadea);
            reves = reves.reverse();
            cadea = reves.toString();
        
            break;

        case "e":

            int pos1 = 0;
            String palabra1 = "";
            String primerLetra = "";
            String cadeaFinal = "";
            StringBuilder fraseFin = new StringBuilder();

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
            String primeiraLetra = "";
            primeiraLetra = cadea.substring(0,1);
            primeiraLetra = primeiraLetra.toUpperCase();
            cadea = cadea.substring(1);
            primeiraLetra = primeiraLetra+cadea;
            cadea = fraseFin + primeiraLetra;

            break;

        case "f":

            System.out.println(cadea);

            break;
   
        
}    
    }

        
    }
    
}
    
