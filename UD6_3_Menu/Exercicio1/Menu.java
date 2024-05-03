package UD6_3_Menu.Exercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * Menu
 */
public class Menu extends JFrame{

    JPanel panel = new JPanel();
    JButton boton = new JButton("Sair");
    JMenuBar barraMenus = new JMenuBar();
    JMenu menu = new JMenu("Ficheiro");
    JMenuItem subMenu = new JMenuItem("Sair");
    
public Menu (){
    caracteristicasBotons();
    colocaObxetos();
    engadirEscoitadores();
}

public void caracteristicasBotons (){

    getContentPane().add(panel);
    boton.setBounds(300,100,150,50);
    menu.add(subMenu);
    barraMenus.add(menu);
    setJMenuBar(barraMenus);
    setSize(300, 300);   
}
public void colocaObxetos(){

}
public void engadirEscoitadores(){
    subMenu.addActionListener(new EscoitadorMenu());
    
}
private class EscoitadorMenu implements ActionListener{
    public void actionPerformed(ActionEvent e){

    }
    
}
}
