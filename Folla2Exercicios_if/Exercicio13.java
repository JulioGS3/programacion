/*13. Programa que pida 2 números e a operación a realizar entre eles (suma, resta, produto e
división) e calcule o resultado de facer esa operación. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
    Scanner ent= new Scanner(System.in);
    System.out.println("introdcue dous números");

    Float numero1= ent.nextFloat();
    Float numero2= ent.nextFloat();

    System.out.println("Que operación queres facer(suma, resta,produto ou division? ");
    String operacion= ent.next();

    if(operacion.equals("suma")) {

        float suma= numero1+numero2;
        System.out.println(suma);
    }
    if(operacion.equals("resta")){
        float resta=numero1-numero2;
        System.out.println(resta);
    }
    if(operacion.equals("produto")){
        float produto=numero1*numero2;
        System.out.println(produto);
    }
    if(operacion.equals("division")){
        float division=numero1/numero2;
        System.out.println(division);
    }else{
        System.out.println("opcion invalida");
    }
    

    }
}
