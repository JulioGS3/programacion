//Dado un nº de segundos total, mostra cántas horas, minutos e segundos son. Ex: 3700 segs son
//1 hora, 1 minuto e 40 segs.

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[] args) {
    

    Scanner entrada= new Scanner(System.in);
    System.out.println("introduce o número de segundos ");
    int segundos= entrada.nextInt();

    int hora= 3600;
    int minuto=60;
    int resultadoHoras= segundos/hora;
    int sobraHoras=segundos%hora;
    int resultadoMinutos= sobraHoras/minuto;
    int segundosrestantes= sobraHoras%minuto;

    System.out.println(segundos +" segundos son "+ resultadoHoras + " horas "+ resultadoMinutos+" minutos "+ segundosrestantes+ " segundos ");

}
    
}