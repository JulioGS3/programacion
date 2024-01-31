/*3. Crea unha clase Cidade, con atributos nome, e poboación. Define os métodos getters e setters de
xeito automatico. Fai que implemente a interface Comparable, para o que terás que definir o
método correspondente.
Crea agora unha clase AppCidades, que terá un array de 5 cidades. Pide os valores por teclado con
JOptionPane, para as 5 cidades, e mostra o array ordenado pola poboación, empregando
Arrays.sort(  */
package UD4_3_interfaces_2.Exercicio4;

public class Cidade implements Comparable{

    public String nome;
    public int poblacion;

    public Cidade(String nome, int poblacion) {
        this.nome = nome;
        this.poblacion = poblacion;
    }
    public Cidade(){
        nome = "coruña";
        poblacion=100000;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int compareTo(Object obx){

        Cidade unhaCidade = (Cidade) obx;

        if(this.poblacion < unhaCidade.poblacion){
            return -1;
        }
        if(this.poblacion > unhaCidade.poblacion){
            return 1;
        }else{
            return 0;
        }
    }
    
}