/*16. Pedir un número enteiro por pantalla e mostrar se é par ou impar. */

import java.util.Scanner;

public class Exercicio16 {  
public static void main(String[] args) {
    
Scanner ent= new Scanner(System.in);

System.out.println("introduce un número enteiro ");
int numero= ent.nextInt();

if(numero%2==0){
    System.out.println(" o número é par");
}else{
    System.out.println("o número é impar");
}
}
}