/*Define outra subclase Camion que se alugue con un precioDia, co cal debe gardar diaInicio e diaFinal, así
como dúas variables estáticas numCamions e numCamionsAlugados. Define un construtor que inicialice as
variables empregando os valores dos argumentos.
Os métodos funcionarán de xeito similar ao dos turismos, se ben os cálculos deberán ser feitos tendo en conta
que agora o alugueiro está sendo por días. */
package UD3_7_Herdanza.Exercicio1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Camion extends Vehiculo{
    

    //atributos

    public int precioDia;
    public static int fechaIni;
    public static int fechaFinal;
    public static int numCamions=0;
    public static int numCamionsAlugados=0;
    
    //constructor
    
    public Camion (String matri, boolean alqui, int precDia, int fechIni, int fechFin){
        super(matri, alqui);
        precioDia = precDia;
        fechaIni = fechIni;
        fechaFinal = fechFin;
        numCamions ++;
    }

    //metodos

    public void alugar(){
       
        if(getAlugado() == "si"){
            System.out.println("xa está alugado");
        }else{
            
            System.out.println("non esta alugado, podelo alugar. a data de inicio e oxe dia " + fechaIni);
            numCamionsAlugados ++;
            numCamions--;
        }
    }

    public void devolver(int dia){
        fechaFinal = dia;
        int diasDeAluguer = (fechaFinal-fechaIni);
        int precioTotal = precioDia * diasDeAluguer;
        fechaIni = fechaFinal;
        numCamions ++;
        numCamionsAlugados--;
        
        System.out.println("o prezo que tes que pagar son " + precioTotal + " euros por un total de " + diasDeAluguer + " dias");
    }
    public void mostraInfo(){
        System.out.println("o veniculo con matricula " + getMatricula() + getAlugado() + " esta alugado, ten actualemente un precio por dia de " +  precioDia + " euros." +
        " hai un total de " + numCamionsAlugados + " camions alquilados, e quedandos " + numCamions + " para alquilar" );
    }
    public static int getNumCamionsAlquilados(){
        return numCamionsAlugados;
    }
    public static int getNumCamions(){
        return numCamions;
    }
}
