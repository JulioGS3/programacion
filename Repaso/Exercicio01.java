/*15. Programa que tire unha moeda ao aire tantas veces como queira o xogador, indicando se acerta ou
non. Ao final deberá mostrar cantos acertos houbo e o número de veces xogadas */

package Repaso;

import java.util.Scanner;

public class Exercicio01 {
    
public static void main(String[] args) {
    

    Scanner entrada = new Scanner(System.in);


    int contador = 0;
    int acertos = 0;
    String opcion = ""; 
    while (!opcion.equals("n")) {
        
    
    System.out.println("elixe se queres cara ou cruz");
    String eleccion = entrada.nextLine();

    int moeda = (int)(Math.random()*2)+1;

    if(moeda == 1 && eleccion.equals("cara")){
        acertos++;
        contador++;

        System.out.println("acertaches xq saliu cara, queres tirar outra vez (s/n)");
    }
    else if( moeda == 2 && eleccion.equals("cruz")){
        acertos++;
        contador++;

        System.out.println("acertaches, saliu cruz, queres seguir tirando s/n");
    }else{
        System.out.println("sintoo non acertaches, queres seguir s/n");
        contador++;
    }

    opcion = entrada.nextLine();

}
System.out.println("adios logo acertaches " + acertos + " veces e intentachelo " + contador + " veces" );
}

    
}
