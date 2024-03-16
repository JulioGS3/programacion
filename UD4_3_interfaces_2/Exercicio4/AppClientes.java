package UD4_3_interfaces_2.Exercicio4;


import java.util.Arrays;


import javax.swing.JOptionPane;

public class AppClientes {
public static void main(String[] args) {
    Cidade [] arrCidades = new Cidade [4];

    arrCidades [0] = new Cidade("ssdsds", 22222);
    arrCidades [1] = new Cidade("ssdsds", 33);
    arrCidades [2] = new Cidade("ssdsds", 44);
    arrCidades [3] = new Cidade("ssdsds", 44);

    Cliente [] arrayClientes = new Cliente[2];

    for (int i = 0; i < arrayClientes.length; i++) {
        
        String nomCliente = JOptionPane.showInputDialog("introduce o nome do cliente");
        String nomCidade = JOptionPane.showInputDialog("introduce o numero de indice da cidade");
        int indice = Integer.parseInt(nomCidade);
        arrayClientes[i]= new Cliente(nomCliente, arrCidades [indice] );
    }
        Arrays.sort(arrayClientes);

        for (Cliente cliente : arrayClientes) {
            System.out.println("cidade "+ cliente.getNome() + " nome cliente: " + cliente.getNomeCliente() +" poboacion da cidade: "+ cliente.getCidade().getPoblacion());   
        }
        
    



}
    
}