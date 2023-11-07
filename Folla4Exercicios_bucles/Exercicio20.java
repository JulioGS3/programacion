/*20. Fai un programa que faga a división de 2 números enteiros introducidos por teclado empregando só a
operación resta */

package Folla4Exercicios_bucles;
import java.util.Scanner;
public class Exercicio20 {
public static void main(String[] args) {
   

    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce 2 numeros");
    int dividendo= entrada.nextInt();
    int divisor= entrada.nextInt();
    
    int resta=0;
    int cont=0;

        while(dividendo>=divisor){

            dividendo=dividendo-divisor;
            
            cont++;
        }
    

       System.out.println(cont);
    }
}
