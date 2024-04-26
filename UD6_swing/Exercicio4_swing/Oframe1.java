package Exercicio4_swing;

import java.awt.event.*;
import javax.swing.*;

/**
 *Modifica o exercicio anterior para que as ventás modifiquen o tamaño cada dúas veces que son activadas. Cando cheguen a 700 x 650, 
 reduciran o tamaño en 50 pixels tanto para o ancho como para o alto, Só ata o seu tamaño orixinal de 300 x 250. Despois deberán volver 
 incrementar o seu tamaño, tamén cada dúas veces.
 */
public class Oframe1 extends JFrame{ 
    public int width = 300;
    public int height = 250;
    public int incremento = 50;
    public int cont;
    boolean incrementando = true;

    public Oframe1 (){
        cont = 1;
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
      
      if (cont % 2 == 0 && incrementando == true){
        setSize(width+=incremento, height+=incremento);
      
        if (width == 700 && height == 650 ){
          incrementando = false;
        }
      }
      if(cont % 2 == 0 && incrementando == false){
          setSize(width-=incremento, height-=incremento);
          if (width == 300 && height == 250 ){
            incrementando = true;
          }
      }
        System.out.println("non se toca");
        cont++;
      }
  
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
}
}
