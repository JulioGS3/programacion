/*9. O programa repetirá o exercicio anterior, pedindo outro(s) número(s). Rematará cando o número
introducido sexa 0. */
package Folla4Exercicios_bucles;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {

    Scanner ent=new Scanner(System.in);
System.out.println("introduce un numero enteiro menor ca 20");

int numero= ent.nextInt();


if(numero>20 || numero<0){
    System.out.println("non se pode facer");
    return;
} 
while(numero!=0){
for( int i=0; i<=10; i= i+1){
    int resultado= numero*i;
    System.out.println(i+" x "+ numero+" = "+ resultado );
  
}
System.out.println("introduce outro");
numero = ent.nextInt();
}
}    
}