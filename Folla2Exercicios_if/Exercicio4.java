/*4. Fai un programa concurso, con tres preguntas de 500 € cada unha. Mostra o premio final do
concursante e felicítao co seu nome. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio4 {
   public static void main(String[] args) {
    
    Scanner ent= new Scanner(System.in);

    System.out.println("cal e a capital de España? ");
    String pregunta1= ent.nextLine();
    System.out.println("cal e a capital de Galicia? ");
    String pregunta2= ent.nextLine();
    System.out.println("cal e a capital de Francia? ");
    String pregunta3= ent.nextLine();

    int premio=0;


    
    if( pregunta1.equals("Madrid")){
       premio= premio+500;
    }
    if(pregunta2.equals("Santiago")){
        premio= premio+500;
    }
    if (pregunta3.equals("Paris")) {
        premio= premio+500;
        
    }
    System.out.println("o premio acumulado é "+premio);

   } 
}
