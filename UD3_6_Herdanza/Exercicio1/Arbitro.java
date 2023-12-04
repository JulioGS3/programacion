package UD3_6_Herdanza.Exercicio1;

public class Arbitro extends Participante {
    
//atri

    public int anos;
//constr
    public Arbitro(){
        super();
        anos = 1;
    }
    
    public Arbitro(String nom, int edad, int ano){
        super(nom, edad);
        anos = ano;
    }
//metod
    public void setAno(int ano){
        anos = ano;
    }
    public int getAno(){
        return anos;
    }
}
