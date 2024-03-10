/*7. Fai un programa que pida unha cadea de caracteres de ata 20 letras, e chamando a funcións, vaia
facendo o seguinte: cambia a primeira letra de cada palabra a maiúsculas, elimina a letra 'a' da
cadea, e elimina espazos seguidos. Logo de cada paso deberás chamar a unha función imprime ( )
que mostre a cadea. */

package Repaso;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
        
    System.out.println("introduce unha frase de menos de 20 letras");
    String cadea1 = entrada.nextLine();

    if (cadea1.length() < 20){

        String maius = maiuscula(cadea1);
        imprime(maius); 

       String quita =quitaA(cadea1);
       imprime(quita);

       String espazo = quitarDobleEspazos(cadea1);
        imprime(espazo);
    }else{
         System.out.println("son mais de 20 caracteres, volve a probar");
    }
    
    }
    
    public static String maiuscula(String i){

        String primeira = i.substring(0, 1) ;
        primeira = primeira.toUpperCase();
        String cadeaSin0 = i.substring(1);
        i = primeira.concat(cadeaSin0);
        return i;
    }
    public static String quitaA(String i){

        i = i.replace("a", "");

        return i;
    }
    public static String  quitarDobleEspazos( String i){
        while(i.contains("  ")){
            i = i.replace("  ", " ");
        }
        return i;
    }
    public static void imprime(String i) {
     
        System.out.println(i);
    }

}
