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
       
        switch (opcion) {

            case "a":
                String cantidadeEuros = JOptionPane.showInputDialog("introduce a cantidade  de euros que deseas convertir");
                Double cantidadeConvertida = Double.parseDouble(cantidadeEuros);
                Double cantidadeXaConvertida = cantidadeConvertida * 1.09;
                String cadea = String.format(cantidadeConvertida + " euros son %08.2f dolares" , cantidadeXaConvertida);
                JOptionPane.showMessageDialog(null, cadea);
                break;
        
           case "b":
                String cantidadeDolares = JOptionPane.showInputDialog("introduce a cantidade  de dolares que deseas convertir");
                 Double cantidadeConvert = Double.parseDouble(cantidadeDolares);
                Double cantidade = cantidadeConvert / 1.09;
                String cadea2 = String.format(cantidadeConvert + " dolares son %08.2f euros" , cantidade);
                JOptionPane.showMessageDialog(null, cadea2);
                 break;
            case "c":
                JOptionPane.showMessageDialog(null, "adios");
                break;
      
    }
   
}

}
}