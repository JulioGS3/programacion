package Repaso_exame1;
/*10. Declara un array de 12 doubles. Fai un menú para facer o seguinte:
a) Introducir os 12 números.
b) Mostrar os 12 números.
c) Pide unha posición e escribe nesa posición o valor 0
d) Pide unha posición e escribe nesa posición o valor introducido por teclado.
e) Intercambia os 2 primeiros valores do array.
f) Intercambia o 3º e o 4º valor do array.
g) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.
h) Sair. */

import java.util.Scanner;

public class repaso {

public static void main(String[] args) {

    String opcion = "";
    Scanner entrada = new Scanner(System.in);

    Double [] arrayDouble = new Double[12];

    while (!opcion.equals("h")) {
        
    System.out.println("elixe unha opcion: ");
    System.out.println("a " +". introducir os 12 numeros");
    System.out.println("b "+ ". Mostrar os 12 numeros");
    System.out.println("c "+". Pide unha posición e escribe nesa posición o valor 0");
    System.out.println("d "+". Pide unha posición e escribe nesa posición o valor introducido por teclado.");
    System.out.println("e "+ ". Intercambia os 2 primeiros valores do array.");
    System.out.println("f "+". Intercambia o 3º e o 4º valor do array.");
    System.out.println("g "+". Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.");
    System.out.println("h "+". sair");

        opcion = entrada.nextLine();

        switch (opcion) {
            case "a":
                for (int i = 0; i < arrayDouble.length; i++){

                    arrayDouble[i] = entrada.nextDouble();
                }
                entrada.nextLine();
                break;
        
            case "b":
                    for (Double i : arrayDouble) {
                        System.out.println("numero " + i);
                    }
                break;

            case "c":
                int posicion = 0;
                System.out.println("introduce unha posicion");
                posicion = entrada.nextInt();
                arrayDouble[posicion] = 0.0;
                
                break;

            case "d":
                int posicion2 = 0;
                Double num = 0.0;
                System.out.println("introduce a posicion e logo o numero");
                    posicion2 = entrada.nextInt();
                    num = entrada.nextDouble();
                    arrayDouble[posicion2] = num;
                break;
            case "e":
                    Double contenedor = 0.0;
                    contenedor = arrayDouble[0];
                    arrayDouble[0] = arrayDouble[1];
                    arrayDouble[1] = contenedor;
                break;
            case "f":
                Double contenedor2 = 0.0;
                contenedor2 = arrayDouble[2];
                arrayDouble[2] = arrayDouble[3];
                arrayDouble[3] = contenedor2;
                break;
            case "g":

            Double contenedor3 = 0.0;

            for (int i = 1; i < arrayDouble.length; i= i+2){
                contenedor3 = arrayDouble[i];
                arrayDouble[i] = arrayDouble[i-1];
                arrayDouble[i-1] = contenedor3;
            }
        }   
        

    }
    
    }
}