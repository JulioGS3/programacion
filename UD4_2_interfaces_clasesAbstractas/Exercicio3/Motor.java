/*Existen tamén 2 interfaces: Motor e Vela. A clase Vehículo terrestre implementa a interface Motor. A clase
VehiculoAcuatico implementa as dúas interfaces. Estas son do seguinte modo:
• A interface Motor ten o método calculaRevolucionsMotor(int forza, int radio): o número de revolucións
vén calculado pola multiplicacións de ambos.
• A interface Vela ten o método recomendarVelocidade(int velocidadeVento), se a velocidade do vento é
superior a 60 km/h non se recomenda saír, polo que a velocidade actual actualizase a 0. Se é menor
que 10 km/h tampouco se recomenda saír, polo que fará o mesmo. */

package UD4_2_interfaces_clasesAbstractas.Exercicio3;

public interface Motor {

    public int calculaRevolucionsMotor(int forza, int radio);

}

    
