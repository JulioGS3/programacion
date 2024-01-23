/*Teremos 2 tipos de vehículos: terrestres e acuáticos. Os terrestres teñen tamén cantidade de rodas, e uso do
vehículo (militar ou civil). Os acuáticos terán como atributos o tipo (superficie ou submarinos) e capacidade de
viaxeiros. */
package UD4_2_interfaces_clasesAbstractas.Exercicio3;

public class Terrestre extends Vehiculo implements Motor{

    //clases

    public int numeroRodas;
    public String usoVehiculo;

    //constructor
    
    public Terrestre(int numeroRodas, String usoVehiculo, int velocidadeActual, int velocidadeMáxima) {
    super(velocidadeActual, velocidadeMáxima);
    this.numeroRodas = numeroRodas;
    this.usoVehiculo = usoVehiculo;
    }

    //metodos

    public void acelerar( int velocidadePasada){

        velocidadeActual = velocidadeActual + velocidadePasada;
   
    }
    public void frear(int velocidadePasada){

        velocidadeActual=velocidadeActual-velocidadePasada;
        
    }
    public void imprimir(){

        System.out.println("a velociade actual e de " + velocidadeActual + " km/h e o vehiculo ten " + numeroRodas + " rodas e un uso " + usoVehiculo);
    }
        public int calculaRevolucionsMotor(int forza, int radio){

            int revolucions=forza*radio;
            
        return revolucions;

    }
    

    
}