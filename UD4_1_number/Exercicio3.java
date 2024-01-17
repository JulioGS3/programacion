/*3. Empregando as variables de clase MAX_VALUE e MIN_VALUE, fai un programa que mostre por pantalla
os valores máximos e mínimos para Byte, Short, Integer, Float, Double e Long. */
package UD4_1_number;
public class Exercicio3 {
    public static void main(String[] args) {

    int enteiroMax = Integer.MAX_VALUE;
    int enteiroMin = Integer.MIN_VALUE;
    System.out.println(" no enteiro o max e " + enteiroMax + " e o minimo e " + enteiroMin);
    
    byte byteMax = Byte.MAX_VALUE;
    byte byteMin = Byte.MIN_VALUE;
    System.out.println(" no Byte o max e " + byteMax + " e o minimo e " + byteMin);
    
    short shortMax = Short.MAX_VALUE;
    short shortMin = Short.MIN_VALUE;
    System.out.println(" no Short o max e " + shortMax + " e o minimo e " + shortMin);

    float floatMax = Float.MAX_VALUE;
    float floatMin = Float.MIN_VALUE;
    System.out.println(" no Byte o max e " + floatMax + " e o minimo e " + floatMin);
    
    Double doubleMax = Double.MAX_VALUE;
    Double doubleMin = Double.MIN_VALUE;
    System.out.println(" no Byte o max e " + doubleMax + " e o minimo e " + doubleMin);

    Long longMax = Long.MAX_VALUE;
    Long longMin = Long.MIN_VALUE;
    System.out.println(" no Byte o max e " + longMax + " e o minimo e " + longMin);
}   

    
}