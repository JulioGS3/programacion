/*1.- Na clase Empresa deben declararse as características da empresa, tales como: nome, CIF, localidade,
e un array dos Empregados pertencentes á empresa, como moito serán 6.

Empresa.
a) Indica o nome da empresa e o seu número máximo de empregados
b) Indicar o nome de la empresa. O número de empregados por defecto será de 6 */
package UD4_0_objects;

public class Empresa {

    //clase

    public String nome;
    public String cif;
    public String localidade;
    public Empregado [] arrayNumEmpregados = new Empregado [6];

    
    //constructores

    public Empresa(String nome, String cif, String localidade, Empregado[] array) {
        
        this.nome = nome;
        this.cif = cif;
        this.localidade = localidade;
        arrayNumEmpregados = array;
    }
    
    //metodos

   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public Empregado[] getArray() {
        return arrayNumEmpregados;
    }
    public void setArray(Empregado[] array) {
        arrayNumEmpregados = array;
    }
    public void numeroEmpregados(Empregado[] array){
        arrayNumEmpregados = array;
        System.out.println("hai " + arrayNumEmpregados.length + " empregados");
    }
    public void pertenceEmpregadoEmpresa(Empregado empre, Empresa empres){
        
            System.out.println();
        }
    }
}