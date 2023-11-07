/*3. Mostra un menú como o seguinte:
a) Introducir un número enteiro
b) Mostrar o 25 % do número introducido (será double).
c) Mostrar o 35 % do número introducido (será double).
d) Mostrar o 50 % do número introducido (será double).
e) Sair */

package Folla8Exercicios_switch;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    

    Scanner entrada = new Scanner(System.in);
    String opcion = "";
    int num = 0;
    Double porcentaje = 0.0;

        while(!opcion.equals("e")){

            System.out.println("elixe unha opcion: ");
            System.out.println("a " +". introducir un enteiro");
            System.out.println("b "+ ". Mostrar o 25%  dese numero");
            System.out.println("c "+". Mostrar o 30%  dese numero");
            System.out.println("d "+". Mostrar o 50% dese numero");
            System.out.println("e "+". sair");

            opcion = entrada.nextLine();

            switch(opcion){

                case("a"):

                System.out.println("introduce un enteiro");

                num = entrada.nextInt();

                entrada.nextLine();

                break;
               
            case("b"):

                porcentaje = num * 0.25;
                
                System.out.println("o 25 % do número introducido e "+ porcentaje);

                break;

            case("c"):

                porcentaje =  num * 0.3;
                
                System.out.println("o 30 % do número introducido e "+porcentaje);

                break;

            case("d"):

                porcentaje = num * 0.5;

                System.out.println("o 50 % do numero introducido e "+porcentaje);
                
                break;
            }
}    
}
}