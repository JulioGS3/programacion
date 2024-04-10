package Corredor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 11. 13. Despois de ler o ficheiro carreira.bin nun ArrayList, o programa deberá preguntar se queremos
gardar máis tempos, e se é así, gardar todos (os que xa había e os novos) no ficheiro.
Comproba co código do exercicio anterior que os novos tempos están gardados no ficheiro
 */
public class AppCorredor {

public static void main(String[] args) {
    
    Path ruta = Paths.get("carreira.bin");
    try{
        Path f = Files.createFile(ruta);
    }catch(IOException e){
        System.out.println(e);
    }
    Scanner sca = new Scanner(System.in);
    FileOutputStream fos = null;
    DataOutputStream salida = null;
    FileInputStream fis = null;
    DataInputStream entrada = null;
    int dorsal;
    Double tempo;
    int contador = 0;
    ArrayList <Corredor> array = new ArrayList<Corredor>();

    try{
         input = new ObjectInputStream(          
            Files.newInputStream(ruta));
      } 
      catch (IOException ioException)
      {
         System.err.println("Erro abrindo ficheiro.");
         System.exit(1);
      } 
    
    try{
        fos = new FileOutputStream("carreira.bin");
        fis = new FileInputStream("carreira.bin");
        salida = new DataOutputStream(fos);
        entrada = new DataInputStream(fis);
        while (contador != 5) {
            
            System.out.println("introduce o dorsal e o tempo dun corredor da carreira");
            dorsal= sca.nextInt();
            tempo = sca.nextDouble();
            salida.writeInt(dorsal);
            salida.writeDouble(tempo);
            salida.flush();
            Corredor unCorredor = new Corredor(dorsal, tempo);
            array.add(unCorredor);
            dorsal = entrada.readInt();
            tempo = entrada.readDouble();
            System.out.println("dorsal: "+dorsal + ", tempo: "+ tempo);
            contador++;
        }
        for (Corredor corredor : array) {
            System.out.println(corredor.toString());
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
