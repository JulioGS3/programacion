/*2. Fai un programa SEN ARRAYS que pida 4 doubles, e faga o cálculo do máximo, do mínimo, e da
media empregando varias funcións. O valor do máximo, do mínimo e da media debe ser impreso
desde o main( ), e as funcións facer o cálculo e devolver os valores. */
package Repaso;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce 4 numeros Double");
        Double num1= entrada.nextDouble();
        Double num2= entrada.nextDouble();
        Double num3= entrada.nextDouble();
        Double num4= entrada.nextDouble();


        Double resultadoMax = maximo(num1, num2, num3, num4);

        System.out.println("o maximo e " + resultadoMax);
        
        Double resultadoMin = minimo(num1, num2, num3, num4);
        System.out.println("o minimo e " + resultadoMin);

        Double resultadoMedia = media(num1, num2, num3, num4);
        System.out.println("a media e " + resultadoMedia);
    }
    

    public static Double maximo(Double i, Double j, Double h, Double k){
        
        Double max =0.0;
        if(i > j && i > h && i > k){
            max = i;
        }
         if(j > h && j > k && j > max){
            max = j;
        }
        if(h > max && h > k){
            max = h;
        }
        if(k > max){
            max = k;
        }
        
        return max;
    }
      public static Double minimo(Double i, Double j, Double h, Double k){
        
        Double min = i;
        if(i < j && i < h && i < k){
            min = i;
        }
         if(j < h && j < k && j < min){
            min = j;
        }
        if(h < min && h < k){
            min = h;
        }
        if(k < min){
            min = k;
        }
        
        return min;
    }
    public static Double media(Double i, Double j, Double h, Double k){
        Double med = (i + j + h + k)/4;
        return med;
    }
}
