package UD4_4_interfaces_3.Exercicio2;

public abstract class Tripulante {

    public String dni;
    public int idade;
    public int diasNaEmpresa;
    public String nome;
    public int soldo;
    public Barco barco;

    public abstract int calculaSoldo();

    public abstract void mostraDatos();
    
    
}