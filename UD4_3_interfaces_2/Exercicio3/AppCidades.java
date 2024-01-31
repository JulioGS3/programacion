/*3
Crea agora unha clase AppCidades, que terá un array de 5 cidades. Pide os valores por teclado con
JOptionPane, para as 5 cidades, e mostra o array ordenado pola poboación, empregando
Arrays.sort(  */
package UD4_3_interfaces_2.Exercicio3;

import java.sql.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppCidades {
public static void main(String[] args) {

    Cidade [] arrayCidades = new Cidade[5];
    
    
    for (int i = 0; i < arrayCidades.length; i++) {
        
    String nomeCidade = JOptionPane.showInputDialog("introduce o nome da cidade");
    String poboacionCidade = JOptionPane.showInputDialog("introduce a poboacion");
    int poboacionCidadeEnteiro = Integer.parseInt(poboacionCidade);
        
    arrayCidades[i] = new Cidade(nomeCidade, poboacionCidadeEnteiro);
    
}
    Arrays.sort(arrayCidades);

    for (Cidade cidade : arrayCidades) {

        System.out.println(cidade.getNome() + " " + cidade.getPoblacion());
        
    }
    }
}