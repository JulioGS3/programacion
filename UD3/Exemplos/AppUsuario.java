package UD3.Exemplos;

public class AppUsuario {

    public static void main(String[] args) {

        Usuario julio = new Usuario("Julio", 33);

        System.out.println(" o meu nome e " + julio.nome + " e a edade e " + julio.getIdade()); //poño getIdade porque e private o atributo enton temos q usar getidade porque get e
                                                                                                //e un constructor publico e ahi si podemos acceder
        julio.setNome("julian"); // cambiamos o nome co constructor getNome
        
        julio.setIdade(34); // cambiamos edade
    }
    
}
