/*10. O programa deberá ir pedindo unha cadea e un char, eliminará ese char da cadea, o mostrará a cadea.
Logo pedirá outro par cadea/char. Rematará cando o char sexa o punto ‘.’ */

package UD3_4_Lib_Strings;

import java.util.Scanner;

public class AppString1_10 {

public static void main(String[] args) {
    
Scanner entrada = new Scanner(System.in);


char caracter='a';
String cadea1;

while(caracter != '.'){

System.out.println("introduce unha frase");

StringBuilder convertirCaracter = new StringBuilder("");

cadea1 = entrada.nextLine();

System.out.println("introduce un caracter");

caracter = entrada.next().charAt(0);

entrada.nextLine();

convertirCaracter = convertirCaracter.append(caracter);

cadea1 = cadea1.replace(convertirCaracter, "");

System.out.println(cadea1);
}

}
    
}
