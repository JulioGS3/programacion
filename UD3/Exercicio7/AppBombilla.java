package UD3.Exercicio7;

public class AppBombilla {

public static void main(String[] args) {
    

Bombilla bombilla1 = new Bombilla(30);

System.out.println(bombilla1.getPotencia());

bombilla1.aumentaPotencia(20);

System.out.println(bombilla1.getPotencia());

bombilla1.baixaPotencia(10);

System.out.println(bombilla1.getPotencia());

bombilla1.aumentaPotencia(5);

System.out.println(bombilla1.getPotencia());

bombilla1.setPotencia(10);

System.out.println(bombilla1.getPotencia());

bombilla1.baixaPotencia(20);

System.out.println(bombilla1.getPotencia());

}    
    
}
