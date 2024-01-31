/*. Define unha clase abstracta Persoa cos seguintes atributos: nome, apelidos, idade. Terá tamén un
método definido dameNome( ), e un método dameDescricion( ) abstracto. */

package UD4_3_interfaces_2.Exercicio1;

public abstract class Persona {

    public String nome;
    public String apelidos;
    public int idade;

    public abstract String dameNome();
    public abstract String dameDescricion();
    
}