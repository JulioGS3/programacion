package UD3_6_Herdanza.Exercicio1;

public class AppParticipante {

public static void main(String[] args) {
    
    Xogador xog1 = new Xogador();
    Xogador xog2 = new Xogador("manolo", 16, "delantero");

    xog1.setNome("antonio");
    xog1.setIdade(15);
    xog1.setPosto("medio");
    System.out.println(xog1.getNome()+ " ten "+xog1.getIdade() + " anos e xoga de " + xog1.getPosto());
    System.out.println(xog2.getNome()+ " ten "+xog2.getIdade() + " anos e xoga de " + xog2.getPosto());


    Arbitro arb1 = new Arbitro();
    Arbitro arb2 = new Arbitro("juan", 30, 5);

    arb1.setNome("paco");
    arb1.setIdade(25);
    arb1.setAno(3);

    System.out.println(arb1.getNome() + " ten " + arb1.getIdade() + " anos, e leva arbitrando " + arb1.getAno() + " anos");
    System.out.println(arb2.getNome() + " ten " + arb2.getIdade() + " anos, e leva arbitrando " + arb2.getAno() + " anos");
}
}

