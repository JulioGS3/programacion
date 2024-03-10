/*1.- Na clase Empresa deben declararse as características da empresa, tales como: nome, CIF, localidade,
e un array dos Empregados pertencentes á empresa, como moito serán 6.

Empresa.
a) Indica o nome da empresa e o seu número máximo de empregados
b) Indicar o nome de la empresa. O número de empregados por defecto será de 6 */
package UD4_0_objects;

import java.util.Arrays;

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
       int num = array.length;
       System.out.println("hai " + num + " empregados");
    }
    public boolean pertenceEmpregadoEmpresa(Empregado empregado){
        boolean pertenece = false;
        for (Empregado e : arrayNumEmpregados) {
            if(e.equals(arrayNumEmpregados)){
                pertenece = true;
            }
        }
            return pertenece;
        }
        public String comprobarPorNumIdentidicacion( String numeroIdentifica){
          for (Empregado empregado : arrayNumEmpregados) {
            if(empregado != null && empregado.getDni() == numeroIdentifica){ //o de null e pa evitar errores si o array non esta completo
                return empregado.getNome();
            }
        }
            return "empregado non atopado";
          }
          public String obterNumIdentidicacion( String nome){
            for (Empregado empregado : arrayNumEmpregados) {
              if(empregado != null && empregado.getNome() == nome){
                  return empregado.getDni();
              }
          }
              return "empregado non atopado";
            }

            public void mostraNome(){
                for (Empregado empregado : arrayNumEmpregados) {
                    System.out.println(empregado.getNome());
                }
            }

            public void altaEmpregado(Empregado empregado){
                for (int i = 0; i < arrayNumEmpregados.length; i++) {
                arrayNumEmpregados[i] = empregado;
           }
            }

            public void baixaEmpregado(String numIdentifica){

                for (int i = 0; i < arrayNumEmpregados.length; i++) {
            
                    if( arrayNumEmpregados[i] != null && arrayNumEmpregados[i].getDni() == numIdentifica)
                    arrayNumEmpregados[i] = null;
                    break;
                }
            }
            public Double sumaSoldos(){

                Double soldoTotal = 0.0;
                for (int i = 0; i < arrayNumEmpregados.length; i++) {

                    soldoTotal = soldoTotal + arrayNumEmpregados[i].getSoldo();
                }
                return soldoTotal;
            }
            public void mostrarEmpleados(){
                for (Empregado empregado : arrayNumEmpregados) {
                    System.out.println(empregado);
                }
            }
            public void empleadosPorCategoria(){
                int contProg = 0;
                int contConsultor = 0;
                int contDirect = 0;
                int contAnalist = 0;

                for (int i = 0; i < arrayNumEmpregados.length; i++) {
                    
                    if(arrayNumEmpregados[i].getCategoria().equals("programador")){
                        contProg ++;
                    }
                    if(arrayNumEmpregados[i].getCategoria().equals("consultor")){
                        contConsultor ++;
                    }
                    if(arrayNumEmpregados[i].getCategoria().equals("directivo")){
                        contDirect ++;
                    }
                    if(arrayNumEmpregados[i].getCategoria().equals("analista")){
                        contAnalist ++;
                    }

                }
                System.out.println("hai " + contProg + " programadores, " + contAnalist + " analistas, " + contConsultor + " consultores e " + contDirect + " directivos");
            }
        

        }
    

    
          
        
    

 
        
    
 