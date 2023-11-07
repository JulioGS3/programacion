/*9. Un kg de castañas valía no ano 2018 1.20 €/kg. Se o seu prezo subiu cada ano un 10 %, mostra
o prezo que tivo cada ano ata o 2022 */

package Folla2Exercicios_if;

public class Exercicio9 {
    public static void main(String[] args) {
        
    
    Float precio_2018= 1.20f;
    Float incremento=0.1f;

    Float precio_2019= (precio_2018*incremento)+precio_2018;
    Float precio_2020= (precio_2019*incremento)+precio_2019;
    Float precio_2021= (precio_2019*incremento)+precio_2020;
    Float precio_2022= (precio_2021*incremento)+precio_2021;
    
    System.out.println( "o precio do ano 2019 e "+precio_2019+" euros");
    System.out.println( "o precio do ano 2019 e "+precio_2020+" euros");
    System.out.println( "o precio do ano 2019 e "+precio_2021+" euros");
    System.out.println( "o precio do ano 2019 e "+precio_2022+" euros");
    



}
}
