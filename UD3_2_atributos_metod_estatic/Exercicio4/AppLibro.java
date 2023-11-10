/*Crea agora:
a) 3 libros de título distinto
b) 1 libro cun título repetido, e distinto exemplar.
c) Cambia o prezo do segundo libro
d) Vende 2 dos libros anteriores e comproba que a variable numLibrosVendidos colle o valor 2.
e) Define un método estático valeMais que reciba 2 libros como argumentos, e devolva -1 se o primeiro libro
é máis caro, 1 se o segundo é o máis caro, e 0 se os dous libros valen o mesmo. Debe ser así:
public static int valeMais( Libro libro1, Libro libro2) {
... /* Comparamos libro1.prezo con libro2.prezo tendo os 3 return posibles*/

/*f) Comproba que funciona facendo 3 comparacións: o primeiro libro co segundo, o segundo co primeiro, e os
dous libros que teñen o mesmo título. No AppLibro debes comprobar se o valor devolto é -1, 1 ou 0, e mostrar
unha saída diferente por consola en cada caso */

package UD3_2_atributos_metod_estatic.Exercicio4;

class AppLibro {
public static void main(String[] args) {
    
    Libro nemo = new Libro("manolo", "nemo", 10, 1, false);
    Libro zalacain = new Libro("juan", "zalacain", 20, 1, false);
    Libro isla = new Libro("antonio", "isla", 20, 1, false);

    Libro nemo2 = new Libro("manolo", "nemo", 10, 2, false);


nemo2.setPrezo(25);
isla.seVende();
zalacain.seVende();

System.out.println("venderonse " + Libro.getNumLibrosVendidos() + " libros");

int maisCaro = Libro.valeMais(nemo, nemo2);


System.out.println("o mais caro e " + maisCaro);

int maisCaro2 = Libro.valeMais(nemo2, isla);

System.out.println("o mais caro e " + maisCaro2);

int maisCaro3 = Libro.valeMais(isla, zalacain);

System.out.println("o mais caro e " + maisCaro3);

}
}