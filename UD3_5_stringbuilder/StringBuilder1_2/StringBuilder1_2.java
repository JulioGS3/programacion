/*2. Crea unha clase FraseBuilder que teña como atributo un StringBuilder frase e outro atributo String saudo.
Crea agora os seguintes métodos:
a) iniciaFrase( ): engadirá un valor pedido por teclado a frase
b) eliminaFrase( ): Podes empregar o método delete, ou asignar un length = 0.
c) mostraFrase( ): Mostrará o saúdo, e a continuación a frase
d) mostraLonxitudeCapacidade( ): mostra a lonxitude e a capacidade de frase
e) eliminaParte( ): Pedirá dous índices e eliminará as letras entre eses índices de frase.
f) introducirDouble( ): Pedirá a posición e o double e o introducirá na frase.
g) invertirFrase( ): inverterá a frase */

package UD3_5_stringbuilder.StringBuilder1_2;

public class StringBuilder1_2 {

//atributos

public StringBuilder frase;
public String saudo;

//constructor

public StringBuilder1_2 (StringBuilder cadea){
    
    frase = cadea;
    
}


//metodos

public void setIniciaFrase ( StringBuilder cadea){

    frase = cadea;
}
public void setIniciaSaudo(String saludo){

    saudo = saludo;
}
public StringBuilder eliminaFrase( StringBuilder cadea){

    frase = cadea;
    int total = frase.length();
    frase = frase.delete(0, total);
    return frase;
}
public StringBuilder mostraFrase (StringBuilder cadea, String saludo){

    frase = cadea;
    saudo = saludo;
    frase = frase.replace(0, 0, saudo);
    return frase;
   
}
public void mostraLonxitudeEcapacidade(StringBuilder cadea){

    frase = cadea;

    int lonx = 0;
    int cap = 0;

    cap = cadea.capacity();
    lonx = cadea.length();
    System.out.println(" a lonxitude e " + lonx + " e a capacidade e " + cap );
}

public StringBuilder eliminaParte (int inicio, int fin, StringBuilder cadea){

    frase = cadea;
    frase = frase.delete(inicio, fin);
    return frase;
} 
public StringBuilder introduceDouble(int posición, Double num, StringBuilder cadea){

    frase = cadea;
    frase = frase.insert(posición, num);
    return frase;
}
public StringBuilder invertirFrase(StringBuilder cadea){

    frase = cadea;
    frase = frase.reverse();
    return frase;
}

} 

