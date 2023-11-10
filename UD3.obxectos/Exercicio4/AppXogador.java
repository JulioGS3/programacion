/*Define outra clase AppXogador na que definas un método main() (public static void) e fai o seguinte:
a) Crea un xogador. Mostra os seus valores empregando os métodos.
b) Modifica os seus atributos a “Roi” e 22.
c) Mostra de novo os valores dos seus atributos */


package UD3.obxectos.Exercicio4;

public class AppXogador {
    public static void main(String[] args) {
        
        Xogador julio = new Xogador("julio", 33);

        System.out.println("o nome e " + julio.getNome());
        System.out.println("a edad e " + julio.getIdade());

        julio.setNome("Roi");

       System.out.println("ahora o nome e " + julio.getNome());

        julio.setIdade(22);

        System.out.println("ahora a edad e " + julio.getIdade());

    }
    
}
