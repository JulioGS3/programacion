package UD5_2_Ficheiros_serializacion;
/**
 *7. Comproba que funciona o exemplo dos apuntes para escribir un número de enteiros
introducidos por teclado
8. Comproba tamén que podes ler os datos do ficheiro creado no exercicio anterior Exercicio3
 */
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exercicio3 {   
 public static void main(String[] args) {
        escribirInt();
    }
    //Uso de recursos e excepcións clásica sen try with resources
    private static void escribirInt() {
            
        Scanner sc = new Scanner(System.in);                                                                      
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int n;
        try {
            fos = new FileOutputStream("datos.dat");
            salida = new DataOutputStream(fos);
            System.out.print("Introduce número enteiro. -1 para rematar: ");
            n = sc.nextInt();
            while (n != -1) {
                salida.writeInt(n); //Escrébese o número enteiro no ficheiro                                   
                System.out.print("Introduce número enteiro. -1 para rematar: ");
                n = sc.nextInt();
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
       
        try {
            fis = new FileInputStream("datos.dat");
            entrada = new DataInputStream(fis);
            while (true) {   
                n = entrada.readInt();  //se lee  un enteiro do ficheiro                                           
                System.out.println(n);  //se mostra na pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
}
    }
}
