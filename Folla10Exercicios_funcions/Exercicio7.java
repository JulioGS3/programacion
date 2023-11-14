/*7. Escribe un programa que devolve o máximo de dous enteiros. */

package Folla10Exercicios_funcions;
import java.util.Scanner;
import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    int max = 0;

    System.out.println("mete 3 numeros");
    
    int num1 = entrada.nextInt();
    int num2 = entrada.nextInt();
    int num3 = entrada.nextInt();

    max = maximo(num1, num2, num3);

    System.out.println("o maximo e " + max);
}

public static int maximo(int i , int j, int l){

    int maior = 0;

    if (i > j && i > l){

        maior = i;
        
    }
    if (j > maior){
        
        maior = j;
    }
    if(l > maior){

        maior = l;
    }
    return maior;
}
}
    



