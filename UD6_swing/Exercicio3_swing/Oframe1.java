package Exercicio3_swing;

import java.awt.event.*;
import javax.swing.*;

/**
 *Fai un programa que abra 2 JFrames de 300 x 250, de título “Tamaño modificable”. A túa clase deberá implementar a interface WindowListener. 
 Os 2 frames deberán modificar o seu tamaño cada vez que son activadas, incrementando en 50 pixels tanto o alto como o ancho. O tamaño máximo 
 será 700 x 650. Cando se chegue ao tamaño máximo non modificarán máis o tamaño, mostrando no seu título unha mensaxe de que xa non o modifican. 
 Oframe1
 */
public class Oframe1 extends JFrame{ 
    public int width = 300;
    public int height = 250;
    public int incremento = 50;

    public Oframe1 (){

        setTitle("tamaño modificable");
        setSize(width, height);
        addWindowListener(new OListener());
  } 


public class OListener implements WindowListener{

    public void windowClosing(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){
      System.out.println("frame activo");
      setSize(width+=incremento, height+=incremento);
      if (width == 700 && height == 650){
        setTitle("non se modifica mais");
        try{
        Thread.sleep(2000);
        }catch(Exception a){
          System.out.println(e);
        }
        System.exit(0);
      }
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
}
} 
