/*Crea unha clase Cilindro, cun atributos radio e altura. A clase debe contar con 2 construtores, os setters e
getters, e dous métodos estáticos, que reciban como parámetro o radio (rad) e altura (alt), e farán o cálculo
da área e volume do cilindro. Emprega unha variable final para PI.
A área do cilindro é: 2 * PI * radio * (radio + altura), e o volume: é PI * radio2 * altura
Define tamén dous métodos non estáticos calculaArea( ), e calculaVolume(), que deben calcular área e
volume empregando os valores dos atributos do obxecto (deberán chamar aos métodos estáticos xa
creados)*/

package Repaso.cilindro;

public class Cilindro {
    
    //atributos

    public Double altura;
    public Double radio;
    public static Double PI = 3.14;

    
    
     // constructores
    public Cilindro() {

         altura = 3.0;
         radio = 2.0;
    }
    
    public Cilindro(Double alt, Double rad) {
        altura = alt;
        radio = rad;
    }

    // metodos

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double alt) {
        altura = alt;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double rad) {
        radio = rad;
    }
    public static Double calculoArea (Cilindro cili){

    
        Double calculo = 2 * PI * cili.radio *(cili.radio + cili.altura); 

        return calculo;
    }
    public static Double calculoVolume(Cilindro cili){
       

        Double calculo2 = PI * (cili.radio * cili.radio) * cili.altura;
        return calculo2;

    }
    public Double calcArea(altura, radio){

        return calculoArea(altura, rad);
    }
}
