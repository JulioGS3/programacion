/*1. Crea unha clase Participante, con atributos privados nome e idade. Define os construtores e
métodos de acceso. Crea agora 2 subclases: Xogador e Árbitro. Dos xogadores gardamos o seu
posto no campo, e do árbitro os anos que leva arbitrando. Crea os seus construtores (lembra que hai
que chamar ao construtor da superclase antes de nada) e métodos de acceso.
Crea noutra clase AppParticipante 2 obxectos de cada subclase (2 xogadores e 2 árbitros)dando
valores aos seus atributos e comproba que funcionan todos os métodos para cambiar nome, idade,
posto e anosArbitraxe */

package UD3_6_Herdanza.Exercicio1;

public class Participante {

     //atributos

    private String nome;
    private int idade;

    //constructores
   
    public Participante(){

        nome = "default";
        idade = 0;
    }

    public Participante(String nom, int edad){

        nome = nom;
        idade = edad;
    }
    //metodos

    public void setNome(String nom){
        nome = nom;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int edad ){
        idade = edad;
    }
    public int getIdade(){
        return idade;
    }

    

    }
