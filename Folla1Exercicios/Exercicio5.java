//Programa que calcule o resto enteiro de 2 números. Podes empregar o operador resto (%), que
//dá o resto da división de dous enteiro. Exemplo:
//resto = dividendo % divisor;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);

    System.out.println("introducen o dividendo ");
    int enteiro1= entrada.nextInt();
        
    System.out.println("introducen o divisor ");
    int enteiro2= entrada.nextInt();

    int resto= enteiro1%enteiro2;
    System.out.println("o resto é "+resto);
        
    }
}
    
