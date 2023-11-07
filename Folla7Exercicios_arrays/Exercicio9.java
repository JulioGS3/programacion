/*9. Declara un array de 10 enteiros. Fai un menú para facer o seguinte:
a) Introducir os 10 números.
b) Mostrar os 10 números.
c) Poñer a 0 os 3 primeiros elementos do array.
d) Poñer a 10 os 3 últimos elementos do array.
e) Sair. */

package Folla7Exercicios_arrays;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int [] arrayInt = new int[10];
    String opcion= " ";

    while(!opcion.equals("e")){

        System.out.println("elixe unha opcion: ");
        System.out.println("a " +". introducir os 10 numeros");
        System.out.println("b "+ ". Mostrar os 10 numeros");
        System.out.println("c "+". poñer a 0 os 3 primeiros");
        System.out.println("d "+". poñer a 10 os 3 ultimos");
        System.out.println("e "+ ". sair");


        opcion = entrada.nextLine();

            if (opcion.equals("a")){

                for( int i = 0; i < arrayInt.length; i++ ){

                    System.out.println("introduce 10 numeros ");

                    arrayInt[i]= entrada.nextInt();
                    
                }
                entrada.nextLine();
            }
                
            if (opcion.equals("b")){

                for (int i : arrayInt) {
                    
                    System.out.println(i);

                }
            }
            if (opcion.equals("c")){
                
                for( int i = 0; i < 3; i++ ){

                    arrayInt[i] = 0;
                }
            }
            if (opcion.equals("d")){

                for (int i = 7; i < arrayInt.length; i++){

                    arrayInt[i] = 10;
                }
            }
            }
            }

            

        







    }


