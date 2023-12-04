package UD3_6_Herdanza.Exercicio2;

public class Conductor extends Traballador{
    

    //atrib

    public String matricula;

    //construct

    public Conductor(){
        super();
        matricula = "0245-hgj";
    }
    public Conductor(String nif, String nom, String ape1, String ape2, String matri){

        super(nif, nom, ape1, ape2);
        matricula = matri;
    }

    // metodos

    public void setMatricula (String matri){
        matricula = matri;
    }
    public String getMatricula(){
        return matricula;
    }
}
