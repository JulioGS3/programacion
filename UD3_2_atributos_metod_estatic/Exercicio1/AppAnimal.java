/*Comproba que todo
vai ben creando 3 animais, dándolle valores aos seus atributos e chamando a todos os métodos. */

package UD3_2_atributos_metod_estatic.Exercicio1;

public class AppAnimal {
public static void main(String[] args) {
   
    Animal vaca = new Animal(1, "vaca", true);
    Animal can = new Animal(2, "can", false);
    Animal gato = new Animal(3, "gato", false);


    vaca.morre();
    vaca.nace();
    can.morre();
    can.nace();
    gato.nace();
    gato.morre();
   
}
}
