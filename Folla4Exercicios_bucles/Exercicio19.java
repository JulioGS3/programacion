/*19. Programa que vaia pedindo números de 4 cifras e os vaia invertindo. */

package Folla4Exercicios_bucles;
import java.net.Socket;
import java.util.Scanner;
public class Exercicio19 {

public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce un numero de 4 cifras");
    int num= entrada.nextInt();
    int dividir=0;
    int recompoñer=0;
    
        while(num!=0){

            for(int i=0; i<4; i++){
         
            dividir=dividir*10 + num%10;
            System.out.println(dividir);
            num= num/10;
            }
            
        System.out.println(dividir);

        System.out.println("introduce outro");
    
        num= entrada.nextInt();
        }
    
    }
}
