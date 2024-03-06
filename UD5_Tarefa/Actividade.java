package UD5_Tarefa;
/**
 * • A clase Actividade terá como atributos: codActividade, nomeActividade, horasSemanais, prezoActividade,
salaActividade, construtor. Engade tamén métodos de acceso, método toString() para mostrar a actividade e
un método toStringParaFicheiro( ). Ademais, os métodos que precises por exemplo para validar os datos ou
outros. Actividade
Excepcions:
- as horasSemanais estarán entre 2 e 3
• O prezo da actividade non pode superar os 50 euros
• A sala da Actividade debe ser “Castelao” ou “Dalí”
 */
public class Actividade {

    public int codActividade;
    public String nomeActividade;
    public int horasSemanais;
    public Double prezoActividade;
    public String salaActividade;


    public Actividade(int codActividade, String nomeActiviade, int horasSemanais, Double prezoActividade, String salaActividade) throws ExcepcionsSociedade {

        this.codActividade = codActividade;
        this.nomeActividade = nomeActividade;
        this.horasSemanais = horasSemanais;
        this.prezoActividade = prezoActividade;
        this.salaActividade = salaActividade;

        if(Actividade.comprobarHorasSemanais(horasSemanais) == false){
            throw new ExcepcionsSociedade("As horas deben estar entre 2 e 3", 1); 
        }
        if(Actividade.comprobarPrezo(prezoActividade) == false){
            throw new ExcepcionsSociedade("o prezo debe ser inferior a 50", 2);
        }
        if(Actividade.comprobarSala(salaActividade) == false){
            throw new ExcepcionsSociedade("nome da sala non válido", 3);
        }
    }

    public static boolean comprobarHorasSemanais(int horasSemanais){
       
        if(horasSemanais >= 2 && horasSemanais <= 3){
            return true;
        }else{
            return false;
        }
    }
    public static boolean comprobarPrezo(Double prezo){
    
        if(prezo < 50){
            return true;
        }else{
            return false;
            }
    }
    public static boolean comprobarSala(String salaActividade){
    
        if(salaActividade.equals("Castelao") || salaActividade.equals("Dali")){
            return true;
        }else{
            return false;
        }
    }

    public int getCodActividade() {
        return codActividade;
    }


    public void setCodActividade(int codActividade) {
        this.codActividade = codActividade;
    }


    public String getNomeActiviade() {
        return nomeActividade;
    }


    public void setNomeActiviade(String nomeActividade) {
        this.nomeActividade = nomeActividade;
    }


    public int getHorasSemanais() {
        return horasSemanais;
    }


    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }


    public Double getPrezoActividade() {
        return prezoActividade;
    }


    public void setPrezoActividade(Double prezoActividade) {
        this.prezoActividade = prezoActividade;
    }


    public String getSalaActividade() {
        return salaActividade;
    }


    public void setSalaActividade(String salaActividade) {
        this.salaActividade = salaActividade;
    }


    @Override
    public String toString() {
        return "Actividade [codActividade=" + codActividade + ", nomeActiviade=" + nomeActividade + ", horasSemanais="
                + horasSemanais + ", prezoActividade=" + prezoActividade + ", salaActividade=" + salaActividade + "]";
    }
    public String toStringParaFicheiro() {
        return codActividade + ";" + nomeActividade + ";" + horasSemanais + ";" + prezoActividade + ";" + salaActividade;
    }

    
    
    
}