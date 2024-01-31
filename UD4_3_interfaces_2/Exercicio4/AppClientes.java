package UD4_3_interfaces_2.Exercicio4;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppClientes {
public static void main(String[] args) {
    

    Cliente [] arrayClientes = new Cliente [4];

    for (int i = 0; i < arrayClientes.length; i++) {

        String nomeCidade = JOptionPane.showInputDialog("introduce o nome da cidade");
        String poboacionCidade = JOptionPane.showInputDialog("introduce a poboacion");
        int poboacionCidadeEnteiro = Integer.parseInt(poboacionCidade);
        String nomeCliente = JOptionPane.showInputDialog("introduce o nome do cliente");

        arrayClientes [i] = new Cliente(nomeCidade, poboacionCidadeEnteiro, nomeCliente);
    }
        Arrays.sort(arrayClientes);
        
        for (Cliente cliente : arrayClientes) {

            System.out.println("o cliente " + cliente.getNomeCliente()+ " vive en " + cliente.getNome() + ", e esa cidade ten unha poboacion de " + cliente.getPoblacion() );
            
        

    }




}
    
}