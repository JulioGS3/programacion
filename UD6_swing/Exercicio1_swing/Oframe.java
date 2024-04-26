
package Exercicio1_swing;

import javax.swing.*;
import java.awt.event.*;
class Oframe extends JFrame {

    public int cont;

    public Oframe(){
        cont = 0;   
        setTitle("o frame!!!");
        setSize(300,200);
        addWindowListener(new OListener());
    }

    private class OListener extends WindowAdapter{
            public void windowDeiconified(WindowEvent e){
                cont++;
                setTitle("Mninimizada " + cont + " veces" );
            }
         
    }
}