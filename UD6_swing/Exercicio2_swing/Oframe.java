package Exercicio2_swing;

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
                    if (cont == 1){
                    setTitle("Mininimizada unha vez" );
                    }
                    if (cont == 2){
                    setTitle("Mininimizada duas veces" );
                    }
                    if (cont == 3){
                    setTitle("Mininimizada tres veces" );
                    }
                    if (cont == 4){
                    setTitle("Mininimizada catro veces" );
                    }
                    if (cont == 5){
                    setTitle("Mininimizada cinco veces" );
                    }
                    if (cont == 6){
                    setTitle("Mininimizada seis veces" );
                    }
                    if (cont == 7){
                    setTitle("Mininimizada sete veces" );
                    }
                    if (cont == 8){
                    setTitle("Mininimizada oito veces" );
                    }
                    if (cont == 9){
                    setTitle("Mininimizada nove veces" );
                    }
                    if (cont == 10){
                    setTitle("Mininimizada dez veces" );
                    }
                    if (cont == 11) {
                        System.out.println("fin");
                        System.exit(0);
                    }

            }
        }
    }
