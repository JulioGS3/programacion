/*14. Fai un programa que mostre o seguinte menú. Vai simular unha calculadora.
a) Introducir 2 valores float. No main( ).
b) Elixe a operación a realizar, premendo a tecla * , / , + ou -, e chama a distintas funcións (unha
para suma, outra para a resta, a división e multiplicación), que fan o cálculo. O resultado
imprímese desde o main( ). */

package Folla10Exercicios_funcions;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    String opcion = "";
    float num1 = 0;
    float num2 = 0;
    
    while(!opcion.equals("s")){

    System.out.println("elixe unha opcion: ");
    System.out.println("a "+". introducir numeros" );
    System.out.println("* " +". para multiplicar preme *");
    System.out.println("/ "+ ". para dividir preme /");
    System.out.println("+ "+". para sumar preme +");
    System.out.println("- "+". para restar preme -");
    System.out.println("s "+". sair");

    
    opcion = entrada.nextLine();

        switch(opcion){

            case("a"):

                System.out.println("introduce 2 numeros");

                num1 = entrada.nextFloat();
                num2 = entrada.nextFloat();
                
                entrada.nextLine();

             break;

             case("*"):

                System.out.println(producto(num1, num2));

            break;

            case("/"):

                System.out.println(división(num1, num2));

            break;

            case("+"):

                System.out.println(suma(num1, num2));

            break;

            case("-"):

                System.out.println(resta(num1, num2));

            break;
        

        }
    }
}    
    public static float producto(float i, float j){

        float produto = i * j;
        return produto;
    }

    public static float división(float i, float j){

        float dividir = i / j;

        return dividir;
    }

    public static float suma(float i, float j){

        float sumar = i + j;
        return sumar;
    }

    public static float resta(float i, float j){

        float restar = 0;

        if (i > j){

        restar = i - j;

        return restar;
        
        }else{

        restar = j - i;
        
        return restar;
        }
    }
}
