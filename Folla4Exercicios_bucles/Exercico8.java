/*Fai un programa que mostre a táboa de multiplicar dun número enteiro positivo menor que 20
introducido por teclado. Deberá comprobar que o número é positivo e menor que 20. A saída do
programa deberá ser (se se teclea o 2) */

package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercico8 {
public static void main(String[] args) {

    Scanner ent=new Scanner(System.in);
System.out.println("introduce un numero enteiro menor ca 20");

int numero= ent.nextInt();


if(numero>20 || numero<0){
    System.out.println("non se pode facer");
    return;
} 

for( int i=0; i<=10; i= i+1){
    int resultado= numero*i;
    System.out.println(i+" x "+ numero+" = "+ resultado );
}



}    
}
