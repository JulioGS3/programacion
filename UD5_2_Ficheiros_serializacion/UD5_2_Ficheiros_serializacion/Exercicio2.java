package UD5_2_Ficheiros_serializacion;
/**
 * java.nio
4. Comproba que funciona o exemplo dos apuntes empregando a librería java.nio
5. Modifica o exemplo para que vaia gardando varios String tecleados por consola ata teclear “fin”.
Debes engadir un carácter separador, para poder ler as cadeas no exercicio seguinte.
6. Le o ficheiro anterior, e mostra os distintos String introducidos. Le todos os bytes dunha tacada e
logo separa os String empregando algunha función da clase String Exercicio2
 */
 
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

import javax.swing.JOptionPane;
 public class Exercicio2 {
     public static void main(String[] args) {  
         //Obtemos o directorio home do sistema onde se almacenará o ficheiro
         String directory = ".";
         String fileName = "sample.txt";
         String fileContent = "";
         Path ruta = Paths.get(directory,fileName);
        
          // escritura do ficheiro
         while (!fileContent.equals("fin;")) {
             
             try {
                fileContent = JOptionPane.showInputDialog("introduce cadeas para ir gardando, para sair pulsa s");
                fileContent = fileContent+";";
                //almacenamento de bytes 
                Files.write(ruta, fileContent.getBytes(), StandardOpenOption.APPEND);
            
             } catch (FileSystemException e) {
                 System.err.println("Ficheiro non encontrado");
             } catch (IOException a) {
                 System.err.println("Error na E/S");
             }
             // lendo o ficheiro
             try{
                String content = new String(Files.readAllBytes(ruta));
                System.out.println(content);
                String [] lineas;
                lineas = content.trim().split(";");
                for (String string : lineas) {
                    System.out.println(string);
                }
             }catch (IOException e) {
                 System.err.println("Error na E/S");
             } 
         }try{
            String vacio = "";
            Files.write(ruta,vacio.getBytes(),StandardOpenOption.TRUNCATE_EXISTING);
        }catch(IOException e){
            System.out.println(e);
        }

     }
 }