/* 
2.- Na clase Empregado deben declararse as características dun empregado que permitan identificalo
dentro da empresa: nome, numeroIdentificacion, categoría e soldo.
Constructores
Empregado.
a) Indica o nome do empregado empregado, o seu número de indentificación e a categoría á que
pertence. A categoría por defecto é a de programador */

package UD4_0_objects;

public class Empregado {

    //clases

    public String nome;
    public String dni;
    public String categoria;
    public int soldo;

     //constructores

    public Empregado(String nome, String dni, String categoria, int soldo) {
        
        this.nome = nome;
        this.dni = dni;
        this.categoria = categoria;
        if (categoria.equals("programador")){
            if (soldo < 1100 || soldo > 1800){
                this.soldo = soldo;}
        }
         else if (categoria.equals("analista")){
            if (soldo < 1500 || soldo > 2200){
                this.soldo = soldo;
        }
        }
         else if (categoria.equals("consultor")){
            if (soldo < 1700 || soldo > 3500){
            this.soldo = soldo;}
        }
         else if (categoria.equals("directivo")){
            if (soldo < 4000 || soldo > 4800){
            this.soldo = soldo;}
        }else{
            soldo = 0;
            System.out.println("o salario introducido non é valido para esa categoria");
        }
    }
    public Empregado(){

        nome = "default";
        dni = "0000000L";
        categoria = "programador";
        soldo = 1100;
    }

    // metodos

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getSoldo() {
        return soldo;
    }
    public void setSoldo(int sueldo, String categoria) {
        soldo = sueldo;
        this.categoria = categoria;
        
        if (categoria.equals("programador")){
            if (soldo < 1100 || soldo > 1800){
                soldo = sueldo;}
        }
         else if (categoria.equals("analista")){
            if (soldo < 1500 || soldo > 2200){
                this.soldo = sueldo;}
    }
      else if (categoria.equals("consultor")){
            if (soldo < 1700 || soldo > 3500){
            this.soldo = soldo;}
        }
         else if (categoria.equals("directivo")){
            if (soldo < 4000 || soldo > 4800){
            this.soldo = soldo;}
        }else{
            soldo = 0;
            System.out.println("o salario introducido non é valido para esa categoria");
        }
    }
    
}