package UD5_2_Ficheiros_serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * java.io
1. Comproba que funciona o primeiro exemplo de lectura/escritura de ficheiros binarios.
2. Modifica a primeira parte do exemplo para que vaia pedindo cadeas por teclado e se vaian
gardando nun ficheiro.
3. Le o ficheiro letra a letra e móstrao por pantalla. Exercicio1
 */
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Exercicio1 {
    public static void main(String[] args) {  
        //Obtemos o directorio home do sistema onde se almacenará o ficheiro
        String directory = ".";
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;
        String fileContent = "";
         // escritura do ficheiro
        while (!fileContent.equals("s ")) {
            
            try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {   
                fileContent = JOptionPane.showInputDialog("introduce cadeas para ir gardando, para sair pulsa s");
                fileContent = fileContent + " ";
                //almacenamento de bytes
                fileOutputStream.write(fileContent.getBytes());
                fileOutputStream.flush(); //Forzamos o gardado
            } catch (FileNotFoundException e) {
                System.err.println("Ficheiro non encontrado");
            } catch (IOException e) {
                System.err.println("Error na E/S");
            }
            // lendo o ficheiro
            try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
                int ch = fileInputStream.read();
                //ata a fin do stream (ficheiro), imos mostrando letra a letra
                while(ch != -1) {
                    System.out.print((char)ch);
                    ch = fileInputStream.read();
                }
            } catch (FileNotFoundException e) {
                System.err.println("Ficheiro non encontrado");
            } catch (IOException e) {
                System.err.println("Error na E/S");
            } 
        }
    }
}


    

