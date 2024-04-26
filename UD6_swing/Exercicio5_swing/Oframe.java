package Exercicio5_swing;

import java.awt.event.*;

import javax.swing.*;

/**
 *Fai un programa que nun frame mostre no título unha mensaxe cando se preme unha tecla co frame como ventá activa, 
 e outro diferente cando o rato entra no espacio da ventá. A túas clases Listener deberán ser subclases de WindowAdapter, 
 de KeyAdapter e de MouseAdapter. Oframe
 */
public class Oframe extends JFrame{

    public Oframe (){

        setTitle("Oframe");
        setSize(300, 250);
        addWindowListener(new OListener());
        addMouseListener(new MouseListener());
        addKeyListener( new KeyListener());
    }

public class OListener extends WindowAdapter{

    public void windowActivated(WindowEvent e){
     
        setTitle("a ventá está activa");   
    }

}
public class  MouseListener extends MouseAdapter {
    public void mouseEntered(MouseEvent a){
        setTitle("o rato esta presente");
    }
}

public class KeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent i){
        setTitle("tecla presionada");
    }   
}
    
}


    
