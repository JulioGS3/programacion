package UD4_5_exepcions.Exercicio5;

import java.util.Scanner;

import UD4_5_exepcions.Exercicio5.Ex5Produto;

public class AppProduto {
public static void main(String[] args) {

        
    Ex5Produto produto1 = new Ex5Produto(1111, 200);
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("cantas unidades queres vender");
    int vender = entrada.nextInt();
 
      try {
        int unidadesProduto1 = Ex5Produto.venderProduto(produto1, vender);
        System.out.println("quedan " + unidadesProduto1 + " unidades"); 
      }
      catch(SenExistencias e){
        System.out.println("non se pode vender, " + e.getMessage());
      }
        

    }    

}   
