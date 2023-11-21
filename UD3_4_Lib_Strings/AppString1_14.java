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
    
        default:
        
            break;
    }

    


        
    }
    
}
    
}
