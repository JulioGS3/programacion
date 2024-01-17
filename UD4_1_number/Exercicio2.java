/* . Consulta a API da clase Integer, para ver a sintaxe dos métodos toBinaryString(), toOctalString(), e
toHexString(), e fai un programa cun menú que permita:
a) introducir un enteiro
b) mostrar o enteiro en binario
c) mostrar o enteiro en octal
d) mostrar o enteiro en hexadecimal*/
package UD4_1_number;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String opcion = "";
    int enteiro = 0;

    while(!opcion.equals("e")){

        System.out.println("elixe unha opcion");
        
        System.out.println("a "+".  Introducir un enteiro");
        System.out.println("b "+ ". Mostrar un enteiro en binario");
        System.out.println("c "+ ". Mostrar un enteiro en octal");
        System.out.println("d "+ ". Mostrar un enteiro en hexadecimal");
        System.out.println("e "+". sair");

        opcion = entrada.nextLine();

        switch (opcion) {

            case "a":

                System.out.println("introduce un enteiro");
                enteiro = entrada.nextInt();    
                entrada.nextLine();
                break;
        
            case "b":
                String binario = Integer.toBinaryString(enteiro);
                System.out.println(enteiro + " en binario seria " + binario);
                break;
            
            case "c":
                String octal = Integer.toOctalString(enteiro);
                System.out.println(enteiro + " en octal seria " + octal);
                break;
            
            case "d":
                String hexa = Integer.toHexString(enteiro);
                System.out.println(enteiro + " en hexadecimal seria " + hexa);
                break;
        }
    }
}    
}