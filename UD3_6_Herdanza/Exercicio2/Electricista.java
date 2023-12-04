package UD3_6_Herdanza.Exercicio2;

public class Electricista extends Traballador {
    
//atrib
    
    public boolean fixo;

//cosntruc

    public Electricista(){
        super();
        fixo = true;
    }
    public Electricista(String nif, String nom, String ape1, String ape2, boolean tipoContrato){
        super(nif, nom, ape1, ape2);
        fixo = tipoContrato;
    }

//metodos

    public void setContrato (boolean tipoContrato){
        fixo = tipoContrato;
    }
    public String getContrato(){
        String contrato=""; 
        
        if (fixo == true){
            contrato ="fixo";
        }else{
            contrato="temporal";
        }
        return contrato;
    }
}
