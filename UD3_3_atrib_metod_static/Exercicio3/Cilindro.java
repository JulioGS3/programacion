/*Crea unha clase Cilindro, cun atributos radio e altura. A clase debe contar con 2 construtores, os setters e
getters, e dous métodos estáticos, que reciban como parámetro o radio (rad) e altura (alt), e farán o cálculo
da área e volume do cilindro. Emprega unha variable final para PI.
A área do cilindro é: 2 * PI * radio * (radio + altura), e o volume: é PI * radio2 * altura
Define tamén dous métodos non estáticos calculaArea( ), e calculaVolume(), que deben calcular área e
volume empregando os valores dos atributos do obxecto (deberán chamar aos métodos estáticos xa
creados)*/

package UD3_3_atrib_metod_static.Exercicio3;

import javax.crypto.spec.DESKeySpec;

public class Cilindro {

    //atributos

    public Double radio;
    public Double altura;
    public static final Double PI = 3.1416;

    //constructor

    public Cilindro (double alt, double rad){

        radio = rad;
        altura = alt;
    }
    public Cilindro(){

        altura = 1.0;
        radio = 2.0;
    }

    //metodos

    public void setRadio(Double rad){

        radio = rad;
    }
    public void setAltura(Double alt){

        altura = alt;
    }

    public Double getRadio(){

        return radio;
    }
    public Double getAltura(){

        return altura;
    }

    public Double calculaArea(){

       Double calcArea= 2 * PI * radio * (altura + radio);

       return calcArea;
    }
    
    public Double calcVolumen(){

        Double calcVol = PI * (radio * radio) * altura;

        return calcVol;
    }

    
    public static Double area(Cilindro cili){

        Double resultadoArea = 0.0;
       

        resultadoArea = 2 * PI * cili.radio * (cili.altura + cili.radio);

        return resultadoArea;
    }

    public static Double volumen(Cilindro cili){

        Double resultadoVolumen = 0.0;

        resultadoVolumen = PI * (cili.radio * cili.radio) * cili.altura;

        return resultadoVolumen;
    }
}