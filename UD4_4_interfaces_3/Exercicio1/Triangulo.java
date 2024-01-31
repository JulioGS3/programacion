package UD4_4_interfaces_3.Exercicio1;
/**
 * Triangulo
 */
public class Triangulo extends Figuras{

    //atributos

    public Double altura;
    public Double base;

    
    //constructor
    
    public Triangulo(Double altura, Double base) {
        super();
        this.altura = altura;
        this.base = base;
        area = calcularArea();
        
    }

    //metodos

    public Double calcularArea(){

        return (base * altura)/2;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }


    

    
}