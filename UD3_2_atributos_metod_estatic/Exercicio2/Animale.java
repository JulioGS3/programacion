/*Modifica a clase Animal creada no exercicio anterior de xeito que teña unha variable estática chamada
numeroAnimais, na que se leve a conta dos animais vivos. Esta variable terá que ser modificada desde os métodos
que dan vida ou morte aos animais. Fai a proba creando 4 obxectos animal, e facendo que nazan e/ou morran.
Comproba que o valor da variable estática se corresponde co que debe, e toma sempre o mesmo valor para os
distintos animais (isto é así porque un atributo estático realmente é unha variable de clase) */

package UD3_2_atributos_metod_estatic.Exercicio2;

public class Animale {

public String nome;
public int idade;
public boolean vivo;
public static int numeroAnimales = 0;


public Animale (){

    nome = "vaca";
    idade = 5;
    vivo = false;
    numeroAnimales = 1;
}

public Animale (int idade, String nome, boolean vivo){

    this.nome = nome;
    this.idade = idade;
    this.vivo = vivo;

}

public void nace(){

if (vivo == false){

    numeroAnimales ++;

    System.out.println("nacin, hola. hai " + numeroAnimales + " animales");

    

    vivo= true;
}
}

public void morre(){

if (vivo == true){

    numeroAnimales --;

    if (numeroAnimales < 0){

        numeroAnimales = 0;
    }

    System.out.println("morrin, ata logo. hai " + numeroAnimales + " animales");

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
