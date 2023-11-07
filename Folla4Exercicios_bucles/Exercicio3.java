/*3. Fai un programa que pida repetidamente dous números e faga a división sempre que o divisor non sexa
0. Rematará cando un dos dous números sexa 100. */


package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
        
Scanner ent= new Scanner(System.in);

System.out.println("introduce dividendo e divisor");
int dividendo=ent.nextInt();
int divisor=ent.nextInt();

if(divisor==0){
    System.out.println("non se pode facer");
    return;
}
while( divisor!=100 && dividendo!=100){
    int resultado= dividendo/divisor;
    System.out.println("resultado = "+resultado);
    System.out.println("introduce outra vez");
    
    dividendo=ent.nextInt();
    divisor=ent.nextInt();
}



    }
}
