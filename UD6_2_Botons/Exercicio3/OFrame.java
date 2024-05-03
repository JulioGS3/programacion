package UD6_2_Botons.Exercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UD6_2_Botons.Exercicio1.Boton;

/**
 *Programa que xera números enteiros aleatorios entre 0 e 100. Para xerar un número aleatorio podes empregar o 
 método java.lang.Math.random( ), que devolve un double entre 0.0 e 1.0. Pon un botón que ao ser premido produza 
 o número aleatorio que se debe mostrar nunha etiqueta. Terás que empregar na etiqueta o método setText(oStringQueSexa). OFrame
 */
public class OFrame extends JFrame{

    public String nome = "etiqueta";    
    JLabel etiqueta = new JLabel(nome);
    JButton boton = new JButton("Aleatorio");
    JPanel panel = new JPanel();
    
public OFrame (){
    caracteristicasBotons();
    colocaObxetos();
    engadirEscoitadores();
}

public void caracteristicasBotons (){
    boton.setBounds(200, 100, 150, 50);
    etiqueta.setBounds(250, 200, 150, 100);
    panel.setLayout(null);
}

public void colocaObxetos (){
    panel.add(boton);
    panel.add(etiqueta);
    getContentPane().add(panel);
}

public void engadirEscoitadores (){
    boton.addActionListener(new BotonRandomListener());
}

public class BotonRandomListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        int aleatorio = (int)(Math.random()*100)+1;
        nome = Integer.toString(aleatorio);
        etiqueta.setText(nome);
    
    }
}
}