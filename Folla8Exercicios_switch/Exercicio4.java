/*4. Fai un programa que mostre un menú como o seguinte:
a) Introducir 4 números enteiros.
b) Calcular o máximo e mostralo.
c) Calcular o mínimo e mostralo
d) Calcular a media e mostrala.
e) Sair */

package Folla8Exercicios_switch;
import java.util.Scanner;
public class Exercicio4 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    String opcion = "";
    int num1 = 0;
    int [] arrai = new int [4];
    Double media = 0.0;
    int flag = 0;

        while(!opcion.equals("e")){

            System.out.println("elixe unha opcion: ");
            System.out.println("a " +". calcular o máximo");
            System.out.println("b "+ ". calcular o mínimo");
            System.out.println("c "+". calcular a media");
            System.out.println("d "+". Mostrar a media");
            System.out.println("e "+". sair");

            opcion = entrada.nextLine();
        
        switch(opcion){

            case("a"): 

                for( int i = 0; i < arrai.length; i++ ){

                    System.out.println("introduce un enteiro");
                    
                    arrai[i] = entrada.nextInt();

                    entrada.nextLine();

                    flag++;
                }

                break;

            case("b"):

            // esto podese dimplificar comprando arrai[0] > arrai[i] e asi comparao con todos usando un for, e despois gardar na variable max e vaise comparando con max seguido

                if (flag != 0){

                    if (arrai[0] > arrai [1] && arrai[0] > arrai[2] && arrai[0] > arrai[3] ){

                        System.out.println(arrai[0]+ " e o maior");
                    }
                    if (arrai[1] > arrai [0] && arrai[1] > arrai[2] && arrai[1] > arrai[3] ){

                        System.out.println(arrai[1]+ " e o maior");
                    }
                    if (arrai[2] > arrai [0] && arrai[2] > arrai[1] && arrai[2] > arrai[3]){

                        System.out.println(arrai[2]+ " e o maior");
                    }
                    if (arrai[3] > arrai [0] && arrai[3] > arrai[1] && arrai[3] > arrai[2]){

                        System.out.println(arrai[3]+ " e o maior");
                    }
                }else{
                    
                    System.out.println(" non introduciches os numeros, elixe a opcion A");
                }
                
                 
                break;
            
            case("c"):

                if (flag != 0){

                    if (arrai[0] < arrai [1] && arrai[0] < arrai[2] && arrai[0] < arrai[3] ){

                        System.out.println(arrai[0]+ " e o menor");
                    }
                    if (arrai[1] < arrai [0] && arrai[1] < arrai[2] && arrai[1] < arrai[3] ){

                        System.out.println(arrai[1]+ " e o menor");
                    }
                    if (arrai[2] < arrai [0] && arrai[2] < arrai[1] && arrai[2] < arrai[3]){

                        System.out.println(arrai[2]+ " e o menor");
                    }
                    if (arrai[3] < arrai [0] && arrai[3] < arrai[1] && arrai[3] < arrai[2]){
    
                        System.out.println(arrai[3]+ " e o menor");
                    }    
                }else{

                    System.out.println(" non introduciches os numeros, elixe a opcion A");
                }
                 

                break;

            case("d"):
                
                if (flag != 0){

                    media = ((double) arrai[0] + arrai[1] + arrai[2] + arrai[3]) / 4;

                    System.out.println(" a media e "+ media);

                }else{
                    
                    System.out.println(" non introduciches os numeros, elixe a opcion A");
                }
                

                
}
}
}
}
