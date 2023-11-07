/*1. Programa que mostre un menú como o seguinte:
1. Introducir tres valores enteiros.
2. Mostrar a media
3. Mostrar o produto
4. Mostrar o maior
5. Sair
E faga o que indica o menú, cada vez que se preme a tecla correspondente.
OLLO: Non poderá facer nada se non se introduciron previamente valores para as variables,
pero estas só se introducirán ao premer o a) */

package Folla9Exercicios_repaso;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;
public class Exercicio1 {
public static void main(String[] args) {

    
    Scanner entrada = new Scanner(System.in);
    String opcion = "";
    int num = 0;
    int producto = 0;
    Double media = 0.0;
    int [] arrai = new int[3];
    int max = 0;
    int flag = 0; 
        while(!opcion.equals("5")){

            System.out.println("elixe unha opcion: ");
            System.out.println("1 " +". introducir tres enteiros");
            System.out.println("2 "+ ". Mostrar a media");
            System.out.println("3 "+". Mostrar o producto");
            System.out.println("4 "+". Mostrar o maior");
            System.out.println("5 "+". sair");

            opcion = entrada.nextLine();

        switch(opcion){
            
            case("1"):

                System.out.println("introduce tres enteiros");

                for (int i = 0; i < arrai.length; i++){ 

                arrai[i] = entrada.nextInt();

                entrada.nextLine();

                flag++;
                
                }

            break;

            case("2"):

                if (flag != 0){

                media = ((double) arrai[0] + arrai[1] + arrai[2]) / 3;

                System.out.println(" a media dos numeros e " + media);

            break;

                }

            case("3"):

                if (flag != 0){

                producto = arrai[0] * arrai[1] * arrai[2];

                System.out.println("o producto e " + producto);

            break;
                
                }

            case("4"):

                if(flag != 0){
    
                    for (int i = 0; i < arrai.length; i ++){

                        if (arrai[0] > arrai[i]){

                        max = arrai[0];

                        }
                        if (arrai[1] > arrai[i]){

                        max = arrai[1];
                    
                        }else{
            
                        max = arrai[2];
                        }
                    }
                        System.out.println("o maior e " + max);
            }else{

                System.out.println("non introduciches os enteiros, volve a opcion 1");
            }
                
        }
    }
    
}
}