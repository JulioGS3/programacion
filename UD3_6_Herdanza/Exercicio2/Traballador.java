/*2. Crea unha clase Traballador, con atributos privados dni, nome e apelidos. Define tamén un atributo
estático numTraballadores. Define 2 construtores e os métodos precisos. Crea agora 2 subclases:
Condutor e Electricista. Dos condutores gardamos a matrícula do seu vehículo, e dos electricistas
se é fixo ou temporal (booleano). Crea agora outra clase AppTraballador na que definas 3
condutores e 2 electricistas. Modifica un condutor para que teña os valores 11111111A,
“Carlos”,”Lopes”, e outro electricista para que se chame “Ana”,”Sánchez”, con DNI 44332211H. Lista
os valores de todos os traballadores. Fíxate que o atributo numTraballadores debe valer 5 para
todos. */
package UD3_6_Herdanza.Exercicio2;

public class Traballador {

    //atributos
    
    private String dni;
    private String nome;
    private String apelido1;
    private String apelido2;

    private static int numTraballadores;

    //constructores

    public Traballador (){

        dni = "45871236L";
        nome = "default";
        apelido1 ="def1";
        apelido2 = "def2";

        numTraballadores++;
    }
    public Traballador(String nif, String nom, String ape1, String ape2){

        dni = nif;
        nome = nom;
        apelido1 = ape1;
        apelido2 = ape2;
        numTraballadores++;
    }
    //metodos

    public void setDni(String nif){
        dni = nif;
    }
    public String getDni(){
        return dni;
    }
    public void setNome(String nom){
        nome = nom;
    }
    public String getNome(){
        return nome;
    }
    public void setApelido1(String ape1){
        apelido1 = ape1;
    }
    public String getApelido1(){
        return apelido1;
    }
    public void setApelido2(String ape2){
        apelido2 = ape2;
    }
    public String getApelido2(){
        return apelido2;
    }
    public static int getNumTraballador (){
        return numTraballadores;
    }
}
