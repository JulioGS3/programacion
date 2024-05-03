package UD6_2_Botons.Exercicio4;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *Programa que pregunte cál é a suma de dous números menores que 4, xerados aleatoriamente. O usuario deberá dar a resposta 
 pulsando botóns con números do 0 ao 6. O que pulsa o usuario deberase ver nunha etiqueta. O programa deberá mostrar noutra 
 etiqueta se o resultado é correcto ou incorrecto. OFrame
 */
public class OFrame extends JFrame{

        public String resultado;
        public int num1 = 0;
        public int num2 = 0;
        public int suma;

        JLabel etiqueta1 = new JLabel("cal e a suma de "+ num1 + " + " + num2 + "? :");
        JLabel etiqueta2 = new JLabel(resultado);
        JPanel panel = new JPanel();
        JButton boton0 = new JButton("0"); 
        JButton boton1 = new JButton("1"); 
        JButton boton2 = new JButton("2"); 
        JButton boton3 = new JButton("3"); 
        JButton boton4 = new JButton("4"); 
        JButton boton5 = new JButton("5"); 
        JButton boton6 = new JButton("6"); 
        JButton botonNovo = new JButton("Nova Operacion");

    public OFrame (){
        caracteristicasBotons();
        colocaObxetos();
        engadirEscoitadores();
    }
    public void caracteristicasBotons (){
        
        botonNovo.setBounds(50, 100, 150, 50);
        boton0.setBounds(300, 100, 150, 50);
        boton1.setBounds(50, 300, 150, 50);
        boton2.setBounds(300, 300, 150, 50);
        boton3.setBounds(50, 500, 150, 50);
        boton4.setBounds(300, 500, 150, 50);
        boton5.setBounds(50, 700, 150, 50);
        boton6.setBounds(300, 700, 150, 50);
        etiqueta1.setBounds(50, 50, 300, 50);
        etiqueta2.setBounds(400, 50, 350, 50 );
        panel.setLayout(null);
    }
    public void colocaObxetos (){
        getContentPane().add(panel);
        panel.add(boton0);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(botonNovo);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
    }
    public void engadirEscoitadores (){
        boton0.addActionListener(new BotonCero());
        boton1.addActionListener(new BotonCero());
        boton2.addActionListener(new BotonCero());
        boton3.addActionListener(new BotonCero());
        boton4.addActionListener(new BotonCero());
        boton5.addActionListener(new BotonCero());
        boton6.addActionListener(new BotonCero());
        botonNovo.addActionListener(new BotonCero());
    }
    public class BotonCero implements ActionListener {
        public void actionPerformed (ActionEvent e){
            if(Integer.parseInt(((JButton) e.getSource()).getText()) == suma){
                etiqueta2.setText("correcto, o resultado e " + ((JButton) e.getSource()).getText() );
            }else{
                etiqueta2.setText("incorrecto, o resultado era " + suma);
            }
            int num1 = (int)(Math.random()*3)+1;
            int num2 = (int)(Math.random()*3)+1;
            suma = num1+num2;
            etiqueta1.setText("cal e a suma de "+num1+ " + " + num2 + " ? :");
    
    }

    
}
}