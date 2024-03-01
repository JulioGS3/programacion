package UD5_0_Arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *2.- Fai unha lista para almacenar saúdos diferentes introducidos por teclado. O programa pedirá saúdos ata que se introduza “fin”. 
 Entón o programa despedirase cun dos saúdos introducidos, elixido aleatoriamente. Exercicio2
 */
public class Exercicio2 {
public static void main(String[] args) {
    
    String saudos = "";
    int random = 0;

    ArrayList <String> lista = new ArrayList<String>();

    do{
        saudos = JOptionPane.showInputDialog("introduce un saudo");
        if(saudos.equals("fin")){
            break;
        }
        lista.add(saudos);

    }while(!saudos.equals("fin"));

        random = (int)(Math.random()*lista.size());

    System.out.println(lista.get(random) + "!");
}
    
}