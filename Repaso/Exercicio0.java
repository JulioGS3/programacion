/*2. Simula o xogo de lanzar 2 dados, dandolle ao xogador 3 intentos como máximo para achegarse ao 21.
Se chega xusto felicítao, e se non indicalle que perdeu. O xogador pode plantarse en calquer intento
anterior ao terceiro. */

package Repaso;

import java.util.Scanner;

public class Exercicio0 {
 
public static void main(String[] args) {
    
    
    Scanner entrada = new Scanner(System.in);

    int dado1 = 0;
    int dado2 = 0;
    int sumaTirada = 0;
    String opcion = "si";

    System.out.println("primerio lanzamento");


    while(!opcion.equals("no")){
        
       
    dado1= (int)(Math.random()*6)+1;
    dado2 = (int) (Math.random()*6+1);    
    System.out.println(dado1);
    System.out.println(dado2);

    sumaTirada = sumaTirada + dado1 + dado2;
    
    if(sumaTirada == 21){
        System.out.println("21 blackjack!");
        break;
    }
    if (sumaTirada > 21){
        System.out.println("sentimolo, acumulas " + sumaTirada + ",  pasacheste, o xogo rematou");
        break;
    }
     
        System.out.println("sacaches " + sumaTirada + " queres seguir si/no?");

        opcion = entrada.nextLine();
    
    }   
    
    System.out.println("adios");
        
    }



}    