/*14. Un traballador tivo un aumento do 3% do seu soldo desde o ano 2002. Calcula canto cobra
agora se no 2002 cobraba 1200 €. */

package Folla2Exercicios_if;

public class Exercicio14 {
public static void main(String[] args) {
    
    float sueldo02=1200;
    float aumento= (sueldo02*0.3f)+sueldo02;
    System.out.println("o sueldo actual son "+aumento+" euros");
}
}