import java.util.Scanner;

public class PideVariables {
public static void main(String[] args) {

   System.out.println("ola, introduce un número ");
   Scanner escaner= new Scanner(System.in);
    int numero= escaner.nextInt();
    System.out.println("o numero que elexiches foi "+numero);

    int dobleDoNumero = numero * 2;
    System.out.println(" o doble do numero vale "+dobleDoNumero);

}
}