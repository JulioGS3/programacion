/*1. Crea unha clase Animal que teñan como atributo a idade, o nome e un "boolean" vivo, que valerá true se o animal
está vivo (nace) e false se está morto (logo de chamar ao método morre). Define dous constructores, un con
argumentos e outro sen eles. Define un método nace( ) que mostre un saúdo cando o animal nace, un método
morre( ) que se despida da terra ao morrer, así como un método getDatos( ) que imprima os valores de idade e
nome, e devolva a idade. Lembra que nace( ) e morre( ) teñen que modificar o valor de vivo. Comproba que todo
vai ben creando 3 animais, dándolle valores aos seus atributos e chamando a todos os métodos. */
package UD3_2_atributos_metod_estatic.Exercicio1;

public class Animal {
    
public String nome;
public int idade;
public boolean vivo;


public Animal (){

    nome = "vaca";
    idade = 5;
    vivo = false;
}

public Animal (int idade, String nome, boolean vivo){

    this.nome = nome;
    this.idade = idade;
    this.vivo = vivo;

}

public void nace(){

if (vivo == false){

    System.out.println("nacin, hola");

    vivo= true;
}
}

public void morre(){

if (vivo == true){

    System.out.println("morrin, ata logo");

    vivo = false;
}
}

public int getIdade(){

    return idade;
}
public String getNome(){

    return nome;

}

}

