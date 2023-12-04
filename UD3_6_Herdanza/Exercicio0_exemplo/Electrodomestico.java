package UD3_6_Herdanza.Exercicio0_exemplo;

public class Electrodomestico {
    
private int prezo;
private String codigo;

public Electrodomestico (){

    codigo = "null";
    prezo = 0;
}
public Electrodomestico(String cod, int pre){
    codigo = cod;
    prezo = pre;
}

public String getCodigo(){
    return codigo;
}
public void setCodigo(String cod){
    codigo = cod;
}
public int getPrezo(){
    return prezo;
}
public void setPrezo(int pre){
    prezo = pre;
}
}
