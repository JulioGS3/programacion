package UD4_6_excepcions.Exercicio3;
/**
 * ExcepcionCoche
 */
public class ExcepcionCoche extends Exception{

    public String mensaxe;

    public ExcepcionCoche(String mensaxe) {
        this.mensaxe = mensaxe;
    }

    public String getMessage(){
        return mensaxe;
    }

    
}