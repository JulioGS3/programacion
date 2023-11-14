package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner ent= new Scanner(System.in);

        System.out.println("introduce tres números enteiros");

        int numero1= ent.nextInt();
        int numero2= ent.nextInt();
        int numero3= ent.nextInt();

        if(numero1<numero2 && numero1<numero3){

            System.out.println("o número menor e "+ numero1);

        }else if (numero2<numero1 && numero2<numero3){

            System.out.println("o numero menor e o "+ numero2);

        }else{
            
            System.out.println(" o numero menor e o "+numero3);
        }
    }
    
}
