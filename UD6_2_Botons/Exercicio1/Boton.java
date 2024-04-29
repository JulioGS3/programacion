package UD6_2_Botons.Exercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.file.WatchEvent;

import javax.swing.*;

/**
 * Fai un programa con 2 botóns: un “Medra” e outro “Reduce” que aumenten o 
 * tamaño da ventá en 50 x 50 pixels, ou a reduza na mesma variación. Oframe
 */
public class Boton extends JFrame{

    //atributos
    int ancho = 600;
    int alto = 500;
    int incre = 50;
    JButton oBotonMedra = new JButton("Medra");
    JButton oBotonReduce = new JButton("Reduce");
    JPanel oPanel = new JPanel();
    JLabel aEtiqueta = new JLabel("");

    // constructor

    public Boton() {

        defineCaracteristicasObxectos ( );
        colocaObxetos( );
        addEscoitadoresObxectos( );      
    }

    public void defineCaracteristicasObxectos (){
        oBotonMedra.setBounds(50, 100, 150, 40); //damoslle dimensions o boton
        oBotonReduce.setBounds(300, 100, 150, 40);
        aEtiqueta.setBounds(300, 200, 150, 40); //dimension etiqueta
        oPanel.setLayout(null); //esto e para colocalo
    }
    public void colocaObxetos (){
        oPanel.add(oBotonMedra);
        oPanel.add(oBotonReduce);
        oPanel.add(aEtiqueta);
        getContentPane().add(oPanel); // aqui poñemos o panel que nos creamos como o panel do frame
    }
    public void addEscoitadoresObxectos(){
        oBotonMedra.addActionListener(new BotonMedraListener());
        oBotonReduce.addActionListener(new BotonReduceListener());
        
    }

public class BotonMedraListener implements ActionListener { // clase que usamos para aumentar
    public void actionPerformed(ActionEvent e){
       setSize(ancho+=incre, alto+=incre);
    }
}
public class BotonReduceListener implements ActionListener {  // clase que usamos para reducir
    public void actionPerformed(ActionEvent e){
        setSize(ancho-=incre, alto-=incre);
    }
}

}
