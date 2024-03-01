package UD5_Ficheiros;

import java.io.File;

import javax.swing.JOptionPane;

/**
 * 5. Queremos facer un programa que para calquera ruta introducida, mostre:
• se o ficheiro existe ou non
• se se trata dun ficheiro ou dun directorio
• se é un ficheiro mostrar: nome, tamaño, permisos de lectura e escritura. Exercicio5
 */
public class Exercicio5 {
public static void main(String[] args) {
    String opcion = "";
    String ruta = "";
    do{  //feito sen meter ruta. probar a cambiar e poder poñer rutas

        ruta = JOptionPane.showInputDialog("introduce a ruta, ou pulsa 's' para sair");
        opcion = JOptionPane.showInputDialog("introduce o nome dun ficheiro ou directorio ou, pulsa 'S' para sair");

        File ficheiro = new File(ruta+opcion);

        if(ficheiro.exists() == true){
            System.out.println("existe");
        }else{
            System.out.println("o ficheiro non existe");
        }
        if(ficheiro.isDirectory() == true){
            System.out.println("e un directorio");
        }
        if(ficheiro.isFile() == true){
            System.out.println("e un ficheiro");
            System.out.println("o seu nome e " + opcion);
            if(ficheiro.canRead() == true){
                System.out.println("ten permisos de lectura");
            }else{
                System.out.println("non ten permisos de lectura");
            }
            if(ficheiro.canWrite() == true){
                System.out.println("ten permisos de escritura");
            }else{
                System.out.println("non ten permisos de escritura");
            }
        }
        System.out.println(ficheiro.length() + " bytes");
 
    }while(!opcion.equals("s") && !opcion.equals("S") || !ruta.equals("s") && !ruta.equals("S"));

}
    
}