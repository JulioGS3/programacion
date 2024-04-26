package Exercicio6_swing;

import java.awt.event.*;

import javax.swing.*;

/**
 *Fai un programa que nun frame mostre no título unha mensaxe cando se preme unha tecla co frame como ventá activa, 
 e outro diferente cando o rato entra no espacio da ventá. A túas clases Listener deberán ser subclases de WindowAdapter, 
 de KeyAdapter e de MouseAdapter. Oframe
 Modifica o exercicio anterior para que a mensaxe sexa distinta cando se mantén pulsada e cando se libere a tecla.
 */
public class Oframe extends JFrame{

    public Oframe (){

        setTitle("Oframe");
        setSize(300, 250);
        addWindowListener(new OListener());
        addMouseListener(new RatoListener());
        addKeyListener( new TecladoListener());
    }

public class OListener extends WindowAdapter{

    public void windowActivated(WindowEvent e){
     
        setTitle("a ventá está activa");   
    }

}
public class  RatoListener extends MouseAdapter {
    public void mouseEntered(MouseEvent e){
        setTitle("o rato esta presente");
    }
}

public class TecladoListener extends KeyAdapter {
    
    public void keyPressed(KeyEvent e){
        setTitle("a tecla mantense premida");
    }
    public void keyReleased(KeyEvent e){
        setTitle("a tecla despremiuse");
    }   
}
    
}


    
