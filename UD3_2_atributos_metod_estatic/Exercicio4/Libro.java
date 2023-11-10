/*4. Queremos simular os libros físicos dunha librería. Crea unha clase Libro, con atributos privados titulo, autor,
prezo, exemplar (para gardar 1, 2, ..., ata 30), vendido (valerá false no construtor). Crea tamén os seus métodos
de acceso, e un construtor que reciba todos os valores. Teremos tamén un método seVende( ), que cambia o valor
de vendido a true. Engade tamén unha variable estática numLibrosVendidos na que levamos a conta dos libros
que se venden. */

package UD3_2_atributos_metod_estatic.Exercicio4;

public class Libro {

private String autor;
private String titulo;
private int prezo;
private int exemplar;
private boolean vendido;
public static int numLibrosVendidos = 0;


public Libro (String autor, String titulo, int prezo, int exemplar, boolean vendido){

    this.autor = autor;
    this.titulo = titulo;
    this.prezo = prezo;
    this.exemplar = exemplar;
    this.vendido = false;
}

public void setAutor( String autor){

    this.autor = autor;
    
}
public void setTitulo( String titulo){

    this.titulo = titulo;
    
}
public void setPrezo( int prezo){

    this.prezo = prezo;
    
}

public void setExemplar(int exemplar){

    this.exemplar = exemplar;
}
public void setVendido(){

this.vendido = true;

}
public void seVende (){

    if( vendido == false){

    numLibrosVendidos++;

    vendido = true;

    }
}

public static int getNumLibrosVendidos(){

return numLibrosVendidos;

}

public static int valeMais( Libro libro1, Libro libro2){

        int maisCaro = 0;

    if (libro1.prezo > libro2.prezo){
        
        maisCaro = -1;
        
        return maisCaro;
    }

    if (libro1.prezo < libro2.prezo){

        maisCaro = 1;

        return maisCaro;
    }else{

        maisCaro = 0;

         return maisCaro;
    }
}

    
        
    } 
    
    

    
    
    

