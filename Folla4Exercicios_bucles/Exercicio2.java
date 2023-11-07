/*2. Fai un programa que vaia saudando ao usuario, mentres este diga que si cando preguntamos se quere
continuar. */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
        
Scanner ent= new Scanner(System.in);
System.out.println(" queres continuar");
String resposta= ent.nextLine();

while(resposta.equals("si")){
    System.out.println("benvido");
    System.out.println("queres continuar");
    resposta=ent.nextLine();
}


    }
}
