package UD4_3_interfaces_2.Exercicio2;

import java.lang.reflect.Array;
import java.util.Arrays;

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
    
    Estudante [] arrayPersonas = new Estudante[4];

    arrayPersonas [0] = new Estudante("juna", "garcia perez", 22, "dam");
    arrayPersonas [1] = new Estudante("manolo", "perez burrull", 33, "daw");
    arrayPersonas [2] = new Estudante("oscar", "campelo", 20, "dereito");
    arrayPersonas [3] = new Estudante("sonia", "lamela", 40, "enfermeria");

    
    if (arrayPersonas[0].compareTo(arrayPersonas[1]) < 0 ){

        System.out.println(arrayPersonas[0].dameNome() + " e menor que " + arrayPersonas[1].dameNome());

    }

    Arrays.sort(arrayPersonas);

    for (Estudante estudante : arrayPersonas) {

        System.out.println(estudante.dameNome() + " " + estudante.dameidade());
        
    }



}    

}