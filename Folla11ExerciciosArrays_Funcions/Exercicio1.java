/*1. Fai un programa na que se defina un array de 4 floats, con dúas funcións: unha para introducir os
valores do array desde teclado e outra para mostralos ao final. */

package Folla11ExerciciosArrays_Funcions;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    float [] arraiFloat = new float [6]; 

arraiDentro(arraiFloat, entrada);
mostrarArrai(arraiFloat);


}   

public static void arraiDentro(float [] arraiDentro, Scanner entrada){


    for( int i = 0; i <arraiDentro.length; i++){
        
        System.out.println("introduce numeros");
        arraiDentro [i] = entrada.nextFloat();

    }
}

public static void mostrarArrai(float [] mostrarArrai){

for( int i = 0; i < mostrarArrai.length; i++){

    System.out.println(mostrarArrai[i]);   

    

}
}
}


