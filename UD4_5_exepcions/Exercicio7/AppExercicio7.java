/*Empregando as clases do exercicio anterior, define unha clase AppExercicio7 que defina un array de 3 ordenadores. 
A continuación se pedirán os valores por teclado para eses 3 ordenadores con JOptionPane. O programa deberá controlar todas as excepcións posibles
 de entrada de datos, de modo que se un ordenador non se pode montar non se engadirá ao array. 
As restriccións do exercicio anterior tamén deben impedir engadir un ordenador ao array. Cada vez que se lance unha excepción 
deberá saír por consola unha descrición da mesma.Unha vez introducidos valores correctos para os 3 ordenadores, o programa mostrará 
as características deses 3 ordenadores. */
package UD4_5_exepcions.Exercicio7;

import javax.swing.JOptionPane;

public class AppExercicio7 {
public static void main(String[] args) {
    boolean repetir = false;
    int cont = 0;
    String numSerie = "";
    String capacidade =""; 
    int capacidad = 0;

    String tipoMemoria = "";
    String velocidadeMemoria =""; 
    int velocidadMemoria = 0;
    String discoCapacidade = "";
    Double capacidadeDisco = 0.0; 
    String discoTipo = "";
    String discoVelocidade =""; 
    int velocidadeDisco = 0;

    String procesadorModelo = "";
    String procesadorVelocidade = "";
    Double velocidadeProcesador = 0.0; 

    String prezo = "";
    int precio = 0;
           

    Ordenador [] arryOrdenadores = new Ordenador[4];

    for (int i = 0; i < arryOrdenadores.length; i++) {

    do{
    try{
            numSerie = JOptionPane.showInputDialog("introduce o numero de serie");
            capacidade = JOptionPane.showInputDialog("introduce a capacidade de memoria");
            capacidad = Integer.parseInt(capacidade);

            tipoMemoria = JOptionPane.showInputDialog("tipo de memoria");
            velocidadeMemoria = JOptionPane.showInputDialog("velocidade da memoria");
            velocidadMemoria = Integer.parseInt(velocidadeMemoria);

            discoCapacidade = JOptionPane.showInputDialog("capaciade do disco");
            capacidadeDisco = Double.parseDouble(discoCapacidade);
            discoTipo = JOptionPane.showInputDialog("tipo de disco");
            discoVelocidade = JOptionPane.showInputDialog("velocidade do disco");
            velocidadeDisco = Integer.parseInt(discoVelocidade);

            procesadorModelo = JOptionPane.showInputDialog("modelo do procesador");
            procesadorVelocidade = JOptionPane.showInputDialog("velocidade do procesador");
            velocidadeProcesador = Double.parseDouble(procesadorVelocidade);

            prezo = JOptionPane.showInputDialog("prezo");
            precio = Integer.parseInt(prezo);
           
    }catch(Exception ex){
        
        System.out.println("erro en algun dato");
        repetir = true;
    }
    try{      

    Ordenador novo = new Ordenador(numSerie, capacidad, tipoMemoria, velocidadMemoria, capacidadeDisco, discoTipo, velocidadeDisco, procesadorModelo, velocidadeProcesador, precio);    
       
            arryOrdenadores [i] = novo;
            
        }
    catch(Exception b){
            System.out.println("erro");
            repetir = true;

        }
    }while (repetir == true); 
            
    }

    for (Ordenador ordenador : arryOrdenadores) {
        System.out.println(ordenador.toString());
    }
    }
    }

    

