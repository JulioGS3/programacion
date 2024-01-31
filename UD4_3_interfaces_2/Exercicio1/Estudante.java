/*Define tamén unha clase Estudante, derivada de Persoa, que engade o atributo titulacion. */
package UD4_3_interfaces_2.Exercicio1;

public class Estudante extends Persona{

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
    public String dameDescricion(){

    String descripcion ="idade: " + idade + ". titulacion: " + titulacion; 

        return descripcion;
    }

    
}