package UD3.obxectos.Exercicio5;

public class AppEmpregado {
public static void main(String[] args) {
    

    Empregado julio = new Empregado();
    Empregado antonio = new Empregado();


    julio.setNome("julian");
    julio.setApellido1("gonzalez");
    julio.setApellido2("señaris");
    julio.setDni("98432102P");
    julio.setSalario(2500);

    System.out.println(julio.getNome() + " " + " " + julio.getApellido1() + " " + julio.getApellido2() + " co dni " + julio.getDni() + " cobra " + julio.getSalario());
        
    
}    
}
