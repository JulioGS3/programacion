package UD6_3_Menu.Exercicio2;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *Fai un programa con unha ventá con unha etiqueta na que se mostre o estado da ventá (maximizada, normal). 
 Engade dous menús, un que se chame Ficheiro, con un submenú Saír como no exercicio anterior, e outro menú 
 que se chame Tamaño, con submenús Minimizar, Maximizar, Normal. Os submenús deberán facer esas accións cando 
 sexan seleccionados. (Podes empregar o método setExtendedState() de JFrame, herdado de Frame) Menu
 */
public class Menu extends JFrame {

    JPanel panel = new JPanel();
    JMenu menuFicheiro = new JMenu("Ficheiro");
    JMenu menuTamaño = new JMenu("Tamaño");
    JMenuBar barraMenus = new JMenuBar();
    JMenuItem sair = new JMenuItem("Sair");
    JMenuItem minimizar = new JMenuItem("Minimizar");
    JMenuItem maximizar = new JMenuItem("Maximizar");
    JMenuItem normal = new JMenuItem("normal");
    JLabel etiqueta = new JLabel("x");
    
    public Menu (){

        caracteristicasMenus();
        engadirEscoitadores();
        colocaObxetos();
    }

    public void caracteristicasMenus (){
        
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
