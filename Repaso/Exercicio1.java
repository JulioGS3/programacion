package Repaso;
import java.util.Scanner;

public class Exercicio1 {
    /*1. Define un array de 6 enteiros, e mostra un menú para facer o seguinte (para imprimir o array
prememos 'e'):
a) Introducir os valores.
b) Multiplicar todos os valores por 3.
c) Calcular a media dos valores.
d) Intercambiar os números 2 a 2: o primeiro co segundo, o terceiro co cuarto, e o quinto co sexto.
e) Imprimir o array.
f) Ir almacenando a partir da posición 3ª o produto dos elementos anteriores: na posición 3ª o
produto dos 2 primeiros valores, na posición 4ª dos 3 primeiros valores, e así sucesivamente. */

public static void main(String[] args) {

    String opcion= "";
    int [] arrayEnteiros = new int [6];
    Scanner entrada = new Scanner(System.in);
  

    while(!opcion.equals("g")){

        System.out.println("elixe unha das seguintes opcions");
        System.out.println("a " + ". introducir os valores");
        System.out.println("b " + ". Multiplicar todos os valores por 3");
        System.out.println("c " + ". calcular a media dos valores");
        System.out.println("d " + ". intercambiar os numeros 2 a 2");
        System.out.println("e " + ". imprimir o array");
        System.out.println("f " + ". ir almacenando a partir da posicion 3 o producto dos 2 anteriores");
        System.out.println("g " + ". sair");

        opcion = entrada.nextLine();

        switch (opcion) {

            case "a":
                System.out.println("introduce os 6 enteiros");
                for (int i = 0; i < arrayEnteiros.length; i++) {
                    arrayEnteiros [i] = entrada.nextInt();
                }
                break;
        
           case "b":
                for (int i = 0; i < arrayEnteiros.length; i++) {
                    arrayEnteiros[i] = arrayEnteiros[i]*3; 
                }

                break;
            case "c":
                Double media = 0.0;
                for (int i = 0; i < arrayEnteiros.length; i++) {
                    media = ((double)media+arrayEnteiros[i]);
                }
                    media = media/arrayEnteiros.length;
                
                  System.out.println("a media e " + media);
                break;
            case "d":
                int contenedor = 0;
                for (int i = 1; i < arrayEnteiros.length; i = i+2) {
                    contenedor = arrayEnteiros[i];
                    arrayEnteiros[i] =arrayEnteiros[i-1];
                    arrayEnteiros[i-1] = contenedor;
                }
                break;
            case "e":
                for (int i : arrayEnteiros) {
                    System.out.println(i);
                }
                break;
            case "f":
                for (int i = 2; i < arrayEnteiros.length; i++) {
                    arrayEnteiros[i]=arrayEnteiros[i-1]*arrayEnteiros[i-2];
                }
                break;
        
            case "g":
            System.out.println("adios");
            break;
        }
}
}


}

