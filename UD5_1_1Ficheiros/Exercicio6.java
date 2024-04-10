package UD5_Ficheiros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

/**
 *6. Fai un programa que cree nunha carpeta “ficheirosTemporais” ata 5 ficheiros de texto, cada un con
unha frase introducida por teclado. Os ficheiros serán “exemplo1.txt”, “exemplo2.txt”, etc. Exercicio6
 */
public class Exercicio6 {
public static void main(String[] args) throws IOException {

    String nome = JOptionPane.showInputDialog("introduce o nome do ficheiro sen a extension");
    String directorio = "ficheirosTemporais";
    boolean dir = (new File(directorio)).mkdir();

    for (int i = 1; i <= 5; i++) {
        File ficheiro = new File("./"+directorio+"/"+nome+i+".txt");
        ficheiro.createNewFile();
        System.out.println(nome+i);
        String frase = JOptionPane.showInputDialog("introduce a frase");
        BufferedWriter writer = new BufferedWriter(new FileWriter(ficheiro));
        try (writer) {         
            writer.write(frase);
            writer.newLine();
            }     
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(ficheiro))){
            String line = bufferedReader.readLine();
                while(line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
    
            System.out.println("sad");
        }
    }      
}
}