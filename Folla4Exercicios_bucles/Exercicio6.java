/*6. Calcula canto vale o sumatorio 1/1+1/3+1/5+1/7+1/9+ ..., con 40 sumandos (pensa que NON podes
facer a división entre enteiros). */

package Folla4Exercicios_bucles;

public class Exercicio6 {
public static void main(String[] args) {
        
double suma=0;

for (double divisor=1; divisor<=40; divisor= divisor+2 ){
suma = suma+(1/divisor);

}
System.out.println(suma);
    }
}
