/*Define agora 2 subclases de planeta chamadas PlanetaHabitable e PlanetaHostil. Os
planetasHabitables terán un atributo numeroPersoas que collerían no planeta, así como
temperaturaMinima e temperaturaMaxima. Dos nonHabitables gardaremos se hai vida ou non, e
outro booleano que indica se hai fontesDeEnerxia.
Define construtores para as subclases (lembra que hai que chamar aos construtor da superclase
antes de nada) e os métodos para modificar os atributos novos, así como un método listaTodo( )que
nos liste todos os atributos. */

package UD3_6_Herdanza.Exercicio3;

public class PlanetaHabitable extends Planeta {

    //atrib

    public int numPersoas;
    public int temperaturaMin;
    public int temperaturaMax;

    //construct

    public PlanetaHabitable (){
        super();
        numPersoas = 1000;
        temperaturaMax = 40;
        temperaturaMin = 0;
    }

    public PlanetaHabitable(boolean accesi, String nombre, int tama, int numPers, int tempMin, int tempMax, Double dist){
        
        super(accesi, nombre, tama, dist);
        numPersoas = numPers;
        temperaturaMin = tempMin;
        temperaturaMax = temperaturaMin;   
    }
    //metodos
    

        public void setNumPersoas(int numPers){
            numPersoas = numPers;
        }
        public int getNumPersoas(){
            return numPersoas;
        }
        public void setTemperaturaMin(int tempMin){
            temperaturaMin = tempMin;
        }
        public int getTemperaturaMin(){
            return temperaturaMin;
        }
        public void setTemperaturaMax(int tempMax){
            temperaturaMax = tempMax;
        }
        public int getTemperaturaMax(){
            return temperaturaMax;
        }
        public void  listaTodo(){
            
            System.out.println( getNome() + " " + getAccesibilidade() + ", ten un tamaño de " + getTamaño() +" soles, esta a unha distancia de " + getDistancia() + " anos luz, hai " + getNumPersoas()+ " de persoas, e a temperatura minima e de " + getTemperaturaMin() + " e a maxima e de "+ getTemperaturaMax()  );
    
        }
    
    }

