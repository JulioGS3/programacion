package UD5_2_Ficheiros_serializacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 11. Queremos gardar nun ficheiro carreira.bin unha serie de resultado dunha carreira, formado
por dorsal (int) e tempo (double). Pide por teclado o dorsal e tempo de 5 corredores e gárdao
nun ficheiro binario.
12. Le o ficheiro anterior, mostrando eses valores por pantalla Exercicio5
 */
public class Exercicio5 {
public static void main(String[] args) {
    
    Path ruta = Paths.get("carreira.bin");
    try{
        Path f = Files.createFile(ruta);
    }catch(IOException e){
        System.out.println(e);
    }
    Scanner sc = new Scanner(System.in);
    FileOutputStream fos = null;
    DataOutputStream salida = null;
    FileInputStream fis = null;
    DataInputStream entrada = null;
    int dorsal;
    Double tempo;
    int contador = 1;

    try{
        fos = new FileOutputStream("carreira.bin");
        fis = new FileInputStream("carreira.bin");
        salida = new DataOutputStream(fos);
        entrada = new DataInputStream(fis);
        System.out.println("introduce o dorsal e o tempo dun corredor da carreira");
        dorsal= sc.nextInt();
        tempo = sc.nextDouble();
        salida.flush();
        while (contador != 5) {

            salida.writeInt(dorsal);
            salida.writeDouble(tempo);
            salida.flush();
            dorsal = entrada.readInt();
            tempo = entrada.readDouble();
            System.out.println("dorsal: "+dorsal + ", tempo: "+ tempo);

            System.out.println("introduce o dorsal e o tempo dun corredor da carreira");
            dorsal= sc.nextInt();
            tempo = sc.nextDouble();
            contador++;
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