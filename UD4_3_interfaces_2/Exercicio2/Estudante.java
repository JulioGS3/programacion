/*Define tamén unha clase Estudante, derivada de Persoa, que engade o atributo titulacion. */
package UD4_3_interfaces_2.Exercicio2;

public class Estudante extends Persona implements Comparable{

    public String titulacion;

    public Estudante(String nome, String apelidos, int idade, String titulacion) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
        this.titulacion = titulacion;
    }



    public String dameNome(){

        return nome + " " + apelidos;
    }
    public int dameidade(){

        return idade;
    }
    public String dameDescricion(){

    String descripcion ="idade: " + idade + ". titulacion: " + titulacion; 

        return descripcion;
    }
    public int compareTo(Object obx){

        Estudante unEstudante = (Estudante) obx;

        if (this.idade < unEstudante.idade){
            return -1;
        }
        if (this.idade > unEstudante.idade){
            return 1;
        }else{
            return 0;
        }
    }

    
}