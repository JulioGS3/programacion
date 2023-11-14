/*2. Fai o exercicio anterior empregando unha variable chamada menor onde se vaia gardando o
menor número en cada comparación. Emprega só 2 comparacións  */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner ent= new Scanner(System.in);

        System.out.println("introduce tres números enteiros");

        int numero1= ent.nextInt();
        int numero2= ent.nextInt();
        int numero3= ent.nextInt();
        int numeroMenor = 0;
        

        if(numero2 < numeroMenor){

            numeroMenor= numero2;
        }
        if(numero3<numeroMenor){ 

        System.out.println(" o número menor e "+numero3);

        }else{

        System.out.println(" o menor e "+numeroMenor);
        
        }
        }
    }
        
    


