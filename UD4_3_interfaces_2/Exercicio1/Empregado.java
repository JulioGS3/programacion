/*Define tamén unha clase Empregado (cun atributo novo soldo, e un método getSoldo( ). Teremos
agora que implementar o método dameDescricion( ) que enumera todos os atributos. */

package UD4_3_interfaces_2.Exercicio1;

public class Empregado extends Persona {

    public int soldo;

    //constructor


    public Empregado(String nome, String apelidos, int idade, int soldo) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
        this.soldo = soldo;
    }


    public String dameNome(){

        return nome + " " + apelidos;
    }
    public String dameDescricion(){

    String descripcion ="idade: " + idade + ". soldo: " + soldo; 

        return descripcion;
    }

    public int getSoldo(){

        return soldo;

    }

    
}