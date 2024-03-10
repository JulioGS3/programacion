/*5. Fai un programa que che vaia pedindo o nome e o primeiro apelido de distintos alumnos, (exemplo:
Federico Alvarez) e che diga en que quenda do curso está (A-M ás 16:00, da N-Z ás 18:00) e cantas
letras ten o nome completo (nome e primeiro apelido) e cantas letras ten o seu primeiro apelido.
Para saír o usuario debe pulsar 's'. Comproba que o primeiro apelido empeza por maiúsculas e se
Tema 1. Introdución a Java Programación 2023-2024
non é así corríxeo, de modo que na saída do programa o String estea corrixido. Se o nome coincide
co teu amosa un saúdo apaixonado.
Exemplo: Para Jaime alvarez imprimiría en pantalla:
Jaime Alvarez vai no grupo das 16:00.
O nome completo ten 16 letras e o seu primeiro apelido ten 7 letras. */
package Repaso;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    String nomeCompleto ="";
    Scanner entrada = new Scanner(System.in);
    
    
    while(!nomeCompleto.equals("s")){

    System.out.println("introduce o teu nome e apelidos, para sair pulsa s");
    nomeCompleto = entrada.nextLine();

    nomeCompleto = nomeCompleto.trim();    
    int primeiroEspazo = nomeCompleto.indexOf(" ");
    String nome = nomeCompleto.substring(0, primeiroEspazo);
    String apelido = nomeCompleto.substring(primeiroEspazo);
    nome = nome.trim();
    apelido = apelido.trim();

    //numero de letras total e do apelido

    int letrasApelido = apelido.length();
    int letrasNome = nome.length();
    int letrasTotales = letrasApelido + letrasNome;

    //apleido en maiuscula
    String primeiraLetraApelido = apelido.substring(0,1);
    apelido = apelido.substring(1);
    primeiraLetraApelido = primeiraLetraApelido.toUpperCase();
    apelido = primeiraLetraApelido.concat(apelido);

    nomeCompleto = nome.concat(" ");
    nomeCompleto = nomeCompleto.concat(apelido);
    String grupo = "";

    
    if (primeiraLetraApelido.compareTo("A") >= 0 && primeiraLetraApelido.compareTo("M") <= 0){

        grupo = "16:00";
        
        
    }else{
        
        grupo = "18:00";
    }
    if (nome.equals("Julio")){

         System.out.println("hola tocallo !!! " + nomeCompleto + " vai no grupo das " + grupo + ". o seu nome completo ten " + letrasTotales + " letras en total, e o apelido ten " + letrasApelido + " letras");

    }else{
    System.out.println(nomeCompleto + " vai no grupo das " + grupo + ". o seu nome completo ten " + letrasTotales + " letras en total, e o apelido ten " + letrasApelido + " letras");
    }
}


}
    
}
