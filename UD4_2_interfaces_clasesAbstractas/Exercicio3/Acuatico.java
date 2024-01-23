/*Teremos 2 tipos de vehículos: terrestres e acuáticos. Os terrestres teñen tamén cantidade de rodas, e uso do
vehículo (militar ou civil). Os acuáticos terán como atributos o tipo (superficie ou submarinos) e capacidade de
viaxeiros. */
package UD4_2_interfaces_clasesAbstractas.Exercicio3;

public class Acuatico extends Vehiculo implements Vela, Motor{


    //atributos

    public int capacidadeViaxeiros;
    public String tipo;

    //constructor

    public Acuatico(int capacidadeViaxeiros, String tipo, int velocidadeActual, int velocidadeMáxima) {
    super(velocidadeActual, velocidadeMáxima);
    this.capacidadeViaxeiros = capacidadeViaxeiros;
    this.tipo = tipo;
    }
    //metodos

    public void acelerar( int velocidadePasada){

        
        velocidadeActual = velocidadeActual+velocidadePasada;
        

    }
    public void frear(int velocidadePasada){

        velocidadeActual=velocidadeActual-velocidadePasada;

      
    }
    public void imprimir(){

        System.out.println("a velociade actual e de " + velocidadeActual + " km/h e no vehiculo collen " + capacidadeViaxeiros + " pasaxeiros e é do tipo " + tipo);
    }

    public int recomendarVelocidade(int velocidadeVento){

        if( velocidadeVento > 60 || velocidadeVento < 10){
            velocidadeActual = 0;
        }
        return velocidadeActual;
    }
    public int calculaRevolucionsMotor(int forza, int radio){

        int revolucions=forza*radio;
        
    return revolucions;

}

 
    
}