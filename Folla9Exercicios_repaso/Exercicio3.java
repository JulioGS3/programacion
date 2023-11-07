/*3. Un comprador de material para unha empresa será preguntado polo material a comprar de
cada: paquetes de folios a 3.00 €, as caixas de bolígrafos a 2.50 €, grapadoras a 10.00 € e os
tóner de impresora a 60.00 €. Finalmente, mostraremos o prezo a pagar, tendo en conta que se
éste supera os 1000.00 € o prezo será rebaixado nun 17.5 %, e se o prezo supera os 2000.00
€ a rebaixa será do 30 %. Mostra a cantidade a pagar, e a rebaixa */

package Folla9Exercicios_repaso;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    String opcion = "";
    int cantidade = 0;
    Double folio = 0.0;
    Double boligrafos = 0.0;
    Double grapadora = 0.0;
    Double toner = 0.0;
    Double total = 0.0;
    Double rebaixa = 0.0;
    Double acumulado = 0.0;

    while(!opcion.equals("5")){
            
        System.out.println("estes son os nosos productos, elixe: ");
        System.out.println("1 " +". paquete de folios (3.00 )");
        System.out.println("2 "+ ". caixa de boligrafos (2.50 )");
        System.out.println("3 "+". grapadora (10.00 )");
        System.out.println("4 "+". toner de impresora (60.00 )");
        System.out.println("5 "+". fin da compra");

        opcion = entrada.nextLine();

        switch(opcion){

            case("1"):

                System.out.println("cantos folios queres?");

                cantidade = entrada.nextInt();

                folio = cantidade * 3.00;

                acumulado = folio + boligrafos + toner + grapadora;

                System.out.println("os folios saenche a " + folio + " euros. total da compra " + acumulado);
                
                entrada. nextLine();

            break;

            case("2"):

                System.out.println("cantos bolis queres");

                cantidade = entrada.nextInt();

                boligrafos = cantidade * 2.50;

                acumulado = folio + boligrafos + toner + grapadora;

                System.out.println("os bolis saenche a " + boligrafos + " euros. total da compra " + acumulado);

                entrada. nextLine();

            break;

            case("3"):

                System.out.println("cantas grapadoras queres");
                
                cantidade = entrada.nextInt();

                grapadora = cantidade * 10.00;

                acumulado = folio + boligrafos + toner + grapadora;
            
                System.out.println("as grapadoras saenche a " + grapadora + " euros. total da compra " + acumulado);

                entrada. nextLine();

            break;

            case("4"):

                System.out.println("canto toner queres");

                cantidade = entrada.nextInt();

                toner = cantidade * 60.00;

                acumulado = folio + boligrafos + toner + grapadora;

                System.out.println("o toner saenche a " + toner + " euros. total da compra " + acumulado);

                entrada. nextLine();

            break;

            case("5"):

                total = toner + grapadora + boligrafos + folio;
        

        if(total <= 1000){

                System.out.println(" o total a pagar e " + total + " euros");
        
        }

        if(total > 1000 && total <= 2000){

            rebaixa = total * 0.175;

            total = total - rebaixa;

            System.out.println(" o total e " + total + " euros, e a rebaixa do 17.5 % e de " + rebaixa + " euros");
        } 
        
        if(total > 2000){

            rebaixa = total * 0.3;

            total = total - rebaixa;

            System.out.println(" o total e " + total + " euros, e a rebaixa do 30 % e de " + rebaixa + " euros");

        }
        }


}
}
    
}
