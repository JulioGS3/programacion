
package UD3_2_atributos_metod_estatic.Exercicio3;

public class AppDinosaurio {
public static void main(String[] args) {
    

Dinosaurio din1 = new Dinosaurio();
Dinosaurio din2 = new Dinosaurio();
Dinosaurio din3 = new Dinosaurio();



din1.setNome("alfito");
din1.setIdade(1);
din2.setNome("elfito");
din2.setIdade(2);
din3.setNome("ilfito");
din3.setIdade(3);


int numero = Dinosaurio.getDinosaurios();
System.out.println("hai " + numero + " dinosaurios");

System.out.println(din1.getNome()+ " , " + din2.getNome() + " e " + din3.getNome() + " e teñen " + din1.getIdade() + " , " + din2.getIdade() + " e " + din3.getIdade() + " anos");


String nomeVello = Dinosaurio.eMaisVello(din1, din3);

System.out.println("o mais vello e " + nomeVello);
}
    
}
