package UD5_3_serializacion.Exercicio1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *1. Crea unha clase Participante con nome, apelidos, e idade, que sexa serializable. Fai un programa que pida 3
participantes, e os grave un a un nun ficheiro binario participantes.dat, empregando serialización.

 */
public class Participante implements Serializable{

    public static void main(String[] args) {
        int contador = 0;
        Path ruta = Paths.get("participantes.dat");
    try{
        Path f = Files.createFile(ruta);
    }catch(IOException e){
        System.out.println(e);
    }
    JOptionPane.showMessageDialog(null, "introduce tres participantes:");
        while (contador != 3) {
            
            String nome = JOptionPane.showInputDialog("introduce o nome");
            String apelidos = JOptionPane.showInputDialog("introduce os apelidos");
            String edad = JOptionPane.showInputDialog("introduce a idade");
            int idade = Integer.parseInt(edad);
            Participante unParticipante = new Participante(nome, apelidos, idade);
            openFile();
            try{
            output.writeObject(unParticipante); 
           }catch (NoSuchElementException elementException)
           {
              System.err.println("Datos incorrectos.");
           } 
           catch (IOException ioException)
           {
              System.err.println("Error na escritura. Pechando.");
              break;
           } 
           closeFile();
            contador++;
    }
}

    public String nome;
    public String apelidos;
    public int idade;
    private static ObjectOutputStream output; // obxecto con fluxo de saída
    
    public Participante(String nome, String apelidos, int idade) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }
    public Participante() {
        nome ="x";
        apelidos = "x";
        idade = 0;
     
     }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Participante [nome=" + nome + ", apelidos=" + apelidos + ", idade=" + idade + "]";
    }
    
    public static void openFile()
   {
      try {
         output = new ObjectOutputStream(
            Files.newOutputStream(Paths.get("participantes.dat")));
      }
      catch (IOException ioException)
      {
         System.err.println("Error na apertura de ficheiro. Pechando.");
         System.exit(1);
      } }
      public static void closeFile() 
   {
      try 
      {
         if (output != null)
            output.close();
      } 
      catch (IOException ioException)
      {
         System.err.println("Erro pechando ficheiro. Pechando.");
      }
   } 
}