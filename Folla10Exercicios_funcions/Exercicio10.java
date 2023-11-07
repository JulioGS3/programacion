/*10. Escriba unha función que reciba como argumento un número enteiro e devolva o número cos díxitos
invertidos. Para o número 12344, devolverá 44321. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
  

    System.out.println("introduce un numero de 4 cifras");
    int num= entrada.nextInt();

    int resultado=0;
    int recompoñer=0;
    
    resultado = invertir(num);
    System.out.println(resultado);
}
public static int invertir (int i){

    int dividir = 0;
        for(int a=0; a<4; a++){
         
            dividir=dividir*10 + i%10;
            i/=10;
        }
        return dividir;
            }
            
        
}    

