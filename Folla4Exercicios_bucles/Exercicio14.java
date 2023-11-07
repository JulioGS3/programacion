/*14. Programa que vaia pedindo repetidamente 3 números e os mostre ordeados. Despois de mostralos
preguntará se quere continuar, repetindo se o usuario contesta que ‘si’ á pregunta de se quere facelo de
novo. */

package Folla4Exercicios_bucles;
import java.util.Scanner;
public class Exercicio14 {
public static void main(String[] args) {
    
    Scanner escaner= new Scanner(System.in);

    String resposta;
    int maior;
    int menor;
    int medio;

    do{

    System.out.println("introduce un numero enteiro");
    int numero1= escaner.nextInt();

    System.out.println("introduce un numero enteiro");
    int numero2= escaner.nextInt();

    System.out.println("introduce un numero enteiro");
    int numero3= escaner.nextInt();
    escaner.nextLine();

        if(numero1>numero2){
            maior=numero1;
            menor=numero2;
        }else{
            maior=numero2;
            menor=numero1;
        }
        if(numero3<menor){
            medio=menor;
            menor=numero3;
        }
        else if(numero3>menor && numero3<maior){
            medio=numero3;
        }else{
            medio=maior;
            maior=numero3;
        }
        System.out.println("o maximo e "+maior);
        System.out.println("o minimo e "+menor);
        System.out.println("o do medio e "+medio);
        System.out.println("queres continuar");
        resposta= escaner.nextLine(); 

        }while(resposta.equals("si"));
         

        }
    
        }

            
    




