package UD5_0_Arraylist;

import java.util.ArrayList;

/**
 *4.- Crea un array de 10 enteiros. Asigna os 10 primeiros pares como valores. Crea agora un arraList que sexa similar ao array creado.
  Exercicio4
 */
public class Exercicio4 {
public static void main(String[] args) {
    
    int [] arrayEnteiros = new int[10];
    ArrayList <Integer> lista = new ArrayList<Integer>();

    for (int i = 1; i <= arrayEnteiros.length; i++) {
        arrayEnteiros [i-1] = i*2;
        lista.add(i*2);
        }
        for (int i : arrayEnteiros) {
            System.out.println("array " + i);
        }
        for (Integer integer : lista) {
            System.out.println("lista " + integer);
        }
    
    
    }

}
    
