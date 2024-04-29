package UD6_2_Botons.Exercicio2;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.*;

/**
 * Fai un programa con unha ventá na que se mostran 2 botóns, un que poña “Pechar” e outro “Minimízame”. 
 * Cando se pulse “Pechar” a ventá debe pecharse. Cando “Minimízame” debe minimizarse. (Mira a axuda do método 
 * setExtendedState() de JFrame, herdado de Frame)
 */
public class Oframe  extends JFrame{

    JPanel oPanel = new JPanel();
    JButton botonPechar = new JButton("Pechar");
    JButton botonMinimizar = new JButton("Minimizar");
    JLabel etiqueta = new JLabel("etiqueta");
   
    public Oframe (){

        caracteristicasBotons();
        colocarObxetos();
        engadirEscoitadores();
    }
    
    public void caracteristicasBotons (){
        botonPechar.setBounds(50, 100, 150 , 50);
        botonMinimizar.setBounds(300, 100, 150, 50);
        etiqueta.setBounds(250, 200, 150, 100);
        oPanel.setLayout(null);
    }
    public void colocarObxetos(){
        oPanel.add(botonPechar);
        oPanel.add(botonMinimizar);
        oPanel.add(etiqueta);
        getContentPane().add(oPanel);

    }
    public void engadirEscoitadores(){

        botonPechar.addActionListener(new BotonPechaListener());
        botonMinimizar.addActionListener(new BotonMinimizaListener());
        
    }

public class BotonPechaListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
public class BotonMinimizaListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JFrame.setExtendedState();
        }
}
public class VentaListener extends WindowAdapter{
    public void windowDeiconified(WindowEvent e) {
        System.out.println("minimizar");
    }
}
}