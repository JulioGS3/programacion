/*5. Dados 2 números introducidos por teclado, decidir se algún é divisor do outro. */

package Folla2Exercicios_if;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner ent= new Scanner(System.in);

        System.out.println("introduce o primeiro número ");
        int numero1= ent.nextInt();
        System.out.println("introduce o segundo número");
        int numero2= ent.nextInt();

        if( numero2==0){
            System.out.println("error ");
        }
        if( numero1==0){
                System.out.println("error ");
        }
        if((numero1%numero2)==0){
            System.out.println(numero2+" é divisor de "+numero1);
        }
        if((numero2%numero1)==0){
            System.out.println(numero1+" é divisor de "+numero2);
        
        }else{
            System.out.println("ningún é divisor ");
        }
    }
}

