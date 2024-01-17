/*Define agora unha subclase de vehículo chamada Turismo que teña como atributos precioKm, kmAlquiler,
kmDevolucion e dúas variables estáticas numTurismos, numTurAlquilados. Define un construtor que inicialice
as variables empregando os valores dos argumentos.
O método alugar ( ) deberá comprobar que o turismo non está alugdao e dar un aviso se o está, e se non o
está informar dos kms que ten no momento do alugueiro, informando que o turismo está alugado.
O método devolver( ) deberá pedir os kms e devolver o prezo a pagar, ademais de modificar as variables que
correspondan. Debe indicar que o vehículo xa non está alugado.
O método mostraInf( ) deberá mostrar todos os datos do turismo e o valores das variables estáticas de clase. */
package UD3_7_Herdanza.Exercicio1;

import java.util.Scanner;

public class Turismo extends Vehiculo{

    //atributos

    public int precioKm;
    public int kmAlquiler;
    public int kmDevolucion;
    public static int numTurAlquilados=0;
    public static int numTurismos=0;

    // constructores

    public Turismo(String matri, boolean alug, int precKm, int kmAlq, int kmDev){
        super(matri, alug);
        precioKm = precKm;
        kmAlquiler = kmAlq;
        kmDevolucion = kmDev;       
        numTurismos ++; 
    }
    //metodos
    
    public void alugar(){
        
        if(getAlugado() == "si"){
            System.out.println("xa está alugado");
        }
        if{
            System.out.println("non esta alugado, podelo alugar. ten ahora mesmo " + kmAlquiler + " kms");
            numTurAlquilados ++;
            numTurismos--;
        }
    }
    public void devolver(int kmDev){
        kmDevolucion = kmDev;
        int kmFeitos = (kmDevolucion-kmAlquiler);
        int prezoKms = precioKm * kmFeitos;
        kmAlquiler = kmDevolucion;
        numTurismos ++;
        System.out.println("o prezo que tes que pagar son " + prezoKms + " euros por un total de " + kmFeitos + " kms");
    }
    public void mostraInfo(){
        System.out.println("o veniculo con matricula " + getMatricula() + " " + getAlugado() + " esta alugado, ten actualemente  " + kmAlquiler + " kms, e o precio pro km e de " +
         precioKm + ". hai un total de " + numTurAlquilados + " turismos alquilados, e quedandos " + numTurismos + " para alquilar" );
    }
    public static int getNumTurismosAlquilados(){
        return numTurAlquilados;
    }
    public static int getNumTurismos(){
        return numTurismos;
    }
}
    
