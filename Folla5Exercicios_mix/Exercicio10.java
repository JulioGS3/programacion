/*10. Simula o xogo de lanzar 1 dado, dándolle ao xogador o número de intentos que considere oportuno
para achegarse ao 21. Se chega xusto felicítao, e se non indícalle que perdeu. O xogador pode
plantarse en calquera intento. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
    int tirada = 0;
    int acumulado = 0;
    String resposta;
     
            tirada= (int)(Math.random()*6)+1;

            acumulado = tirada;

            System.out.println("saliu o "+acumulado+" qeres seguir si/no?");

            resposta = entrada.nextLine();

            while(resposta.equals("si")){

                if(acumulado<21){

                    tirada= (int)(Math.random()*6)+1;

                    acumulado = acumulado+tirada;

                }if(acumulado == 21){

                    System.out.println("felicidades sacaches 21");
                    break;

                }if(acumulado >21) {

                    System.out.println(acumulado+" pasaceheste");
                    break;
                }

                System.out.println("acumulas "+acumulado+" queres seguir?");
                
                resposta=entrada.nextLine();

                if(resposta.equals("no")){

                System.out.println("sacaches "+acumulado);
                }
        }
        }
        }
    

    




        
        
        

    

        
    








