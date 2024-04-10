package UD5_2_Ficheiros_serializacion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
/**
 * 9. Crea un programa que vaia pedindo doubles por teclado e os vaia gardando nun ficheiro.
10. Le o ficheiro creado no exercicio anterior mostrando cada double nunha liña distintaExercicio4
 */
public class Exercicio4 {
public static void main(String[] args) {
 
    Path ruta  = Paths.get("Doubles.txt");
    try{
        Path ficheiro = Files.createFile(ruta);
    }catch(IOException e){
        System.out.println(e);
    }
    Scanner sc = new Scanner(System.in);                                                                      
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        Double Doub;
        FileInputStream fin = null;
        DataInputStream entrada = null;
        try {
            fos = new FileOutputStream("datos.dat");
            salida = new DataOutputStream(fos);
            fin = new FileInputStream("datos.dat");
            entrada = new DataInputStream(fin);
            System.out.print("Introduce número Double. -1.0 para rematar: ");
            Doub = sc.nextDouble();
            while (Doub != -1.0) {
             
                salida.writeDouble(Doub); //Escrébese o número enteiro no ficheiro                                   
                Doub= entrada.readDouble();
                System.out.println(Doub);
                System.out.print("Introduce número Double. -1.0 para rematar: ");
                Doub = sc.nextDouble();
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }

        }
}
    
}