package UD3.Exemplos;

public class Usuario {

    /*Atributos */

    public String nome;
    private int idade;

    /*Constructor */

    public Usuario(String nomString, int idade){
    
        nome = nomString;
        this.idade = idade;
    }
    
    /*Métodos */

    public void setNome(String nom){

        nome = nom;
    }

    public String getNome( ){

        return nome;
    }

    public void setIdade(int idade){

        this.idade = idade;
    }

    public int getIdade( ){

        return idade;
    }
}
