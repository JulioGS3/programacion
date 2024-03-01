package UD5_0_Arraylist;

import java.util.ArrayList;

/**
 * 3.- Crea unha lista de tipo String, e engade 4 elementos String: “Roma”, “París”, “Estocolmo”, “Vilna”. 
 * Convirte a lista nun array e mostra os elementos cun for. Exercicio3
 */
public class Exercicio3 {
public static void main(String[] args) {
    
    ArrayList <String> lista = new ArrayList<String>();

    lista.add("roma");
    lista.add("paris");
    lista.add("estocolmo");
    lista.add("vilna");

    String [] arrayCaracteres = new String [lista.size()];

    arrayCaracteres = lista.toArray(arrayCaracteres);

    for (String string : arrayCaracteres) {
        System.out.println(string);
    }
}

    
}