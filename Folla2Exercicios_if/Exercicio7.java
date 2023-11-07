package Folla2Exercicios_if;
/*7. Fai o mesmo para un bebé nacido neste ano. Deberás mostrar cantos meses e cantos días ten. */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner ent= new Scanner(System.in);

        System.out.println("introduce o mes e o dia de nacemento ");
        int mes= ent.nextInt();
        int dia= ent.nextInt();
        int meses= 9-mes;
        int dias= 19-dia;
        if((mes<=9 && dia<=19)){
            
            System.out.println("ten "+meses+" meses e "+dias+ " día");
        }
        if((mes<=9 && dia>19)){
            meses=meses-1;
            dias= 31-(dia-19);
            System.out.println("ten "+meses+" meses e "+ dias+ " dias");
        }
        
        
        




    }
    
}
