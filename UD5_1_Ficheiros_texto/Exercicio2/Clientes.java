package UD5_1_Ficheiros_texto.Exercicio2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.Option;

import UD4_3_interfaces_2.Exercicio4.Cliente;
import UD4_6_excepcions.Exercicio2.ipExepcion;

/**
 * Clientes
 */
public class Clientes {

    public String nome;
    public String apelidos;
    public int idade;

    
    public Clientes(String nome, String apelidos, int idade) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getApelidos() {
        return apelidos;
    }


    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", apelidos=" + apelidos + ", idade=" + idade + "]";
    }


    
}