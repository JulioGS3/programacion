/* 11. Fai un programa que redondee un número de 4 cifras á centena máis próxima. Exemplo, 2340 a
2300, e 2560 a 2600. Comproba que o número introducido ten 4 cifras.*/

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
        
        System.out.println("introduce un número de catro cifras");
        int numero= ent.nextInt();

        int centenas= numero/100;

     if (numero%100>=50){
            int redondeoArriba= (centenas+1)*100;
        System.out.println(redondeoArriba);
    }
    if(numero%100<50){
        int redondeoAbaixo= (centenas*100);
        System.out.println(redondeoAbaixo);
    }
}
}