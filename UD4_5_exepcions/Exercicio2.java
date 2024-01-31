/*Queremos calcular o factorial dun número pero asegurándonos que o usuario introduce un enteiro por teclado. Ata que non introduza un enteiro 
pedirémoslle de novo o número. Faino primeiro coa clase Scanner e logo co JOptionPane. Investiga InputMismatchException e NumberFormatException, 
para cada un dos casos. */
package UD4_5_exepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio2 {

public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int resultado=1;
    int resultadoDos=1;
   
    int flagJO=0;
    int flagSca=0;

    do{
        
    
    try{

    System.out.println("introduce un numero");
    int numero = entrada.nextInt();

        for (int i=1; i<=numero; i++){

            resultado = resultado*i;
            System.out.println(resultado);
        }

    }catch(InputMismatchException excepcionDeTipo){
        System.out.println("non se pode introducir ese tipo de dato");
        flagSca = 1;
    }
    
        System.out.println("continua");

    try{    
        String dialogo = JOptionPane.showInputDialog("introduce un numero enteiro");
        int numeroDos=Integer.parseInt(dialogo);
            
            for (int a=1; a<=numeroDos; a++){
                resultadoDos = resultadoDos*a;
                System.out.println(resultadoDos);
            }
        }catch(NumberFormatException excepcionConversionTipo){
            System.out.println("non se pode convertir a enteiro ese dato, volve probar");
            flagJO = 2;
        }
        System.out.println("continua");    
    
    }while (flagJO == 2 || flagSca == 1 );
        
    System.out.println("adios");
}
}
