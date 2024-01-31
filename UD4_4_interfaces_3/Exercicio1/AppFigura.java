/*Crea unha clase AppFigura no que teñas un array de Figuras: 3 triángulos, 3 cadrados e 3 círculos. Percorre o
array e cambia a cor a “negro” daquelas figuras con área maior que 4.0.
Fai a continuación que a clase Figura implemente a interface Comparable, de forma que se chamas ao método
Arrays.sort( ) o array queda ordenado pola área */

package UD4_4_interfaces_3.Exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class AppFigura {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    Triangulo triangulo;
    Cadrado cadrado;
    Circulo circulo;

    
    Figuras [] arrayFiguras = new Figuras[3];

    for (int i = 0; i < arrayFiguras.length; i++) {

        System.out.println("que figura queres crear? ");

        String resposta = entrada.nextLine();
        
        if (resposta.equals("triangulo")){

            System.out.println("introduce a base");
            Double base = entrada.nextDouble();

            System.out.println("introduce a altura");
            Double altura = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("de que cor e?");
            String cor = entrada.nextLine();
            
            triangulo = new Triangulo(altura, base);
            triangulo.setCor(cor);
             arrayFiguras [i] = triangulo;
          
        }
        if (resposta.equals("circulo")){

            System.out.println("introduce o radio");
            Double radio = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("de que cor e?");
            String cor = entrada.nextLine();
            
            circulo = new Circulo(radio);
            circulo.setCor(cor);
            arrayFiguras[i] = circulo;
        }
        if (resposta.equals("cadrado")){

            System.out.println("introduce o lado");
            Double lado = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("de que cor e?");
            String cor = entrada.nextLine();
   
            cadrado = new Cadrado(lado);
            cadrado.setCor(cor);
            arrayFiguras [i] = cadrado;
        }
    }
        for (int i = 0; i < arrayFiguras.length; i++) {

            if(arrayFiguras[i].area > 4.0 ){
                arrayFiguras[i].setCor("negro");
            }
            
        }
        Arrays.sort(arrayFiguras);

        for (Figuras figuras : arrayFiguras) {
            System.out.println("a figura e da cor " + figuras.getCor() + " e area e " + figuras.getArea());
            
        }

        
     
    }
}

