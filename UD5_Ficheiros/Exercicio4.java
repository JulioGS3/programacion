package UD5_Ficheiros;

import java.io.File;

import javax.swing.JOptionPane;

/**
 * 4. Fai un programa que pida repetidamente o nome dun ficheiro ou directorio, con JoptionPane, e vaia
indicando se é unha carpeta ou un ficheiro. O programa rematará cando se teclee “fin”. Exercicio4
 */
public class Exercicio4 {
public static void main(String[] args) {
    
String opcion = "";

    do{
        opcion = JOptionPane.showInputDialog("introduce o nome dun ficheiro ou directorio ou, pulsa 'S' para sair");

        File ficheiro = new File(opcion);

        if(ficheiro.isDirectory() == true){
            System.out.println("e un directorio");
        }
        if(ficheiro.isFile() == true){
            System.out.println("e un ficheiro");
        }
 
    }while(!opcion.equals("s") && !opcion.equals("S"));

}

}