/*Define agora 2 subclases de planeta chamadas PlanetaHabitable e PlanetaHostil. Os
planetasHabitables terán un atributo numeroPersoas que collerían no planeta, así como
temperaturaMinima e temperaturaMaxima. Dos nonHabitables gardaremos se hai vida ou non, e
outro booleano que indica se hai fontesDeEnerxia.
Define construtores para as subclases (lembra que hai que chamar aos construtor da superclase
antes de nada) e os métodos para modificar os atributos novos, así como un método listaTodo( )que
nos liste todos os atributos. */

package UD3_6_Herdanza.Exercicio3;

public class PlanetaHostil extends Planeta {

    //atributos

    public boolean haiVida = true;
    public boolean haiFontesEnerxia = true;

    //constructores

    public PlanetaHostil(){
        super();
        haiVida = false;
        haiFontesEnerxia =true;
    }

    public PlanetaHostil(boolean accesi, String nombre, int tama, boolean vida, boolean enerxia, Double dist){
        super(accesi, nombre, tama, dist);
        haiVida = vida;
        haiFontesEnerxia = enerxia;
    }
    
    //metodos

    
    public void setHaiVida (boolean vida) {
        haiVida = vida;
    }
    public String getHaiVida(){

        String vida = "";

        if( haiVida == true){
            vida = "si hai vida";
        }else{
            vida = "non hai vida";
        }
        return vida;
    }
    public void setHaiEnerxia(boolean enerxia){
        haiFontesEnerxia = enerxia;
    }
    public String gethaiEnerxia(){

        String enerxia = "";

        if(haiFontesEnerxia == true){

            enerxia = "si hai enerxia";
        }else{ 
            enerxia = "non hai enerxia";}
        return enerxia;
        }
        public void listaTodo(){

        System.out.println( getNome() + " " + getAccesibilidade() + ", ten un tamaño de " + getTamaño() +" soles, esta a unha distancia de " + getDistancia() + " anos luz. " + getHaiVida() + ", e " + gethaiEnerxia() );
    }
}

