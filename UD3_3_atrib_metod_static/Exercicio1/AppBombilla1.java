package UD3_3_atrib_metod_static.Exercicio1;

import java.util.Scanner;


public class AppBombilla1 {

public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
    
        Bombilla1 bombilla1 = new Bombilla1(10);
        Bombilla1 bombilla2 = new Bombilla1(15);
        Bombilla1 bombilla3 = new Bombilla1(6);

        String comparacion = Bombilla1.comparaBombillas(bombilla1, bombilla2);

        System.out.println(comparacion);
        
        System.out.println(Bombilla1.getPotenciaTotal());
        
        bombilla1.aumentaPotencia(5);
        bombilla2.aumentaPotencia(50);
      
        System.out.println("bombilla 1 ten unha potencia de " + bombilla1.getPotencia() + " bombilla 2 tena de  " + bombilla2.getPotencia() + " e o total e de " + Bombilla1.getPotenciaTotal());


        System.out.println(" introduce os W da bombilla 1 e da bombilla 2");

        int bomb2 = entrada.nextInt();
        int bom3 = entrada.nextInt();

        bombilla2.baixaPotencia(bomb2);
        bombilla3.baixaPotencia(bom3);

        System.out.println("bombilla 2 tena de  " + bombilla2.getPotencia() + " W ,bombilla 3 tena de " + bombilla3.getPotencia() + " W, e o total e de " + Bombilla1.getPotenciaTotal());

        
        bombilla1.setPotencia(- 500);
        bombilla2.setPotencia(- 500);
        bombilla3.setPotencia( -500);

        System.out.println("bomb1 ten  " + bombilla1.getPotencia() + " bomb2 tena de  " + bombilla2.getPotencia() +  " bomb 3 tena de " + bombilla3.getPotencia() + ", o total e " + Bombilla1.getPotenciaTotal());
        
        String comparacion2 = Bombilla1.comparaBombillas(bombilla2, bombilla3);
        System.out.println(comparacion2);
}    
            
}
        
    

