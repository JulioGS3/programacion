package UD4_2_interfaces_clasesAbstractas.Exercicio1;

public class AppMamiferos {
public static void main(String[] args) {
    
    Baleas balea1 = new Baleas();
    Baleas balea2 = new Baleas();

    balea1.amamantarCrias();
    balea2.amamantarCrias();

    Ornitorrinco orni1 = new Ornitorrinco();
    Ornitorrinco orni2 = new Ornitorrinco();
    
    orni1.amamantarCrias();
    orni1.porOvos();
    orni2.amamantarCrias();
    orni2.porOvos();
    
}
}
