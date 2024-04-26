package Exercicio7_swing;

import java.awt.event.*;
import javax.swing.*;

/**
 * Como ves non é preciso que o rato estea dentro da ventá para que se executen os eventos de teclado. Fai un programa que para 
 * un frame altere o seu tamaño cando se pulse unha tecla, cambiando o tamaño entre 300 x 200 e 500 x 300, só cando o rato estea 
 * dentro da ventá. Podes empregar un atributo booleano “ratoDentro” que vale true ou false dependendo se o rato está dentro da ventá, 
 * empregando ese valor no Listener do evento das teclas.
 */
public class Oframe extends JFrame{ 
    public int width = 300;
    public int height = 250;
    public int cont;
    boolean ratoDentro = false;

    public Oframe (){
        setTitle("tamaño modificable");
        setSize(width, height);
        addWindowListener(new OListener());
        addMouseListener(new RatoListener());
        addKeyListener(new TecladoListener());
  } 

public class OListener extends WindowAdapter{

  public void windowActivated(WindowEvent e){
    System.out.println("frame activo");
    }
}

public class  RatoListener extends MouseAdapter {
  public void mouseEntered(MouseEvent e){
      setTitle("o rato esta presente");
      ratoDentro = true;
  }
  public void mouseExited(MouseEvent e){
    setTitle("saindo rato...");
    ratoDentro = false;
  }
}

public class TecladoListener extends KeyAdapter {
  public void keyPressed(KeyEvent e){
      setTitle("a tecla mantense premida");
      if (ratoDentro == true){
        setSize(500, 300);
      }else{
        setSize(300, 250);
      }
  }
  
}
}
