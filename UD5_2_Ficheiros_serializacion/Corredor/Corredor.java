package Corredor;
/**
 * Corredor
 */
public class Corredor {

    public int dorsal;
    public Double tempo;



    public Corredor(int dorsal, Double tempo) {
        this.dorsal = dorsal;
        this.tempo = tempo;
    }



    public int getDorsal() {
        return dorsal;
    }



    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }



    public Double getTempo() {
        return tempo;
    }



    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }



    @Override
    public String toString() {
        return dorsal + ";" + tempo;
    }


    

    
}