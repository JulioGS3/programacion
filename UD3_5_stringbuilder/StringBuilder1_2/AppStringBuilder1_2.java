package UD3_5_stringbuilder.StringBuilder1_2;

import java.util.Scanner;

public class AppStringBuilder1_2 {
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

    switch (opcion) {

        case "a":
    
        System.out.println("introduce unha frase");
        String cadea = entrada.nextLine();
        entrada.nextLine();

        System.out.println("introduce un saudo");
        String saludo = entrada.nextLine();

       
        
        break;

    }
    }
}
    
}
