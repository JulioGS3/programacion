package UD3_6_Herdanza.Exercicio1;

public class Xogador extends Participante {
    
    //atri
    public String posto;

    //cosntr

    public Xogador(){
        super();
        posto = "defensa";
    }
    public Xogador(String nom, int edad, String post){
        super(nom, edad );
        posto = post;
    }
    //meto
    public void setPosto(String post){
        posto = post;
    }
    public String getPosto(){
        return posto;
    }
    
}
