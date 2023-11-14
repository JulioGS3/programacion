package UD3_3_atrib_metod_static.Exercicio3;

public class AppCilindro {
    public static void main(String[] args) {
        

        Cilindro cilindro1 = new Cilindro(5.0, 3.0);
        Cilindro cilindro2 = new Cilindro(4.0, 3.0);
        Cilindro cilindro3 = new Cilindro(6.0, 7.0);


       double resultado = Cilindro.volumen(cilindro1);

       System.out.println("o volumen e " + resultado);

       double resultadoArea = Cilindro.area(cilindro2);

       System.out.println("a area e " + resultadoArea);

       cilindro1.setAltura(3.0);
       cilindro2.setAltura(4.0);
       cilindro3.setAltura(5.0);
       cilindro1.setRadio(3.0);
       cilindro2.setRadio(4.0);
       cilindro3.setRadio(5.0);

       System.out.println("cilindro 1 ten " + cilindro1.getAltura() + " " + cilindro1.getRadio());
       System.out.println("cilidro 2 ten " + cilindro2.getAltura() + " " + cilindro2.getRadio());
       System.out.println("cilindro 3 ten " + cilindro3.getAltura() + " " +  cilindro3.getRadio());

       Double resVol = cilindro1.calcVolumen();

       System.out.println(resVol);

       Double resAre = cilindro2.calculaArea();

       System.out.println(resAre);


    }
    
}
