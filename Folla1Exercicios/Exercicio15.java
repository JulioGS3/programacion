/*15. Pedir un número enteiro por pantalla e mostrar se é múltiplo de 3. */

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
    
    Scanner ent =new Scanner(System.in);
System.out.println("introduce un número enteiro ");
    int numero = ent.nextInt();

    if(numero%3==0){
        System.out.println("é multiplo de 3");
    }else{
        System.out.println("non é multiplo de 3");
    }
}    
}
