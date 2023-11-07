/*4. Programa que pida 10 frases con espazos e as repita. Podes empregar o método contains da clase
String, que devolve verdadeiro se a palabra contén un carácter dado.
String palabra = "casa";
System.out.println(palabra.contains("a")); */

package Folla5Exercicios_mix;
import java.util.Scanner;
public class Exercicio4 {
public static void main(String[] args) {
      
    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce 10 frases");
    

    for(int i=1; i<=10; i++){

        String palabra=entrada.nextLine();

        if(palabra.contains(" ")){

        System.out.println(palabra);

        }else{
            System.out.println("non vale");
            break;
        }
    }
}    
}
