package UD4_5_exepcions.Exercicio6;

public class OrdenadorException extends Exception{

    private String numeroSerie;
    private String mensaxe;

    public OrdenadorException(String numeroSerie, String mensaxe){

        this.numeroSerie = numeroSerie;
        this.mensaxe = mensaxe;
    }
        public String getMessage(){
            
            return numeroSerie + " " + mensaxe;
        }
    }


