/*Define unha clase Vehículo, con atributos velocidadeActual, e velocidadeMáxima. Terá 2 métodos abstractos:
• acelerar(): permitirá incrementar a velocidade actual sumando a velocidade pasada como parámetro. A
velocidade actualizada non poderá superar a velocidade máxima.
• O método frear( ) permite baixar a velocidade restando a cantidade pasada como parámetro. A velocidade
actualizada non pode ser negativa.
O método imprimir mostra en pantalla a velocidade actual e a velocidade máxima do vehículo. */
package UD4_2_interfaces_clasesAbstractas.Exercicio3;

public abstract class Vehiculo {

    //clases

    public int velocidadeActual;
    public int velocidadeMáxima;

    //cosntructores
    
    public Vehiculo(int velocidadeActual, int velocidadeMáxima) {
        this.velocidadeActual = velocidadeActual;
        this.velocidadeMáxima = velocidadeMáxima;
    }

    //metodos

    public abstract void acelerar(int velocidade);
    public abstract void frear(int velociade);
    public abstract void imprimir();

    
}