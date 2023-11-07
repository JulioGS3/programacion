/*6. Programa que dada unha data de nacemento (pedir día, mes e ano), indique cantos anos ten esa
persoa. Hai que comprobar se xa estivo de aniversario ou non. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);

    System.out.println("introduce o ano de nacemento");
    int ano= ent.nextInt();
    System.out.println("introduce o mes de nacemento");
    int mes= ent.nextInt();
    System.out.println("introduce o dia de nacemento");
    int dia= ent.nextInt();
    int edad = (2023 - ano);
    
    if (mes==9 && dia == 19){
        System.out.println("estas oxe de cumpleanos e tes "+ edad+ " anos");
    }
    if (mes<9 || mes==9 && dia<19){
         System.out.println(" xa estiveches de cumpleanos e tes "+ edad+ " anos");
    }else{
        edad=edad-1;
        System.out.println("ainda non estiveches de cumpleanos e tes "+ edad+ " anos");
    }
    }
}
