package UD3_6_Herdanza.Exercicio0_exemplo;

public class AppLavadora {
public static void main(String[] args) {
    
Lavadora lava1 = new Lavadora();

System.out.println(lava1.getCodigo());
System.out.println("prezo " + lava1.getPrezo());
System.out.println("carga "+ lava1.getCarga());

Lavadora lava2 = new Lavadora("cod 3", 3, 50);

System.out.println("codigo: "+ lava2.getCodigo() +" prezo: "+ lava2.getPrezo() +" Carga " + lava2.getCarga());

Electrodomestico electro1 = new Electrodomestico();
System.out.println("prezo do electro " + electro1.getPrezo());
}
}
