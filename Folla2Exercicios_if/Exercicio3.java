/*3. Fai, empregando unha variable menor, o menor de 6 números enteiros. Só con 5 comparacións,
gardando o valor do menor nunha variable chamada menor. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("introduce seis números enteiros");

        int numero1= ent.nextInt();
        int numero2= ent.nextInt();
        int numero3= ent.nextInt();
        int numero4= ent.nextInt();
        int numero5= ent.nextInt();
        int numero6= ent.nextInt();
        int numeroMenor=numero1;

        if(numero2<numeroMenor){
            numeroMenor=numero2;
        }
        if(numero3<numeroMenor){
            numeroMenor=numero3;
        }
        if (numero4<numeroMenor){
            numeroMenor=numero4;
        }
        if (numero5<numeroMenor){
            numeroMenor=numero5;
        }
        if (numero6<numeroMenor){
            System.out.println(" o menor é "+numero6);
        }else{
            System.out.println("o numero menor e "+numeroMenor);
        }
    }
    
}
