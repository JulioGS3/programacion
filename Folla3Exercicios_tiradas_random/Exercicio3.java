/*2. Simula o xogo de lanzar 2 dados, dandolle ao xogador 3 intentos como máximo para achegarse ao 21.
Se chega xusto felicítao, e se non indicalle que perdeu. O xogador pode plantarse en calquer intento
anterior ao terceiro. */
package Folla3Exercicios_tiradas_random;
import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    
    Scanner ent= new Scanner(System.in);
    String resposta = "";


    System.out.println("primeiro lanzamento");

    int dado1= (int)(Math.random()*6)+1;
    System.out.println("dado un = "+dado1);
    int dado2= (int)(Math.random()*6)+1;
    System.out.println("dado dous = "+dado2);
    int sumaTirada1= dado1+dado2;
    System.out.println("sacaches un "+sumaTirada1);

    if(sumaTirada1==21){

        System.out.println("Felicidades!");

        return;
    }
    

    int segundodado1= (int)(Math.random()*6)+1;
    System.out.println("segunda tirada: dado un "+segundodado1);
    int segundodado2= (int)(Math.random()*6)+1;
    System.out.println("segunda tirada: dado dous "+segundodado2);
    int sumaTirada2= segundodado1+segundodado2;
    System.out.println("sacaches un "+sumaTirada2);

    
    if(sumaTirada1+sumaTirada2==21){

        System.out.println("felicidades");
        
    return;
    }


    int acumulado= sumaTirada1+segundodado2;

        System.out.println("acumulas "+acumulado+" queres continuar S/N ?" );

        ent.nextLine();

        String pregunta = ent.nextLine();

    

    

  }  
}
