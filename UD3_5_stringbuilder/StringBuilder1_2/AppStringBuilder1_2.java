package UD3_5_stringbuilder.StringBuilder1_2;

import java.util.Scanner;

public class AppStringBuilder1_2 {
/**
 * @param args
 */
public static void main(String[] args) {


    String opcion = "";
    
    Scanner entrada = new Scanner(System.in);

    
    while (!opcion.equals("h")) {

    System.out.println("elixe a tua opcion");
    System.out.println("a " + "introducir frase e saudo");
    System.out.println("b " + " elimina frase");
    System.out.println("c " + "mostra frase e saudo");
    System.out.println("d " + "mostra lonxitude e capacidade");
    System.out.println("e " + " elimina parte da frase");
    System.out.println("f " + " introduce un double");
    System.out.println("g "+". invertir frase");
    System.out.println("h "+". sair"  );

        opcion = entrada.nextLine();

    StringBuilder1_2 cadea1 = new StringBuilder1_2 (new StringBuilder("hola"));
    StringBuilder cadea = new StringBuilder();
    String saludo = "";
    switch (opcion) {

        case "a":
    
        System.out.println("introduce unha frase");
        cadea = new StringBuilder(entrada.nextLine());
        cadea1.setIniciaFrase(cadea);

        System.out.println("introduce un saudo");
        saludo = entrada.nextLine();

        
        break;

        case "b":

        cadea1.eliminaFrase(cadea);
    
        break;

        case "c":
        cadea1.mostraFrase(cadea, saludo);

        break;

        case "d":

        cadea1.mostraLonxitudeEcapacidade(cadea);
        break;
        case "e":

        cadea1.eliminaParte(0, 6, cadea);
        break;
        case "f":

        cadea1.introduceDouble(0, 1.1, cadea);
        break;
        case "g":

        cadea1.invertirFrase(cadea);
        break;
    }
    }
}
    
}
