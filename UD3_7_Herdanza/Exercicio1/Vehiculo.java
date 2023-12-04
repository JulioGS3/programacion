/*1. Alugueiro de turismos. Define unha clase Vehículo que teña como atributos private a matrícula e se está
alugado ou non. Deberá ter dous construtores, un por defecto e un con argumentos */

package UD3_7_Herdanza.Exercicio1;

public class Vehiculo {

    // atributos

    private String matricula;
    private boolean alugado = true;

    //constructores

   
    public Vehiculo(String matri, boolean alquilado){
        matricula = matri;
        alugado = alquilado;
    }

    //metodos


    public String getAlugado(){

        String estaAlugado ="";
        if (alugado == true){
        estaAlugado = "si";
    }else{ estaAlugado = "no";}
    return estaAlugado;
    }
    
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matri){
        matricula = matri;
      
    }
    
   
}
