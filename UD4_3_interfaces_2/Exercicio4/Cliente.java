/*. Crea unha clase Cliente que terá como atributos o seu nome, e unha cidade (da clase Cidade).
Define todos os métodos, e fai que implemente a interface Comparable. No método compareTo( )
compara os clientes: será comparado pola poboación da súa cidade.
Crea agora unha clase AppClientes, no que teñas un array de 4 Clientes. Pide os valores por
teclado, para os 4 clientes, e mostra o array ordenado pola poboación, empregado Arrays.sort(  */
package UD4_3_interfaces_2.Exercicio4;

 public class Cliente extends Cidade implements Comparable{

    //atributos
    public String nomeCliente;
    public Cidade cidade;

    //constructor

    public Cliente(String nome, Cidade ciudad) {
        super();
        this.nomeCliente = nome;
        cidade=ciudad;
      
      
    }

    //metodos

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int coompareTo(Object obx){

        Cliente unhaCidade= (Cliente) obx;

        if(this.poblacion > unhaCidade.poblacion){
            return -1;
        }
        if(this.poblacion < unhaCidade.poblacion){
            return 1;
        }else{
            return 0;
        }
    }
    
 
    
 }