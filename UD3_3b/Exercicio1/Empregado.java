/*Crea unha clase Empregado que terá como atributos o nome e a antigüidade do mesmo, ademais dun atributo es-
tático que será o salarioBase dun empregado. A clase debe conter un método estático que permitirá aumentar o sa-
lario base na porcentaxe indicada e un método de instancia que fará o cálculo e devolverá o salario do empregado,
que será o salario base máis 10€ (constante da clase) por cada ano de antigüidade.
Crea un programa AppEmpregado para probar a funcionalidade da clase. Crea tamén un método cambiarSalario-
Base( ), que permita cambiar ese valor. O seguintes Empregados deberán ter un soldo acorde ao novo valor de sa-
larioBase */

package UD3_3b.Exercicio1;

public class Empregado {
    
    //atributos

    public String nome;
    public int antiguedade;
    public static Double salarioBase = 1200.0;
    public Double porcentaxe;
    public static final Double ANT = 10.0;

    //constructores

    public Empregado(String nom, int anti){

        nome = nom;
        antiguedade = anti;

    //metodos
    
       
    }
    public void setPorcentaxe(double porc){

        porcentaxe = porc;

    }

    public Double getPorcentaxe(){
        
    return porcentaxe;

    }

    public double salarioConAntiguedade(){

        double resultado = salarioBase + (antiguedade * 10);

        return resultado;
    }

    public static Double subidaPorcentual(Empregado emp1){

        Double resultado = salarioBase * (emp1.porcentaxe/100) + salarioBase;

        return resultado;
    }


    
    
}
