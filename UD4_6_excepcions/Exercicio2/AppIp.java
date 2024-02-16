package UD4_6_excepcions.Exercicio2;

import javax.swing.JOptionPane;

/**
 * AppIp
 */
public class AppIp {
    public static void main(String[] args)  {
        


        String ip = JOptionPane.showInputDialog("introduce a ip");

        try{

        ip novaip = new ip(ip);
        System.out.println(novaip);

        }catch(ipExepcion e){
            System.out.println(e.getMessage());
        }

    }
}