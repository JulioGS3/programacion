/*6. Define unha clase Dinosaurio que teña como atributos privados o nome e a idade. Define 2 construtores, un que asigne os
valores considerados por defecto ("Alf", 5), e outro que pida como argumentos eses valores. Define os métodos públicos
setIdade( ), getIdade( ), setNome( ) e getNome( ), todos eles recibindo como argumentos os valores e asignándollos aos
atributos. Crea noutra clase AppDinosaurio 3 obxectos din1, din2 e din3, e proba os catro métodos con cada un deles. */

package UD3.Exercicio6;

public class Dinosaurio {
    
    private String nome;
    private int idade;


public  Dinosaurio(){

    nome = "alf";
    idade = 5;
}

public Dinosaurio(String nome, int idade){

    this.nome = nome;
    this.idade = idade;
}

public void setNome(String nome){
    
    this.nome = nome;
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