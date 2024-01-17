/*5. Empregando os métodos da clase anterior, pide co JOptionPane un usuario e contrasinal, simulando o
acceso a un contido. Este contrasinal só será válido se ten unha letra maiúscula, un díxito e un cáracter
que non é nin díxito nin letra, pedíndoo de novo ata que sexa válido co JOptionPane . O programa
rematará cando o contrasinal sexa válido, indicando ao usuario que pode acceder */
package UD4_1_number;

import javax.swing.JOptionPane;

public class Exercicio5 {
public static void main(String[] args) {
    
    String contrasinal = "";
    boolean tenSimbolo = false;
    boolean tenMaiuscula = false;
    boolean tenNumero = false;

        do { 
 

            contrasinal = JOptionPane.showInputDialog("introduce un contrasinal, debe conter unha maiuscula, un numero e un simbolo");


            for ( int i = 0; i < contrasinal.length(); i++){

            char comprobar = contrasinal.charAt(i);
                
                if (Character.isDigit(comprobar) == true) {
                    tenNumero = true;
                }
                if (Character.isUpperCase(comprobar) == true){
                    tenMaiuscula = true;
                }
                if ( Character.isAlphabetic(comprobar) == false){
                    tenSimbolo = true;
                }        
        }
            

        } while (contrasinal.length() <= 5 || tenMaiuscula == false || tenNumero == false || tenSimbolo == false);
    
        
            JOptionPane.showMessageDialog(null,  "contrasinal establecido con exito");
    }
}
    
