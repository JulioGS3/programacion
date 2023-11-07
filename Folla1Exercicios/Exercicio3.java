import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("introduce o primeiro número ");
    int numero1 = entrada.nextInt();
    System.out.println("introduce o segundo número ");
    int numero2 = entrada.nextInt();
    System.out.println("introduce o terceiro número ");
    int numero3 = entrada.nextInt();

    int resultado = numero1 + numero2 + numero3;
    System.out.println(" o resultado é "+resultado);


}
    
}