/*3. Modifica o exercicio dos Dinosaurios da folla anterior, e crea unha variable de clase numDinosaurios, que se
incremente en cada chamada a un construtor. Comproba que despois de crear as 3 instancias din1, din2, e din3, a
variable estática vale 3.
Engade agora un método estático eMaisVello que compare 2 dinosaurios e devolve o nome do dinosaurio máis
vello. O método debe ser así:
String eMaisVello( Dinosaurio dino1, Dinosaurio dino2) {
/* DEBE DEVOLVER O NOME DO DINOSAURIO MÁIS VELLO */

package UD3_2_atributos_metod_estatic.Exercicio3;

public class Dinosaurio {

    private String nome;
    private int idade;
    public static int numDinosaurios = 0;



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
    numDinosaurios ++;
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

public static int getDinosaurios(){

    return numDinosaurios;

}

public static String eMaisVello(Dinosaurio din1, Dinosaurio din2){

if ( din1.idade > din2.idade){

    return din1.nome;

}else{

    return din2.nome;
}

}
}

   


