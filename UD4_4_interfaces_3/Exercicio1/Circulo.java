package UD4_4_interfaces_3.Exercicio1;

/**
 * Circulo
 */
public class Circulo extends Figuras{

    //atributos

    public Double radio;
    public static final Double pi = 3.14;
    
    //constructor

    public Circulo(Double radio) {
        super();
        this.radio = radio;
        area = calcularArea();
       
    }

    //metodos

    public Double calcularArea(){

        return pi * (radio*radio);

    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public static Double getPi() {
        return pi;
    }


  
}