// 2. Calcula a área dun círculo, pedindo o radio por teclado

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce o radio ");
    int radio = entrada.nextInt();
    double pi = 3.14;
    double resultado = (pi* radio);
    double area = resultado*resultado;
    
System.out.println(area);






    
    }
}