package UD3_3b.Exercicio1;

public class AppEmpregado {

public static void main(String[] args) {

    Empregado empregado1 = new Empregado("manolo", 5);
    Empregado empregado2 = new Empregado("juan", 10);

    empregado1.setPorcentaxe(10.0);
    empregado2.setPorcentaxe(20.0);

    Double res1 = Empregado.subidaPorcentual(empregado1);

    System.out.println("salrio cun subida % de " + empregado1.getPorcentaxe() + " " + res1);

    Double res2 = Empregado.subidaPorcentual(empregado2);

    System.out.println("salrio cun subida % de " + empregado2.getPorcentaxe() + " " + res2);

    Double resAnt1 =empregado1.salarioConAntiguedade();

    System.out.println(" con antiguedade cobra " + resAnt1);

    Double resAnt2 =empregado2.salarioConAntiguedade();

    System.out.println(" con antiguedade cobra " + resAnt2);


        
    }
    
}
