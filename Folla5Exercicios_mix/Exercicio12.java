/*12. Vai pedindo números de 4 cifras e redondéaos á centena máis próxima. 1234 dará 1200 e 1298 dará
1300. Remata cando o usuario queira. */

package Folla5Exercicios_mix;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce o numero");
    int num= entrada.nextInt();
    int centenas= num/100;
    String resposta;
    


        if (num%100>=50){

            int redondeoArriba= (centenas+1)*100;

            System.out.println(redondeoArriba);
        }

        if(num%100<50){

            int redondeoAbaixo= (centenas*100);

            System.out.println(redondeoAbaixo);
            entrada.nextLine();
        }
        System.out.println("queres seguir?");
        
        resposta = entrada.nextLine();
        
        while(resposta.equals("si")){
         System.out.println("mete outro");
            num=entrada.nextInt();
            
            if (num%100>=50){

                int redondeoArriba= (centenas+1)*100;
    
                System.out.println(redondeoArriba);
                }
    
            if(num%100<50){
    
                int redondeoAbaixo= (centenas*100);
    
                System.out.println(redondeoAbaixo);
             }
             entrada.nextLine();
            System.out.println("queres seguir?");
    
            resposta = entrada.nextLine();

                
        }
            if(resposta.equals("no")){

            System.out.println("fin");
            }

        }
        }


