package UD6_3_Menu.Exercicio3;


import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
/**
 *Fai un programa semellante ao exercicio anterior, pero que ademáis teña un botón que faga que a etiqueta 
 cambie a cor do fondo da etiqueta entre azul, verde, vermello e branco, sucesivamente: engade un menú Cor 
que teñan como submenús Azul, Verde, Vermello e Branco que farán que cambie tamén a cor á cor elixida. Para 
cambiar a cor dun compoñente poderías empregar o método setForeground(new Color(100,100,255)); pasándolle os 
valores RGB (Red, Green,Blue). Menu
 */
public class Menu extends JFrame{

     JPanel panel = new JPanel();
    JMenu menuFicheiro = new JMenu("Ficheiro");
    JMenu menuTamaño = new JMenu("Tamaño");
    JMenuBar barraMenus = new JMenuBar();
    JMenuItem sair = new JMenuItem("Sair");
    JMenuItem minimizar = new JMenuItem("Minimizar");
    JMenuItem maximizar = new JMenuItem("Maximizar");
    JMenuItem normal = new JMenuItem("normal");
    JLabel etiqueta = new JLabel("x");
    JButton botonColor = new JButton("Color");
    
    public Menu (){

        caracteristicasMenus();
        engadirEscoitadores();
        colocaObxetos();
    }

    public void caracteristicasMenus (){
        botonColor.setBounds(300, 100, 200, 50);
        etiqueta.setBounds(300, 300, 600, 300);
    }

    public void colocaObxetos(){

        getContentPane().add(panel);
        menuFicheiro.add(sair);
        menuTamaño.add(maximizar);
        menuTamaño.add(minimizar);
        menuTamaño.add(normal);
        barraMenus.add(menuFicheiro);
        barraMenus.add(menuTamaño);
        setJMenuBar(barraMenus);
        panel.add(etiqueta);
        panel.add(botonColor);
    }
   
    public void engadirEscoitadores (){
        sair.addActionListener(new SubmenuSair());
        minimizar.addActionListener(new BotonMinimizar());
        maximizar.addActionListener(new BotonMaximizar());
        normal.addActionListener(new BotonNormal());
    }
    private class SubmenuSair implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    private class BotonMinimizar implements ActionListener {
        public void actionPerformed(ActionEvent e){
            setExtendedState(Frame.ICONIFIED);
            etiqueta.setText("minimizado");
            
        }
    }
    private class BotonMaximizar implements ActionListener {
        public void actionPerformed(ActionEvent e){
        setExtendedState(Frame.MAXIMIZED_BOTH);
        etiqueta.setText("maximizado");
        }
    }
    private class BotonNormal implements ActionListener {
        public void actionPerformed(ActionEvent e){
            setExtendedState(Frame.NORMAL);
            etiqueta.setText("normal");
        }
        
    }
    }

