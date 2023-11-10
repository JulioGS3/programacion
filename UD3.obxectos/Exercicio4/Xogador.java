/*4. Crea unha clase chamada Xogador con atributos:
private String nome
private int idade.
Crea tamén:
a) 2 construtores, un sen argumentos e outro con argumentos
b) public void setNome(String nomeNovo)
c) public String getNome()
d) public void setIdade(int idade)
e) public int getIdade().
Define outra clase AppXogador na que definas un método main() (public static void) e fai o seguinte:
a) Crea un xogador. Mostra os seus valores empregando os métodos.
b) Modifica os seus atributos a “Roi” e 22.
c) Mostra de novo os valores dos seus atributos */

package UD3.obxectos.Exercicio4;

public class Xogador {
    

    private String nome;
    private int idade;

public  Xogador(){

    nome = "usuario";
    idade = 0;
}

public Xogador( String nome, int idade){

    this.nome = nome;
    this.idade = idade;
}

public void setNome(String nomeNovo){

    nome = nomeNovo;    
}

public String getNome(){

    return nome;
}

public void setIdade(int idade){

    this.idade = idade;
}

public int getIdade(){

    return idade;
}

}
