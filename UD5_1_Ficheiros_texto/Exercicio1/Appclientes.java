package UD5_1_Ficheiros_texto.Exercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Appclientes
 */
public class Appclientes {

public static void main(String[] args) {

    String opcion = "";
    ArrayList<Clientes> clientes = new ArrayList<Clientes>();

    while (!opcion.equals("3")) {

        opcion = JOptionPane.showInputDialog("elixe unha destas opcions \n 1) gardar clientes \n 2) ler clientes \n 3) sair");

        switch (opcion) {
            case "1":

            clientes.add(new Clientes("Ana", "Fernández López",23));
            clientes.add(new Clientes("Antón", "Sueiro Sueiro",33));
            clientes.add(new Clientes("Xan", "Ferreiro Ferreiro",77));

            String fichero = "clientes.txt"; 
            File f = new File(fichero);
            try (FileWriter fw = new FileWriter(f)) {
                PrintWriter escritura = new PrintWriter(fw);
                for (int i = 0; i < clientes.size(); i++) {
                    String cadea = clientes.get(i).getNome() + ";"+ 
                        clientes.get(i).getApelidos()+ ";" +
                        clientes.get(i).getIdade();
                    escritura.println(cadea);
                }
            } catch (IOException e) {
                System.out.println("Non se pode abrir o ficheiro para escritura");
            }
     
                break;
        
            case "2":
            
                String ficheiro = "clientes.txt"; 
                File file = new File(ficheiro);
                try {
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    String cadea;
                    String [] atributos;
                    while((cadea = br.readLine())!= null){
                        atributos = cadea.trim().split(";");
                        clientes.add(new Clientes(atributos[0], atributos[1], Integer.parseInt(atributos[2])));
                }
                br.close();

                for (Clientes cliente : clientes) {
                        System.out.println(cliente.getNome()+", "+cliente.getApelidos()+", "+cliente.getIdade());
                }
                } catch (Exception e) {
                    System.out.println("Houbo un problema lendo o ficheiro");
                }
            
                break;
        }
    }


    }
}