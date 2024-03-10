/*3. Fai un programa que empregue unha función para introducir unha cadea. Introduce no main( ) 2
letras distintas: letra1 e letra2. Fai despois outra función elimina( ) que elimine as sílabas
compostas por esas dúas letras seguidas. Ex: “Na casa do ferreiro” e 's', 'a'. Deberá eliminar “sa”,
quedando a cadea como “Na ca do ferreiro” */
package Repaso;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {

    String texto = "";
    String letra1 = "";
    String letra2 = "";

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce unha frase e 2 letras");

    
    letra1 = entrada.nextLine();
    letra2 = entrada.nextLine();

    String resultado = cadea(entrada.nextLine());
    System.out.println(resultado);
    String resultadoFinal = elimina(letra1, letra2, resultado);
    System.out.println(resultadoFinal);

    
}

public static String cadea(String i){
    return i;
}

public static String elimina(String i, String j, String h){
    String cadea = "";
    cadea =i.concat(j);
    cadea = h.replace(cadea, "");
    return cadea;
}
}
