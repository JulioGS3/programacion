package UD5_1_Ficheiros_texto.Exercicio3;

import java.util.ArrayList;

/**
 * Exercicio 3

Queremos facer un programa para xestionar usuarios dunha biblioteca: nomeUsuario, email, teléfono. Define unha clase Usuario para isto. 
Gardaremos eses usuarios nun ArrayList. O programa deberá mostrará un menú:

    introducir usuarios desde teclado
    gardar usuarios nun ficheiro. Gardaremos cunha liña de texto, separando os atributos por “:”. Para isto define un método toStringParaGardar() 
    na clase Usuario, que chames para gardar os usuarios no ficheiro

    recuperar usuarios do ficheiro
    borrar o contido do ficheiro
    mostrar todos os usuarios.

Nunha segunda execución do programa temos que poder recuperar os datos do ficheiro e ver os usuarios gardados no ficheiro Usuario
 */
public class Usuario {

    public String nomeUsuario;
    public String email;
    public int teléfono;

    public Usuario(String nomeUsuario, String email, int teléfono) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return nomeUsuario + ";" + email + ";" + teléfono;
    }
    
  
    

   

    
    







}