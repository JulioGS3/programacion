/*1. Crea unha clase BiciElect que teña como atributos nome, marca, autonomiaKms. Define os seus getters e
setters, e 2 construtores, un con parámetros e outro sen eles. Define un atributo estático numBicis na que
gardaremos o número de bicicletas que se van creando. Define tamén un método comparaAutonomía( ), que
recibe 2 BiciElect e devolve a BiciElect con maior autonomía. */
package Exercicio_Exame;

public class BiciElect {

    //clase

    public String nome;
    public int autonomiaKms;
    public String marca;
    public static int numBicis = 0;

    //constructores

    public BiciElect (String nom, String marc, int autonomia){

        nome = nom;
        marca = marc;
        autonomiaKms = autonomia;
       numBicis++;
    }
    public BiciElect(){

        nome = "bici";
        marca = "marca";
        autonomiaKms = 5;
        numBicis++;
        
    }

    //metodos


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public int getAutonomiaKms() {
        return autonomiaKms;
    }
    public void setAutonomiaKms(int autonomiaKms) {
        this.autonomiaKms = autonomiaKms;
    }

     
    public static BiciElect comparaAutonomia(BiciElect bici1, BiciElect bici2){

        BiciElect maisAutonomia = bici1;
        
        if (bici1.autonomiaKms > bici2.autonomiaKms){
            maisAutonomia = bici1; 
        }else{
            maisAutonomia = bici2;
        }
        
        return maisAutonomia;
    }
    public static BiciElect comparaAutonomiaMenor(BiciElect bici1, BiciElect bici2){

        BiciElect menosAutonomia = bici1;
        
        if (bici1.autonomiaKms < bici2.autonomiaKms){
            menosAutonomia = bici1; 
        }else{
            menosAutonomia = bici2;
        }
        return menosAutonomia;
    }

}  
 
