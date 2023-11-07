/*Dada unha cantidade en €, mostrar a súa descomposición máis lóxica en billetes de 50 €, de 10
€, de 5 €, e moedas de 1 €. */

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
    
    Scanner ent= new Scanner(System.in);

    System.out.println("introduce a cantidade de euros ");
    int cantidade= ent.nextInt();

    int billete50= cantidade/50;
    int sobrante50=cantidade%50;
    int billetes10=sobrante50/10;
    int sobrante10=billetes10%10;
    int billetes5=sobrante10/5;
    int sobrante5=billetes5%5;
    int moneda1=sobrante5;

    System.out.println(cantidade+" euros son "+billete50+ " billetes de 50 "+ billetes10+" billetes de 10 "+billetes5+" billetes de 5 "+moneda1+" monedas de un euros ");
    

}
    
}