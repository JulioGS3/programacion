package UD5_0_Arraylist.Exercicio5;
/**
 *5.- Fai unha clase Cliente, con atributos nome, tfno, email. Fai agora unha clase AppClienteLista que defina unha lista de clientes, 
 e mostrará un menú para:

    introducir un cliente novo
    mostrar todos os clientes
    saír
 
 */
public class Cliente {

    private String nome;
    private int telefono;
    private String email;


    public Cliente(String nome, int telefono, String email) {
        this.nome = nome;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    
    
}