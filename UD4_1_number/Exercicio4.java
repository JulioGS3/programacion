/*4. Emprega a clase JOptionPane para ir pedindo unha letra por teclado (se son varias, o programa collerá
a primeira). Despois emprega os métodos da clase Character para formar unha cadea de texto que
indique se o carácter é ou non unha letra, se está en minúsculas ou maiúsculas, e se é ou non un
número. */
package UD4_1_number;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio4 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    String letra = "";
    String cadea = "";
    String cadeaFinal = "";

    letra = JOptionPane.showInputDialog("introduce unha letra");

    char primeira = letra.charAt(0);
    
    cadea = letra + " empeza por " + primeira + " e";

    if(Character.isLetter(primeira) == true){
        cadea = cadea + " é unha letra ";

        if (Character.isUpperCase(primeira) == true) {
        cadea = cadea +" que está en maiuscula";
    }else{cadea = cadea + " que esta minuscula";}
    }
    if (Character.isDigit(primeira) == true){
        cadea = cadea + " é un dixito";
    }
    if (Character.isLetterOrDigit(primeira) == false){
        cadea = cadea + " é un simbolo";
    }
    JOptionPane.showMessageDialog(null, cadea);
    








}
    
}