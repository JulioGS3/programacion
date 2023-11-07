/*10. Programa que pida un ano, e diga se é bisesto. Os anos bisestos son aqueles que son múltiplos
de 4. EXCEPTO: Os múltiplos de 100 non son bisestos a non ser que sexan múltiplos de 400.
Por exemplo, 1900 non foi bisesto pero o 2000 si. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
    
    Scanner ent= new Scanner(System.in);

    System.out.println("introduce un ano ");
    int ano= ent.nextInt();
    
    if(ano%100==0 && ano%400==0){
        System.out.println("si e bisiesto");
    }
    else if(ano%100==0){
        System.out.println("non e bisiesto");
    }

    else if(ano%4==00){
        System.out.println(ano+ " é bisiesto");

    }else{
        System.out.println("non e bisiesto");
    }



}    
}
