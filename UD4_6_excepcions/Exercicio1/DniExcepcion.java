package UD4_6_excepcions.Exercicio1;
/**
 * DniExcepcion
 */
public class DniExcepcion extends Exception{


    public String mensaxe;
    public String numDni;

    public DniExcepcion (String numDni, String mensaxe){
        
        this.numDni = numDni;
        this.mensaxe = mensaxe;

    }
    

    public String getMessage(){

        return numDni + " " + mensaxe;
    }

    }
    
