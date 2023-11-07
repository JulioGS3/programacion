/*2. Programa no que se define un array de 5 enteiros, inicializando todos os valores a 0, e se realizan
unha serie de opcións empregando funcións. O programa deberá mostrar o menú seguinte:
Elixe unha opción:
a) Introducir valor
b) Borrar todos os valores
c) Calcular a media dos valores
d) Calcular o máximo dos valores
e) Calcular o mínimo dos valores
f) Mostrar valores
g) Sair */

package Folla11ExerciciosArrays_Funcions;

    import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int numeroMaior = 0;
    int resultadoDaMedia = 0;
    String opcion = "";

    int [] arrai = new int [5];

        for(int i = 0; i < arrai.length; i ++){

            arrai[i] = i * 0;

        }
        for (int a : arrai) {

            System.out.println(a);
        }

    
    while(!opcion.equals("g")){

    System.out.println("elixe unha opcion: ");
    System.out.println("a "+". introducir numeros" );
    System.out.println("b " +". borraros valores *");
    System.out.println("c "+ ". calcular a media /");
    System.out.println("d "+". calcular o maximo +");
    System.out.println("e "+". calcular o minimo -");
    System.out.println("f "+". Mostralos");
    System.out.println("g "+". sair");

    
    opcion = entrada.nextLine();
        

        switch(opcion){
        
            case("a"):

            introducir(arrai, entrada);

            entrada.nextLine();

            break;

            
            case("b"):

            borrar(arrai);
            
            for (int i : arrai) {

                System.out.println(i);
            }

            break;

            case("c"):

            resultadoDaMedia = media(arrai);

            System.out.println(resultadoDaMedia);

            break;

            case("d"):

            numeroMaior = max(arrai);

            System.out.println(numeroMaior);

            break;

            case("f"):

            mostrarArrai(arrai);

            break;

        
    
}
    
}
}
    public static void introducir(int [] introducirArrai, Scanner entrada){

        System.out.println("introduce un numeros");

        for(int i = 0; i < introducirArrai.length; i++){


            if (introducirArrai[i] == 0){

            introducirArrai [i] = entrada.nextInt();

            break;
        }
    }
    }

    public static void borrar( int [] borra){

        for (int i = 0; i < borra.length; i++){

        borra [i] = i * 0;
    
        }
        }

    public static int media( int [] mediaArrai){

        int resultadoMedia = 0;
        int suma = 0;

        for(int i = 0; i < mediaArrai.length; i++){

            suma = suma + mediaArrai[i] ;
            
        }

        resultadoMedia = suma / mediaArrai.length;

        return resultadoMedia;
    }

    public static int max(int [] maxArrai){

        int maior = 0;
        
        for( int i = 0; i < maxArrai.length; i++){

            if(maxArrai[i] > maior){

                maior = maxArrai[i];
            }
            
        }
            return maior;

    }
    

            public static void mostrarArrai(int [] mostrarArrai){

                for( int i = 0; i < mostrarArrai.length; i++){
                
                    System.out.println(mostrarArrai[i]);   
            }
        }




    }

    

    
    