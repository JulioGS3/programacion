/*Crea agora outra clase AppBici, na que debes crear un array con 5 bicis. O programa deberá mostrar o menú
seguinte, que debe ser xestionado cun switch:
a) Introducir unha única bicicleta, na posición que corresponde (primeiro no 0, logo no 1, etc.). Debes
controlar con numBicis en que posición hai que introducir a bici nova.
b) Mostrar todos os elementos do array. (emprega numBicis como índice máximo do bucle)
c) Cambiar os datos dunha bicicleta concreta. O usuario será preguntado polo índice do array que quere
modificar e modificar esa bicicleta. Só poderá modificar unha posición na que xa exista a bicicleta.
d) Mostra a bicicleta con máis autonomía. Emprega o método comparaAutonomía( ) nas comparacións.
e) Mostra a bicicleta con menor autonomía. Emprega o método comparaAutonomía( ) nas compara-
cións.
f) Saír. */

package Exercicio_Exame;

import java.util.Scanner;

public class AppBiciElect {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);    
String opcion = "";

BiciElect [] arrayBicis = new BiciElect [5];


while (!opcion.equals("f")) {

    System.out.println("elixe unha opcion: ");
    System.out.println("a " +". introducir unha bici");
    System.out.println("b "+ ". Mostrar os elementos do array");
    System.out.println("c "+". Cambiar os datos dunha bici en concreto");
    System.out.println("d "+". Mostrar a bici con mais autonomia");
    System.out.println("e "+ ". Mostrar a bici con menos autonomia");
    System.out.println("f "+". sair");

    opcion = entrada.nextLine();
  
    switch (opcion) {

        case "a":

            String nome = "";
            String marca = "";
            int autonomia = 0;

            System.out.println("introduce o nome dunha bici");
            nome = entrada.nextLine();
            System.out.println("introduce a marca da bici");
            marca = entrada.nextLine();
            System.out.println("que autonomia en kms ten");
            autonomia = entrada.nextInt();

            arrayBicis [BiciElect.numBicis] = new BiciElect(nome, marca, autonomia);
            

            break;
    
        case "b":

            for ( int i = 0; i < BiciElect.numBicis; i++){

            System.out.println("o nome da bici e " + arrayBicis[i].getNome() + " da marca " + arrayBicis[i].getMarca() + " e ten unha autonomia de " + arrayBicis[i].getAutonomiaKms() + " Kms" );
            }
            break;
        
        case "c":

            int posicion = 0;
            String nom = "";
            String marc = "";
            int autonomi = 0;

            System.out.println("elixe que bici queres modificar");
            posicion = entrada.nextInt();
            System.out.println("introduce o nome dunha bici");
            nom = entrada.nextLine();
            System.out.println("introduce a marca da bici");
            marc = entrada.nextLine();
            System.out.println("que autonomia en kms ten");
            autonomi = entrada.nextInt();

          arrayBicis[posicion].setNome(nom);
          arrayBicis[posicion].setMarca(marc);
          arrayBicis[posicion].setAutonomiaKms(autonomi);
    
        case "d":
            BiciElect maior = arrayBicis[0];
            
            for (int i = 1; i < 4; i++){

                BiciElect nombre = BiciElect.comparaAutonomia(maior, arrayBicis[i]);

                maior = nombre;
                
            }
            System.out.println("o maior e " + maior.getNome() + " da marca " + maior.getMarca() +" e ten unha autonomia de " + maior.getAutonomiaKms());
           
            break;

             case "e":
            BiciElect menor = arrayBicis[0];
            
            for (int i = 1; i < 4; i++){

                BiciElect nombe = BiciElect.comparaAutonomiaMenor(menor, arrayBicis[i]);

                menor = nombe;
                
            }
            System.out.println("o menor e " + menor.getNome() + " da marca " + menor.getMarca() +" e ten unha autonomia de " + menor.getAutonomiaKms());
           
            break;
}
}
System.out.println("adios");

}
}
