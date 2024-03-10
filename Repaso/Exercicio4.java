/*4. Fai un programa que vaia pedindo cadeas de caracteres de como moito 30 caracteres. Fai unha
función contaCs(), que devolva o número de letra ‘c’ da cadea. O programa rematará cando a
cadea non teña ningunha ‘c’ ou sexa “The end”. Para cada unha das cadeas o programa SEN
MENÚ irá facendo o seguinte. Podes empregar funcións da clase String:
1. Mostrar o número de díxitos da cadea.
2. Mostrar o número de caracteres que non son números nen letras: espazos, interrogacións,
comas, puntas, símbolos, etc.
3. Mostrar o número de letras minúsculas e o número de letras maiúsculas. Emprega unha
función de ctype.h para saber se a letra é minúscula ou maiúscula.
4. Cambiar todas as vogais minúsculas a maiúsculas e as vogais maiúsculas a minúsculas.
Emprega unha función de ctype.h para facer o cambio.
Antes de rematar o programa, deberá mostrar cal foi a cadea con máis letras ‘c’ e a máis longa de
todas. Emprega dúas variables String cadMais, e String cadMaisLonga para ir gardando esas
cadeas e móstraas ao final. */
package Repaso;

public class Exercicio4 {
    public static void main(String[] args) {
        String cadea = "manolo esta aqui";
        char c = 'a';
        for (int i = 0; i < cadea.length(); i++) {
            Character.isDigit(cadea.charAt(i));
            System.out.println(i);
        }

    }
}
