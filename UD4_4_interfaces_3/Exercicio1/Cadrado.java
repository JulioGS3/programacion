package UD4_4_interfaces_3.Exercicio1;
/**
 * Cadrado
 */
public class Cadrado extends Figuras{

    //atributos
    
    public Double lado;

    //constructor

    public Cadrado(Double lado) {
        super();
        this.lado = lado;
        area = calcularArea();
    
    }

    //metodos

    public Double calcularArea(){
        return lado * lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }



}