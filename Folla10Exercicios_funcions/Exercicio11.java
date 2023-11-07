/*11. Programa que devolva o maior de 3 números enteiros */

package Folla10Exercicios_funcions;
import java.util.Scanner;
public class Exercicio11 {

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

    
    if (i > j && i >l){
        maior = i;
        return i;
    }
    if (j > l && j >maior){

        maior = j;
        return j;
    }else{

        return l;
    }
    }
}
    
    

