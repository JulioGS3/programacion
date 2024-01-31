package UD4_3_interfaces_2.Exercicio1;
/**
 * Crea agora unha clase AppPersoeiros, cun array de 4 Persoas. Introduce 2 Empregados e 2
Alumnos no array (notar que o array é válido, pois os Empregados e Estudantes son Persoas),
con todos os seus atributos completos. Fai un bucle foreach para mostrar cada elemento do array,
empregando os métodos dameNome( ), e dameDescricion( ).
Debes apreciar que dameDescricion( ) mostra os valores correctos de cada obxecto. Isto é un
exemplo do polimorfismo (o método ten diferente comportamentos dependendo o tipo do obxecto
desde o que é chamado
 */
public class AppPersoeiros {

public static void main(String[] args) {
    
    Persona [] arrayPersonas = new Persona[4];

    arrayPersonas [0] = new Empregado("juna", "garcia perez", 22, 15000);
    arrayPersonas [1] = new Empregado("manolo", "perez burrull", 33, 20000);
    arrayPersonas [2] = new Estudante("oscar", "campelo", 20, "dereito");
    arrayPersonas [3] = new Estudante("sonia", "lamela", 40, "enfermeria");

    for (Persona persona : arrayPersonas) {

        System.out.println(persona.dameNome() + " " + persona.dameDescricion());
        
    }



}    

}