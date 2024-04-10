package UD5_Ficheiros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * 7. Fai un programa que cree unha carpeta ficheirosTemporaisCopia, e copie 2 dos ficheiros da carpeta
anterior á nova. Exercicio7
 */
public class Exercicio7 {
public static void main(String[] args) {
    
    Path dir1 = Paths.get("ficheirosTemporais2");
    Path dir2 = Paths.get("./ficheirosTemporais");
    String ficheiro1 = "/proba1.txt";
    String ficheiro2 = "/proba2.txt";
  
    
    try {
    Path novoDirectorio = Files.createDirectories(dir1);
    Files.copy(dir2+ficheiro1,dir1+ficheiro1, StandardCopyOption.REPLACE_EXISTING);
    Files.copy(dir2+ficheiro2, dir1+ficheiro2, StandardCopyOption.REPLACE_EXISTING);
} catch (IOException e) {
    e.printStackTrace();
}

}

    
}