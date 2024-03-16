package UD5_0_Arraylist.Exercicio5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * AppClientesLista
 */
public class AppClientesLista {
public static void main(String[] args) {
    
    String opcion = "";

    ArrayList <Cliente> listaClientes = new ArrayList<>();

    while (!opcion.equals("c")) {

        opcion = JOptionPane.showInputDialog("elixe entre: \n a ) crear un cliente \n b ) mostrar todos os clientes \n c ) sair ");

        switch (opcion) {

            case "a":
                    String nomeCliente = JOptionPane.showInputDialog("introduce o nome do cliente ");
                    String tlf = JOptionPane.showInputDialog("introduce o telefono do cliente ");
                    int telefono = Integer.parseInt(tlf);
                    String email = JOptionPane.showInputDialog("introduce o email do cliente ");
                    Cliente nomCliente = new Cliente(nomeCliente, telefono, email);
                    listaClientes.add(nomCliente);
                break;
        
            case "b":
                    for (Cliente cliente : listaClientes) {
                       
                        JOptionPane.showMessageDialog(null,"o cliente chamase " + cliente.getNome() + ", o seu email e " + cliente.getEmail() + ", e ten o numero de tlfn " + cliente.getTelefono());
                    }
                break;
        }
    }



}
    
}