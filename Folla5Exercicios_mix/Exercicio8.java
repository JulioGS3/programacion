/*8. Na empresa ProgSys, creada no 2015, os programadores comezan gañando 1200 € netos ao mes,
tendo un aumento anual do seu soldo dun 5 %. Pregunta o ano no que entrou un traballador, e indica o
soldo neto anual deste ano. (Un aumento anual do 5% do soldo quere dicir que o soldo do ano seguinte
vale soldoAnoPasado*1,05 ) */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce o ano");
    Double ano = entrada.nextDouble();
    Double salario = 1200.0;
    Double subida = 1.05;
    int ref=2015;
    Double aumentado=0.0;

        if (ano >= 2015){

           aumentado = (((ano-ref) * subida)*salario);

            System.out.println("o salario actualizado e "+aumentado);


        }
}
}
