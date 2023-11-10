/*3. Crea unha clase chamada NumeroDouble, que conteña como atributo valor un double. Crea 2 construtores, un sen
argumentos que asigne o valor a 0.0, e outro con un argumento double que garde no atributo valor dese argumento. Crea
noutra clase AppNumeroDouble 4 obxectos da clase empregando 2 veces cada un dos construtores. Comproba que os
obxectos van tomando eses valores mostrándoos por pantalla. */

package UD3.obxectos.Exercicio3;

public class NumeroDouble {
    
    public Double valor;

    public  NumeroDouble ( ){

        valor = 0.0;
    }

    public NumeroDouble ( double valor){

        this.valor = valor;

    }


}