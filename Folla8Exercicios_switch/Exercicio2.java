/*2. Fai un programa que mostre o seguinte menú e faga o que se explica a continuación ao pulsar esa
letra:
a) Introducir o número flotante.
b) Mostre a táboa de multiplicar ata 15 dese número. Emprega while.
c) Mostre a táboa de multiplicar ata 15 dese número, con 1 decimal.
d) Mostre a táboa de multiplicar ata 15 dese número, sen multiplicar polos múltiplos de 3. (non
multiplicará por 3, 6, 9, 12 e 15). Emprega continue.
e) Mostre a táboa de multiplicar dese número por 0.5 ata 7.5, de 0.5 en 0.5
f) Sair */

package Folla8Exercicios_switch;
import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    String opcion = "";
    float num = 0;
    float producto = 0;
    int multiplicador = 1;
    float cero = 0.5f;
    
    
        while(!opcion.equals("f")){

            System.out.println("elixe unha opcion: ");
            System.out.println("a " +". introducir un float");
            System.out.println("b "+ ". Mostrar a tabla de multiplicar ata o 15  dese numero");
            System.out.println("c "+". Mostrar a tabla de multiplicar ata o 15  dese numero cun decimal");
            System.out.println("d "+". Mostrar a tabla de multiplicar ata o 15  dese numero sen os multiplos de 3");
            System.out.println("e "+ ". Mostrar a tabla de multiplicar dese numero por 0.5 ata o 7.5");
            System.out.println("f "+". sair");

            opcion = entrada.nextLine();
          
            
            switch(opcion){

                case("a"):

                    System.out.println("mete un numero");
                    num = entrada.nextFloat();
                    entrada.nextLine();
                    break;

                case("b"):

                   while(  multiplicador <= 15){

                        producto = num * multiplicador;

                        multiplicador ++;

                        System.out.println(String.format("%.0f", producto) );
                    }
                    break;

                case("c"):

                    for(int i = 0; i<=15; i++){

                    producto = num * i;
                    System.out.println(String.format("%.1f", producto));
                    
                    }
                    break;
                
                case("d"):
                    
                    for(int i = 0; i<=15; i++){

                    producto = num * i;
                        
                        if (i % 3 == 0){
                            continue;
                        }
                    System.out.println(String.format("%.1f", producto));
                    
                    }
                    break;
                
                case("e"):

                    while( multiplicador <= 15){

                        producto = num * ((float)multiplicador)/2;

                        multiplicador++;
                        
                        System.out.println(String.format("%.1f", producto) );
                    }

                    break;

                   
                   



            }

}
    
}
}
