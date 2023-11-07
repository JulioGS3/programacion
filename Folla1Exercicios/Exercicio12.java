/*12. Fai o intercambio do valor de 2 variables enteiras. Necesitarás unha variable auxiliar. */
public class Exercicio12 {
public static void main(String[] args) {
    
    
    int variableA=2;
    int variableB=3;
    
    int cambioValor= variableA;

    variableA=variableB;
    variableB=cambioValor;
    System.out.println("a variable A vale "+ variableA);
    System.out.println("a variable B vale "+ variableB);
}
}
