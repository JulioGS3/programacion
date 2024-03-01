package UD5_1_Ficheiros_texto.Exercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *Exercicio 3

Queremos facer un programa para xestionar usuarios dunha biblioteca: nomeUsuario, email, teléfono. Define unha clase Usuario para isto. 
Gardaremos eses usuarios nun ArrayList. O programa deberá mostrará un menú:

    introducir usuarios desde teclado
    gardar usuarios nun ficheiro. Gardaremos cunha liña de texto, separando os atributos por “:”. Para isto define un método toStringParaGardar() 
    na clase Usuario, que chames para gardar os usuarios no ficheiro
    recuperar usuarios do ficheiro
    borrar o contido do ficheiro
    mostrar todos os usuarios.

Nunha segunda execución do programa temos que poder recuperar os datos do ficheiro e ver os usuarios gardados no ficheiro AppUsuarios
 */
public class AppUsuarios {
public static void main(String[] args) {
    
    String opcion = "";
    int contador = 0;
    File file = new File ("usuarios.txt");
    ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
    while (!opcion.equals("6")) {

        opcion = JOptionPane.showInputDialog("elixe: \n 1) introducir usuario \n 2) gardar usuarios nun ficheiro \n 3) recuperar usuarios do ficheiro \n 4) borrar contido do ficheiro \n 5) mostrar todos os usuarios \n 6) sair ");

        switch (opcion) {
            case "1":
                    String nome = JOptionPane.showInputDialog("introduce o nome");
                    String email = JOptionPane.showInputDialog("introduce o email");
                    String tel = JOptionPane.showInputDialog("introduce o telefono");
                    int telf= Integer.parseInt(tel);
                    Usuario unUsuario = new Usuario(nome,email ,telf);
                    listaUsuarios.add(unUsuario);
                break;
        
            case "2":
                
                try{
                    FileWriter fw = new FileWriter(file, true);
                    for (Usuario usuario : listaUsuarios) {
                        fw.write(usuario.toString());
                        fw.flush();
                    }
                }catch(IOException e){
                    System.out.println(e);
                }

                break;

            case "3":
                listaUsuarios.clear();
                try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
                    String line = bufferedReader.readLine();
                while(line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                    int posicion = line.indexOf(";");
                    String nombre = line.substring(0, posicion-1);
                    line = line.substring(posicion+1);
                    int pos2 = line.indexOf(";");
                    String mail = line.substring(0, pos2-1);
                    String telef = line.substring(pos2+1);
                    int telefo = Integer.parseInt(telef);
                    Usuario novUsuario = new Usuario(nombre, mail, telefo);
                    listaUsuarios.add(novUsuario);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
                break;

            case "4":
               file.delete();
                
                break;

            case "5":
                for (Usuario usuario : listaUsuarios) {
                    System.out.println(usuario.toString());
                }
            break;

            }   

}
}
}