/*13. Programa que pida números e mostre se rematan en 0 ou en 5. Ao final deberá indicar o número de
números introducidos. O programa rematará se o número introducido remata en 3. */

package Folla5Exercicios_mix;
import java.util.Scanner;
public class Exercicio13 {
public static void main(String[] args) {
        
    
    Scanner ent= new Scanner(System.in);
    System.out.println("introduce un numero");
    int numero=ent.nextInt();
    int cont=0;

    while(numero>=0){

        int n1= numero % 10;

        if(n1 ==0){

            System.out.println("sí que remata en 0");
        
        }

        if(n1==5){

            System.out.println("remata en 5");

        }
       

        if(n1 == 3){

            System.out.println("acaba en 3, fin");
            break;
        }

        cont+=1;
        System.out.println("proba con outro");
        numero=ent.nextInt();
        }


        System.out.println("meteches "+cont+ " numeros " );

}
}
