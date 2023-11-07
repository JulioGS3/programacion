/*18. Programa que invirta un número de 4 cifras introducido por teclado. */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio18 {
public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce un numero de 4 cifras");
    int num= entrada.nextInt();
    int dividir=0;
    int recompoñer=0;
    

        for(int i=0; i<4; i++){
         
            dividir=dividir*10 + num%10;
            num/=10;
           
            }
            
        System.out.println(dividir);
    
    
    }
    }


