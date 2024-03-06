package UD5_Tarefa;
/**
 * ExcepcionsSociedade
 */
public class ExcepcionsSociedade extends Exception{

    public String mensaxe;
    public int codError;

    public ExcepcionsSociedade(String mensaxe, int codError){
        this.mensaxe = mensaxe;
        this.codError = codError;
    }


    public String getMessage(){

        return "codigo de erro " + codError + ", " + mensaxe;
    }
    
}