/*14. Fai un programa para adiviñar un número entre 0 e 100, indicando se falla se o número era maior ou
menor. Conta o número de intentos, e móstrao ao final. Permite ao xogador plantarse se quere. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int cont = 0;
    String resposta="si";
     
    int num=0;
    int tirada =(int) (Math.random()*10);
    
    while(resposta.equals("si") && num!=tirada ){
        
        System.out.println("elixe un numero");
        num=entrada.nextInt();

            if(tirada>num){
                System.out.println("sintoo saliu un numero maior");

            }
            if(tirada<num){
                System.out.println("sintoo saliu un numero menor");
            }
            if(tirada==num){
                System.out.println("felicidades acertaches");
                break;
            }
        
        System.out.println("queres volver a probar");

        entrada.nextLine();
        resposta=entrada.nextLine();

       
        cont ++;
    }
    System.out.println("ok, paramos, intentachelo " + cont);
    }
}
