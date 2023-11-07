/*17. Facer a división de 2 números enteiros, amosando unha mensaxe de erro se o divisor é 0 (non
podemos facer a división por 0). */

import java.util.Scanner;

public class Exercicio17 {
public static void main(String[] args) {

    Scanner ent= new Scanner(System.in);

    System.out.println("inserta o dividendo ");
    int dividendo= ent.nextInt();
    System.out.println("inserta o divisor");
    int divisor= ent.nextInt();
  

    if(divisor==0){
        System.out.println("error");
    }else{
        int resultado= dividendo/divisor;
        System.out.println("o resultado e "+resultado);
    }
}    
}
