/*5. Crea unha clase chamada Empregado, que conteña atributos públicos para o nome, os apelidos, o DNI e o salario.
Engade un construtor sen argumentos, que poña uns valores "razoables" neses atributos. Crea varios métodos setNome(String
nome ), setApelidos(String apelido), setDni(... ), e setSalario(... ), que modifiquen os valores cos argumentos. Crea 2
empregados e comproba que os métodos fan o que deben facer. */

package UD3.obxectos.Exercicio5;

public class Empregado {
 
    public String nome;
    public String apelido1;
    public String apelido2;
    public String dni;
    public int salario;

    
public Empregado(){

nome = "manolo";
apelido1 = "rodriguez";
apelido2 = "santana";
dni = "46997320L";
salario = 1500 ;

}

public void setNome(String nome){

this.nome = nome;

}

public void setApellido1(String apelido1){

    this.apelido1 = apelido1;
}

public void setApellido2(String apelido2){

    this.apelido2 = apelido2;
}
public void setDni(String dni){

    this.dni = dni;
}
public void setSalario(int salario){

    this.salario = salario;
}
public String getNome(){

    return nome;
}
public String getApellido1(){

    return apelido1;
    
}
public String getApellido2(){

    return apelido2;
}
    public String getDni(){

    return dni;
    
}
public int getSalario(){

    return salario;
}
}