/*6. Fai un programa que faga repetidamente conversións de euros a dólares ou viceversa, empregando
JoptionPane. O valor numérico do resultado deberá ter sempre un ancho de 7 en total, con 2 decimais.
O programa deberá preguntar que tipo de cambio quere facer, de cada vez, ou se quere saír do
programa: mostra un menú con varias liñas empregando “\n” en linux (ou “\r\n” en Windows).
Tamén podes empregar “%n” se empregas o método da clase String.format() */
package UD4_1_number;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio6 {
public static void main(String[] args) {
    
    String opcion = "";

    while(!opcion.equals("c")){

        opcion = JOptionPane.showInputDialog("Que tipo de conversion queres facer? \n a ) euros a dollares ?  \n b ) dollares a euros ? \n c ) sair  ");
        String cantidade = JOptionPane.showInputDialog("introduce a cantidade que deseas");

        Double cantidadeConvertida = Double.parseDouble(cantidade);

        if(opcion.equals("a")){

            Double cantidadeConvert = cantidadeConvertida * 1.09;
            String cadea = String.format(cantidadeConvertida + " euros son %08.2f dolares" , cantidadeConvert);
            JOptionPane.showMessageDialog(null, cadea);
        }
        if(opcion.equals("b")){

            Double cantidadeConvert = cantidadeConvertida / 1.09;
            String cadea = String.format(cantidadeConvertida + " dolares son %08.2f euros" , cantidadeConvert);
            JOptionPane.showMessageDialog(null, cadea);
        }
        
      
    }
    JOptionPane.showMessageDialog(null, "adios");
    

}
}