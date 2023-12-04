/*Crea agora outra clase AppTraballador na que definas 3
condutores e 2 electricistas. Modifica un condutor para que teña os valores 11111111A,
“Carlos”,”Lopes”, e outro electricista para que se chame “Ana”,”Sánchez”, con DNI 44332211H. Lista
os valores de todos os traballadores. Fíxate que o atributo numTraballadores debe valer 5 para
todos */
package UD3_6_Herdanza.Exercicio2;

public class AppTraballador {
public static void main(String[] args) {
    
    Conductor cond1 = new Conductor();
    Conductor cond2 = new Conductor("78546314p", "antonio", "garcia", "gomez", "4578-klñ");
    Conductor cond3 = new Conductor("11111111A", "ana", "sanchez", "sanchez", "1111-AAA");

    cond1.setNome("manolo");
    cond1.setApelido1("rodriguez");
    cond1.setApelido2("rodrigo");
    
    System.out.println(cond1.getNome() + " " + cond1.getApelido1() + " " + cond1.getApelido2() + " ten o dni num " + cond1.getDni() + " e a matricula num " + cond1.getMatricula());
    System.out.println(cond2.getNome() + " " + cond2.getApelido1() + " " + cond2.getApelido2() + " ten o dni num " + cond2.getDni() + " e a matricula num " + cond2.getMatricula());
    System.out.println(cond3.getNome() + " " + cond3.getApelido1() + " " + cond3.getApelido2() + " ten o dni num " + cond3.getDni() + " e a matricula num " + cond3.getMatricula());    


    Electricista elec1 = new Electricista();
    Electricista elec2 = new Electricista("45781214L", "carlos", "lopez", "lopez", false);

    System.out.println(elec1.getNome() + " " + elec1.getApelido1() + " " + elec1.getApelido2() + " ten o dni num " + elec1.getDni() + " e ten un contrato " + elec1.getContrato());
    System.out.println(elec2.getNome() + " " + elec2.getApelido1() + " " + elec2.getApelido2() + " ten o dni num " + elec2.getDni() + " e ten un contrato " + elec2.getContrato());

    // como e un metodo statico temos que chamalo usando a clase Traballador, e decir: Traballador.getNumTraballador()
    
    System.out.println("hai un total de " + Traballador.getNumTraballador() + " traballadores");



}
}
