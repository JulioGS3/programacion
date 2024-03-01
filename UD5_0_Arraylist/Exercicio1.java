package UD5_0_Arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *1.- Fai unha lista para gardar datos double, que corresponden a varias medidas dunha temperatura ambiente. 
 O programa irá pedindo esas medidas ata que se introduce 100. Cando se introduce o 100, mostrarase a media das temperaturas medidas.
 Exercicio1
 */
public class Exercicio1 {
public static void main(String[] args) {
    Double tamaño = 0.0;
    int cont = 0;
    String num = "";
    Double medidas = 0.0;
    ArrayList <Double> lista = new ArrayList<Double>();

    do{
        num = JOptionPane.showInputDialog("introduce un numero");
        medidas = Double.parseDouble(num);
        lista.add(medidas);
        cont ++;
    }while(medidas != 100.0);

        for (int i = 0; i < lista.size(); i++) {
            tamaño = tamaño + lista.get(i)/ lista.size();
            
        }
        System.out.println("a media e " + tamaño);

    }
}


