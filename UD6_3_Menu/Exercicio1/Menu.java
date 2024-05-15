/*Fai un programa que mostre unha ventá con un botón que poña “Sair”, que saia cando se pulse. 
A ventá deberá ter unh menú Ficheiro con un submenú “Sair” que tamén peche a ventá cando se pulse */
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

    boton.setBounds(500,500,150,50);
    menu.add(subMenu);
    barraMenus.add(menu);
    setJMenuBar(barraMenus);
    setSize(300, 300);
    getContentPane().add(panel);   
}
public void colocaObxetos(){
    panel.add(boton);
  
}
public void engadirEscoitadores(){
    subMenu.addActionListener(new EscoitadorMenu());
    boton.addActionListener(new EscoitadorMenu());
}
private class EscoitadorMenu implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }

}
}
