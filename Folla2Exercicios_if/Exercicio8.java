/*8. Un traballador cobra 10 €/hora, e as horas extras a 16,50 €/hora. Fai un programa que pida as
horas traballadas nunha semana e mostre os que cobra o traballador. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
    Scanner ent= new Scanner(System.in);

    System.out.println("introduce o número de horas que traballaches");
    Double horas= ent.nextDouble();

    Double ordinarias= 10.0;
    Double extra= 16.50;
    Double sueldo_ordinarias= horas*ordinarias;
    Double horas_extra= horas-40;
    Double sueldoExtra;

    if (horas<=40){
        System.out.println(" traballaches "+horas+ " e vas cobrar "+sueldo_ordinarias+" euros");
    }
    if (horas>40){
        sueldoExtra= horas_extra*extra;
        sueldo_ordinarias=40*ordinarias;
        Double total=sueldoExtra+sueldo_ordinarias;
        System.out.println("traballaches 40 horas ordinarias polas que cobrarás "+sueldo_ordinarias+ "euros, e traballaches "+horas_extra+ " horas extra polas que que vas cobrar "+sueldoExtra+ " euros, é decir,
         un total de "+total+" euros");
    }


}    
}
