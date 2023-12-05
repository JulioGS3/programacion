/*Nesta clase Principal crea dúas bombillas,
e asígnalles potencia empregando o método setPotencia( ): 20 e 25. Modifica tamén o método
aumentaPotencia( ) e baixaPotencia( ) para que informe ao usuario se se tentou superar os límites,
se . Comproba que o funcionamento é correcto: para a primeira bombilla subindo 30, baixando 7,
subindo 19, asignando 14 e baixando 20, revisando cada vez o valor da potencia. E para a segunda,
sube 25, baixa 70, asigna 25 e baixa 7. Comproba que o método equals( ) que creaches devolve
false se as 2 potencias son distintas e true se son iguais */ 
package UD3_8_equals_objects.Exercicio2;
public class AppBombilla {
public static void main(String[] args) {
    
    Bombilla bomb1 = new Bombilla(10, "lumas", "");
    Bombilla bomb2 = new Bombilla(25, "casio", "" );

    bomb1.setPotencia(20);
    bomb2.setPotencia(25);

    bomb1.aumentaPotencia(30);
    bomb1.mostraTodo();
    bomb1.baixaPotencia(7);
    bomb1.mostraTodo();
    bomb1.aumentaPotencia(19);
    bomb1.mostraTodo();
    bomb1.setPotencia(14);
    bomb1.mostraTodo();
    bomb1.baixaPotencia(20);
    bomb1.mostraTodo();

    bomb2.aumentaPotencia(25);
    bomb2.mostraTodo();
    bomb2.baixaPotencia(70);
    bomb2.mostraTodo();
    bomb2.setPotencia(25);
    bomb2.mostraTodo();
    bomb2.baixaPotencia(7);
    bomb2.aumentaPotencia(13);
    bomb2.mostraTodo();
    bomb1.mostraTodo();

    System.out.println(bomb1.equals(bomb2));
    System.out.println(bomb2.hashCode());

}
    
}