package UD4_6_excepcions.Exercicio3;

import javax.swing.JOptionPane;

/**
 * App_coche
 */
public class App_coche {

    public static void main(String[] args){
        

    Coche [] arrayCoches = new Coche[4];
    String opcion = "";
    int contador = 0;
    do{

        opcion = JOptionPane.showInputDialog(" a ) Introducir un vehículo: matrícula, prezo e modelo \n O prezo debe estar entre 10000 e 100000 \n    O modelo ten que empezar pola marca, e só vendemos Tesla e Toyota \n    A matrícula debe axustarse á normal actual: 4 números, e 3 letras sen vocais. \n b) Mostrar vehículos \n c) Saír");

        switch (opcion) {
            case "a":
                try{
                String matricula;
                String modelo; 
                String prezo = JOptionPane.showInputDialog("introduce o prezo");
                int prezoEnteiro = Integer.parseInt(prezo);
            
                Coche coche  = new Coche(matricula= JOptionPane.showInputDialog("introduce a matricula"), prezoEnteiro, modelo= JOptionPane.showInputDialog("introduce o modelo"));
                arrayCoches [contador]= coche;
                contador++;
                }catch(ExcepcionCoche e) {
                    System.out.println(e.getMessage());
                }
                break;
        
            case "b":
            for (Coche coche : arrayCoches) {
                JOptionPane.showMessageDialog(null, coche);
            }
                break;
        }


    }while(!opcion.equals("c"));
    }

}