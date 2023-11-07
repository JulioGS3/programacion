/*10. Programa que pida números e indique se son primos. O programa rematará se o número introducido é
negativo. */
package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
    
    Scanner ent= new Scanner(System.in);
    System.out.println("introduce un numero");
    int numero=ent.nextInt();
    int flag=0;

   while(numero>=0){
    flag =0;
    for(int i=2; i<numero; i++){

    if (numero%i==0){
        flag=1;
    }
}
       if (flag==0){
        System.out.println("e primo");
       }else{
        System.out.println("non e primo");
     
    }

System.out.println("introduce outro");
    numero=ent.nextInt();
   }
        

    }





    }

