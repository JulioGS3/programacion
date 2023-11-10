/*4. Queremos simular os libros físicos dunha librería. Crea unha clase Libro, con atributos privados titulo, autor,
prezo, exemplar (para gardar 1, 2, ..., ata 30), vendido (valerá false no construtor). Crea tamén os seus métodos
de acceso, e un construtor que reciba todos os valores. Teremos tamén un método seVende( ), que cambia o valor
de vendido a true. Engade tamén unha variable estática numLibrosVendidos na que levamos a conta dos libros
que se venden. Crea agora:
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

public class Libro {
    
}
