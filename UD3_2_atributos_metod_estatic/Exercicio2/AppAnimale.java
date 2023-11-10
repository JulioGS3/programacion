package UD3_2_atributos_metod_estatic.Exercicio2;

public class AppAnimale {
public static void main(String[] args) {
   
        Animale vaca = new Animale(1, "vaca", true);
        Animale can = new Animale(2, "can", false);
        Animale gato = new Animale(3, "gato", false);
    
    
        vaca.morre();
        vaca.nace();
        can.morre();
        can.nace();
        gato.nace();
        gato.morre();
       
    
}
}
