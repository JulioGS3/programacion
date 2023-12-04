/*3. Crea unha clase Planeta que teña como atributos accesible (booleano), nome, tamaño en "soles", e
distancia á Terra. Garda tamén unha variable estática numPlanetasAccesibles, que se irá
modificando ao introducir planetas no programa. Define os construtores e os métodos para modificar
eses valores, así como un método explotou( ), que cando é chamado cambia o atributo accesible a
falso e diminúe numPlanetasAccesibles. */

package UD3_6_Herdanza.Exercicio3;

public class Planeta {

    //atributos

    private boolean accesible;
    private String nome;
    private int tamaño;
    private static int numPlanetasAccesibles;
    private Double distancia;
    
    //constructor

    public Planeta(){
        
        accesible = false;
        nome = "marte";
        tamaño = 30;
        distancia = 1.2;
        if (accesible == true){
        numPlanetasAccesibles ++;}
        }
    public Planeta(boolean eAccesible, String nom, int tam, Double dist){
        accesible = eAccesible;
        nome = nom;
        tamaño = tam;
        distancia = dist;
        if (accesible == true){
            numPlanetasAccesibles ++;}
            }
    

    //metodos
    
    public void setAccesibildade(boolean eAccesible){
        accesible = eAccesible;
        numPlanetasAccesibles--;
    }
    public String getAccesibilidade(){

        if (accesible == true){
            return "e accesible";
        }else{
            return "non e accesible";
        }
    }
    public void setNome(String nom){
        nome = nom;
    }
    public String getNome(){
        return nome;
    }
    public void setTamaño (int tam){
        tamaño = tam;
    }
    public int getTamaño(){
        return tamaño;
    }
    public void setDistancia(Double dist){
        distancia = dist;
    }
    public Double getDistancia(){
        return distancia;
    }
    public void Explotou(){

        System.out.println("Boom");
        accesible = false;
        numPlanetasAccesibles --;
    }

    public static int getNumPlanetasAccesibles(){
        return numPlanetasAccesibles;
    }
    
    }

