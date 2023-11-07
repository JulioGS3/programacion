/*12. Programa que pregunte que hora é, e responda con 'Bos días!', 'Boas tardes!' ou 'Boas noites!'. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner ent= new Scanner(System.in);
        System.out.println("introduce a hora na que estamos");
        int horas= ent.nextInt();
        

        if(horas>=8 && horas<12){
            System.out.println("bos dias");
        }
        if(horas>=12 && horas<21){
            System.out.println("boas tardes");
        }
        if(horas>=21 || horas<8){
            System.out.println("boas noites ");
        }
    }
}
