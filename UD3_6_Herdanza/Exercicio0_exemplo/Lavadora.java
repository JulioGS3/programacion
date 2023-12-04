package UD3_6_Herdanza.Exercicio0_exemplo;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora (){
        super();
        this.setCodigo("codigo 1");
        carga = 0;
    }
    public Lavadora (String cod, int pre, int carg){
        super(cod, pre);
        carga = carg;
    }
   public int getCarga( ){
    return carga;
   }
    }

