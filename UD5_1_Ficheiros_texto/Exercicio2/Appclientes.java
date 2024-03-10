package UD5_1_Ficheiros_texto.Exercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Appclientes
 */
public class Appclientes {

public static void main(String[] args) {

    String opcion = "";
    ArrayList<Clientes> clientes = new ArrayList<Clientes>();

    while (!opcion.equals("3")) {

        opcion = JOptionPane.showInputDialog("elixe unha destas opcions \n 1) gardar datos dos clientes \n 2) ler clientes \n 3) sair");

        switch (opcion) {
            case "1":

            clientes.add(new Clientes("Ana", "Fernández López",23));
            clientes.add(new Clientes("Antón", "Sueiro Sueiro",33));
            clientes.add(new Clientes("Xan", "Ferreiro Ferreiro",77));

            Appclientes.escribirLineas(clientes);
     
                break;
        
            case "2":
            Appclientes.lerLineas();
                break;
        }
    }
}

    public static void escribirLineas(ArrayList<Clientes> array){ // pasamoslle xa un arrayList
        
        Charset cs = Charset.forName("ISO-8859-1");
        
        ArrayList<String> arrayStringClientes = new ArrayList<String>();

        //convertimos o arraylist de clientes en array de string para que poida leer o .write, pois teñen q ser strings
        for (Clientes string : array) {
            arrayStringClientes.add(string.getNome() +" "+ string.getApelidos()+ " " + string.getIdade());    
        }
        try{
            Files.write(Paths.get("clientes.txt"), arrayStringClientes, cs);
            }
        catch(IOException e){
            System.out.println(e);
        }
        }

    public static void lerLineas() {
        Charset charset = Charset.forName("ISO-8859-1"); // alfabeto Europa occidental
        try {
            // non nos preocupamos nin de abrir nin de pechar ningun recurso
            List<String> lineasLer = Files.readAllLines(Paths.get("clientes.txt"), charset);
            for (String line : lineasLer) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
