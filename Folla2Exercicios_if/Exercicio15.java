/*15. Fai un programa que calcule cantas horas e minutos reais tes cada semana de cada módulo de
do ciclo, e o mostre por pantalla o resultado. */

package Folla2Exercicios_if;

public class Exercicio15 {
public static void main(String[] args) {
        
    int duracion=50;

    // minutos totales

    int prog=7*duracion;
    int bd=7*duracion;
    int cd=4*duracion;
    int lm=5*duracion;
    int si=7*duracion;
    int fol=4*duracion;
    int ing=2*duracion;
    
    int horasProg=prog/60;
    int horasBd=bd/60;
    int horasCd=cd/60;
    int horasLm=lm/60;
    int horasSi=si/60;
    int horasFol=fol/60;
    int horasIng=ing/60;

    int minProg=prog%60;
    int minBd=bd%60;
    int minCd=cd%60;
    int minLm=lm%60;
    int minSi=si%60;
    int minFol=fol%60;
    int minIng=ing%60;


    System.out.println("tes "+ horasProg+ " horas e "+minProg+ " minutos do modulo de programación");
    System.out.println("tes "+ horasBd+ " horas e "+minBd+ " minutos do modulo de Bases de datos");
    System.out.println("tes "+ horasCd+ " horas e "+minCd+ " minutos do modulo de contorno de desemvolvemento");
    System.out.println("tes "+ horasLm+ " horas e "+minLm+ " minutos do modulo de linguaxe de marcas");    
    System.out.println("tes "+ horasSi+ " horas e "+minSi+ " minutos do modulo de sistemas");
    System.out.println("tes "+ horasFol+ " horas e "+minFol+ " minutos do modulo de fol");
    System.out.println("tes "+ horasIng+ " horas e "+minIng+ " minutos do modulo de inglés");
}
}