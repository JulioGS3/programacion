package UD4_6_excepcions.Exercicio1;

import javax.swing.JOptionPane;

public class AppDni {
public static void main(String[] args) throws DniExcepcion {
    
    String dni = "";
    DNI [] arrayDni = new DNI[3];
    boolean repetir = false;

    for (int i = 0; i < arrayDni.length; i++) {
        
    do{
        repetir = false;
    try{

        dni = JOptionPane.showInputDialog("introduce un dni");
        DNI novo = new DNI(dni);
        arrayDni[i] = novo;
    }
    catch(DniExcepcion e){
        System.out.println(e.getMessage());
        repetir = true;
    }
}while( repetir == true);
    }
    for (DNI dni2 : arrayDni) {
        System.out.println("dni numero " + dni2.getDni());
}
}
}
    
