
public class numeros_aleatorios {
public static void main(String[] args) {
   /* System.out.println("ola");

    int prezo = 20;
    System.out.println("o prezo e "+prezo);

    float prezoDecimal = 111.55f;
    System.out.println("o novo prezo e "+ prezoDecimal);

    String nome = new String ();
    nome = "Julio";
    System.out.println("o meu nome e "+nome); */

Double aleatorio = 0.0;
aleatorio= Math.random();
System.out.println(aleatorio);

//numeros entre 0 e 10
aleatorio= Math.random()*10;
System.out.println(aleatorio);

//podemolo convertir a enteiro

int aleatorioEnteiro= (int) Math.random();
System.out.println(aleatorioEnteiro);

//sumando 1 non contariamos co 0(aleatorio entre 1 e 10)

aleatorio= (Math.random()*10)+1;


}
    
}