/*13. Programa que mostre o seguinte menú, e cada opción chame a unha función (excepto a opción a)
que non chama a unha función) que faga o cálculo. Non empregues arrays:
a) Introducir 3 valores enteiros. (sen chamada a función, directamente no main( ) )
b) Mostrar os 3 valores.
c) Calcular a media. A función calculará os valores e o resultado imprimese no main( ) .
d) Calcular o maior dos 3 valores.
e) Calcular o menor dos 3 valores. */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {

    String opcion = "";
    Scanner entrada = new Scanner(System.in);
    int flag = 0;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

        while(!opcion.equals("f")){

        System.out.println("elixe unha opcion: ");
        System.out.println("a " +". introuce 3 numeros");
        System.out.println("b "+ ". mostrar numeros");
        System.out.println("c "+". calcular a media");
        System.out.println("d "+". calcular o maior dos 3");
        System.out.println("e "+". calcular o menor dos 3");
        System.out.println("f "+". sair");

        opcion = entrada.nextLine();

        int media = 0;
        int maior = 0;
        int menor = 0;
    
    switch (opcion) {

        case ("a"):

            System.out.println("introduce 3 numeros");

            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
            num3 = entrada.nextInt();
            
            break;
        
        case("b"):

            System.out.println(mostrar(num1));

            System.out.println(mostrar(num2));
          
            System.out.println(mostrar(num3));

            break;

        case("c"):

            media = media(num1, num2, num3);
            System.out.println("a media e " + media);

            break;
        
        case("d"):

            maior = maior(num1, num2, num3);
            System.out.println("o maior e " + maior);

        break;

        case("e"):
        
            menor = menor(num1, num2, num3);
            System.out.println("o meor e " + menor);
    }
    }
   
    }
        public static int mostrar(int i){

        return i;

        }

        public static int media (int i, int j, int l){

            int media = (i + j +l)/3; 

        return media;
        
        }

        public static int maior (int i, int j, int l){

    
            if( i > j && i > l){
                return i;
            }
            if(j > i && j > l){
                return j;
            }else{
                return l;
            }
        }
        
        public static int menor (int i, int j, int l){

            if( i < j && i < l){
                return i;
            }
            if(j < i && j < l){
                return j;
            }else{
                return l;
            }
        }
    
    }

    

