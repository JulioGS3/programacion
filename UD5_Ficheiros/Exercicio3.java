package UD5_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 3. Fai o exercicio1, do final de https://manuais.pages.iessanclemente.net/plantillas/DUAL/prog/ud5/ , para
empregar o try-with-resources. Lembra que o try-with-resources pode ter un bloque catch se é preciso
capturar a excepción: o que non é preciso é empregar o bloque finally para liberar os recursos. Exercicio3
Partindo do seguinte código, simplificalo co uso de try-with-resources.
 */
public class Exercicio3 {
public static void main(String[] args) {
    
    
    try(Scanner scanner= new Scanner(new File("test.txt"))){
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }

}
    