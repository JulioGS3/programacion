/*5. Programa que pida números de 4 cifras e diga se son capicúas ou non. Rematará cando se introduzan
3 números que non son capicúas. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce un numero");
    int num= entrada.nextInt();
    int dividir=0;
    int x=num;
    if (num > 999 && num <= 9999){

        for(int i = 0; i < 4; i++){

            dividir=dividir*10 + num%10;
            num/=10;
           
            }
        System.out.println("á inversa é "+dividir);

        if(x == dividir){
            System.out.println("é capicua");
        }else{
            System.out.println("non e");
        }
        }    
        
}
        
        }

    



