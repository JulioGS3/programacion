/* 7. Fai un programa que simule do xogo do aforcado. Teremos 8 gardadas de 8 letras nun array de String.
Cando o programa elixa aleatoriamente a palabra, aparecerá unha ventá mostrando 8 liñas “_ _ _ _ _ _ _
_” e o usuario terá que ir introducindo letras. Cando teclee unha letra da palabra elixida, a letra aparecerá
no que se ve (por exemplo se a palabra é elefante, e introduce a ‘e’ verase así “e _ e _ _ _ _ e”. Terá 10
intentos para atopar a palabra. Mostra ademais da palabra incompleta, os intentos que lle quedan, e as
letras que foi elixindo previamente. */
package UD4_1_number;

import javax.swing.JOptionPane;

public class Exercicio7 {
public static void main(String[] args) {

     String [] arrayPalabras = new String [8];

    arrayPalabras[0] = "pirineos";
    arrayPalabras[1] = "elefante";
    arrayPalabras[3] = "carretes";
    arrayPalabras[4] = "pantalla";
    arrayPalabras[5] = "programa";
    arrayPalabras[6] = "lagartos";
    arrayPalabras[7] = "rallados";

    JOptionPane.showMessageDialog(null, "Este e o xogo do aforcado, pulsa ok para elexir unha palabra, tes 10 intentos para introducir letras");
    int azar = (int) (Math.random()*7)+1;
    int contador = 0;
    String palabraElexida = arrayPalabras [azar];
    char [] arrayCaracteres = palabraElexida.toCharArray();
    char [] arrayOculto = new char [8]; 
    String palabra= "";

        for (int i = 0; i < arrayOculto.length; i++){
        arrayOculto[i] = '-';
        }
       

        while (contador<=10) {
            
        for (char i : arrayOculto) {
        palabra = palabra + i;}
        if( palabra.length() > 8){
            palabra = palabra.substring(8);
        }
        
        String adivinar = JOptionPane.showInputDialog(palabra);
        
        contador++;
      
            while (palabraElexida.contains(adivinar)) {
          
            int posicion = palabraElexida.indexOf(adivinar);
            char caracter = palabraElexida.charAt(posicion);
            palabraElexida = palabraElexida.replaceFirst(adivinar, ".");
            arrayOculto[posicion] = caracter;
            System.out.println(arrayOculto);
            
            }
        }
            String mensaxeFinal = "pasacheste de intentos, sintoo";
            JOptionPane.showMessageDialog(null, mensaxeFinal);
            
        }


    }
    
