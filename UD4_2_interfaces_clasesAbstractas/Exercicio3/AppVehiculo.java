/*Define unha clase AppVehiculos que cree 2 camións e dúas barcas (as dúas con vela e motor), que chaman
aos métodos de cada clase e mostren os resultados por pantalla. Debes comprobar que funcionan
correctamente todos os métodos. */
package UD4_2_interfaces_clasesAbstractas.Exercicio3;

public class AppVehiculo {
public static void main(String[] args) {
 
    Terrestre camion1 = new Terrestre(4, "civil", 40 , 100); 
    Terrestre camion2 = new Terrestre(6, "militar", 80, 150);

    Acuatico barca1 = new Acuatico(4, "superficie", 100, 200);
    Acuatico barca2 = new Acuatico(2, "submarino", 50, 100);

    
    camion1.imprimir();
    camion2.acelerar(20);
    camion2.imprimir();
    camion2.frear(90);
    camion2.imprimir();
    System.out.println("vai a " + camion2.calculaRevolucionsMotor(5, 10) + " revolucions");

    barca1.imprimir();
    barca2.recomendarVelocidade(80);
    barca2.imprimir();
}

    
}