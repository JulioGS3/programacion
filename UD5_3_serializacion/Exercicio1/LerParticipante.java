package UD5_3_serializacion.Exercicio1;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *1. Crea unha clase Participante con nome, apelidos, e idade, que sexa serializable. Fai un programa que pida 3
participantes, e os grave un a un nun ficheiro binario participantes.dat, empregando serialización.

 */
public class LerParticipante implements Serializable{

    public static void main(String[] args) {
      
      openFile();
      readRecords();
      closeFile();
 
    }
    public String nome;
    public String apelidos;
    public int idade;
    private static ObjectInputStream input; // obxecto con fluxo de entrada
    
    public LerParticipante(String nome, String apelidos, int idade) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }
    

    public LerParticipante() {
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
    
    public static void openFile(){
       try 
       {
          input = new ObjectInputStream(          
             Files.newInputStream(Paths.get("participantes.dat")));
       } 
       catch (IOException ioException)
       {
          System.err.println("Erro abrindo ficheiro.");
          System.exit(1);
       } 
    }
    public static void closeFile()
   {
      try
      {
         if (input != null)
            input.close();
      } 
      catch (IOException ioException)
      {
         System.err.println("Error closing file. Terminating.");
         System.exit(1);
      } }
      
      
      public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%n",
         "nome", "Apelidos", "idade");
      try 
      {
      LerParticipante Participante;
      while ((Participante = (LerParticipante) input.readObject())!=null) //// lectura e cast ata EOFException
         {
            // mostramos os datos
            System.out.printf("%-10d%-12s%-12s%n",  
               Participante.getNome(), Participante.getApelidos(), 
               Participante.getIdade());
         } 
      }
      catch (EOFException endOfFileException)
      {
         System.out.printf("%nNon hai mais datos.%n");
      } 
      // Excepcion que xorde cando nos chega un obxecto que non esperamos
      catch (ClassNotFoundException classNotFoundException)
      {
         System.err.println("Tipo de obxecto inválido.");
      } 
      catch (IOException ioException)
      {
         System.err.println("Erro lendo o ficheiro.");
      } 
   } 
}
