package UD4_6_excepcions.Exercicio2;

/**
 * ipExepcion
 */
public class ipExepcion extends Exception{

    public String mensaxe;


    public ipExepcion(String mensaxe){
        this.mensaxe = mensaxe;
    }

    public String getMessage(){
        return mensaxe;
    }
    
}