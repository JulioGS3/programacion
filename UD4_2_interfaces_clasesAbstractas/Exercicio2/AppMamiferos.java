package UD4_2_interfaces_clasesAbstractas.Exercicio2;

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
    
    Morcego morcego1 = new Morcego();
    Morcego morcego2 = new Morcego();

    morcego1.voa();
    morcego2.voa();

    Gaivota gaivota1 = new Gaivota();
    Gaivota gaivota2 = new Gaivota();

    gaivota1.porOvos();
    gaivota1.voa();
    gaivota2.porOvos();
    gaivota2.voa();
    
}
}
