/*Fai un pequeno programa para controlar o stock dun produto (id, prezo e cantidade). A cantidade por defecto é de 50 unidades. 
Crea un método estático de venderProduto(), e crea a túa propia clase de excepción produtoSenStockException 
(filla de Exception) para xestionar a falta de stock. */
package UD4_5_exepcions.Exercicio5;
public class Ex5Produto {

    //atributos
    public int id;
    public int prezo;
    public int cantidade;
    
    //constructor
    
    public Ex5Produto() {
        id = 0000;
        prezo = 100;
        cantidade = 50;
    }
    public Ex5Produto(int id, int prezo) {
        this.id = id; 
        this.prezo = prezo;
        cantidade = 50;
    }
    public class Exception extends Ex5Produto {
    
    public static int venderProduto(Ex5Produto produto1, int cantidadeVendida) throws Exception{
        
        produto1.cantidade= produto1.cantidade-cantidadeVendida;

            if (produto1.cantidade < 0 ) {
            throw new Exception("non quedan unidades");

            }else{return produto1.cantidade;}
        }
   }
    
}