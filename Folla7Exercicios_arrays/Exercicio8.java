/*8. Declara un array de 10 enteiros. Fai que o primeiro valor sexa 5. Garda na segunda posición o
doble do que hai na primeira – 4. Garda na terceira posición o doble do que hai na segunda – 4. Fai
un bucle para facer isto ata a posición 9. Mostra todos os valores do array. */

package Folla7Exercicios_arrays;

public class Exercicio8 {
public static void main(String[] args) {

    int [] arrayInt = new int [10];
    int posicion=0;

        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = i;
        }
        for (int i : arrayInt) {
            System.out.println(i);
        }
        arrayInt[0] = 5;

        for (int i = 0; i < arrayInt.length-1; i++){
            arrayInt[i+1] =(arrayInt[i]*2)-4;
        }
        for (int i : arrayInt) {
            System.out.println(i+ " posicion "+ posicion++);

        }



}
}
