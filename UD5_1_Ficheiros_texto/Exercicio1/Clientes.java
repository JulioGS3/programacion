package UD5_1_Ficheiros_texto.Exercicio1;

/**
 * Clientes
 */
public class Clientes {

    public String nome;
    public String apelidos;
    public int idade;

    
    public Clientes(String nome, String apelidos, int idade) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getApelidos() {
        return apelidos;
    }


    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}