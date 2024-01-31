/*. Define unha clase Figura con atributos area e cor. Define as súas clases derivadas Triangulo, Cadrado e
Círculo, cos atributo que consideres convenientes. Define (de modo automático se queres) os seus getters,
setters, e construtores con argumento. A
Crea unha clase AppFigura no que teñas un array de Figuras: 3 triángulos, 3 cadrados e 3 círculos. Percorre o
array e cambia a cor a “negro” daquelas figuras con área maior que 4.0.
Fai a continuación que a clase Figura implemente a interface Comparable, de forma que se chamas ao método
Arrays.sort( ) o array queda ordenado pola área */
package UD4_4_interfaces_3.Exercicio1;

public abstract class Figuras implements Comparable {

// atributos

    public Double area;
    public String cor;

//constructores

public Figuras() {
    area = 0.0;
    cor = "blanco";
}


//metodos

public abstract  Double calcularArea();

public Double getArea() {
    return area;
}

public void setArea(Double area) {
    this.area = area;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor; 
}
    
public int compareTo(Object obx){
    Figuras unhaFigura = (Figuras) obx;

    if(this.area > unhaFigura.area){
        return 1;
    }
    if(this.area < unhaFigura.area){
        return -1;
    }else{
        return 0;
    }
}

}