package UD5_Ficheiros;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 * 1. Cal sería o código para saber se o indicado no path é un ficheiro? E se é
posible escribir no mesmo? Fai un programa que vaia pedindo o nome dun ficheiro, e mostre se existe e
se é posible escribir no mesmo. Faino coa clase File, e coa API NIO.
 */

public class Exercicio1 {

    Exercicio1(String ruta){}
public static void main(String[] args) {
    String nome;
    do{
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce o nome dun ficheiro, se queres sair pulsa 'N'");
    nome = entrada.nextLine();

    File ficheiro = new File("/home/sanclemente.local/a23juliogs/"+nome); 
    
    if(ficheiro.exists() == false){
        System.out.println("non existe");
    }else{System.out.println("si existe");}
    if(ficheiro.isFile() == false){
        System.out.println("non e un ficheiro");
    }else{System.out.println("si é un ficheiro");}
    if(ficheiro.canWrite() == false){
        System.out.println("non se pode escribir");
    }else{System.out.println("si que se pode escribir");
}

Path ruta = Paths.get("/home/sanclemente.local/a23juliogs/"+nome);


    if(Files.exists(ruta) == true){
    System.out.println("existe");
    }else{
        System.out.println("non existe");
    }
    if(Files.isRegularFile(ruta) == true){
        System.out.println("e un ficheiro");
    }else{
        System.out.println("non e un ficheiro");
    }
     if(Files.isWritable(ruta) == true){
        System.out.println("si se pode escribir");
    }else{
        System.out.println("non se pode escribir");
    }

}while(!nome.equals("n"));
}
}
    
