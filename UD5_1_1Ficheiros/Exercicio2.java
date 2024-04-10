package UD5_Ficheiros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JOptionPane;

/**
 * 2. Fai un programa que pida o nome dun ficheiro con JOptionPane, e se existe o copie nunha carpeta
“copia”. Execútao varias veces e comproba que funciona. Exercicio2
 */
public class Exercicio2 {
public static void main(String[] args) {
    
    String nomeFicheiro = JOptionPane.showInputDialog("introduce o nome dun ficheiro");
    

    File file = new File(nomeFicheiro);
        if (file.exists()) {
            System.out.println("o ficheiro existe");
    
            Path rutaOrixe = Paths.get("./"+ nomeFicheiro);
            Path novoDirectorio = Paths.get("./copia");
            Path rutaDestino = Paths.get("./copia/"+ nomeFicheiro);

            try{
                Files.createDirectories(novoDirectorio);
                Files.copy(rutaOrixe,rutaDestino, StandardCopyOption.REPLACE_EXISTING);

            }catch(IOException e){
                System.out.println("erro");
            }
        }else{
            System.out.println("non existe");
            }

}
}
    
