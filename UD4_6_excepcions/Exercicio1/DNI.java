/*Define unha clase DNI para que o construtor procese o string, axustando ao seguinte formato do DNI: de 1 a 8 díxitos seguidos por unha letra maiúscula ou minúscula.

Fai unha excepción personalizada empregando unha clase DNIException.

O programa AppDNI deberá pedir 3 DNI’s nun array, comprobar cada un cando se introducen (se é erróneo pedirao de novo) e cando xa están introducidos os 3 valores mostrar todos os valores. */

package UD4_6_excepcions.Exercicio1;

import org.w3c.dom.DOMException;

public class DNI {

    public String dni;

    public DNI(String dni) throws DniExcepcion {
        this.dni = dni;


        for (int i = 0; i < 8; i++) {

            char num = dni.charAt(i);

            if(Character.isDigit(num) == false){
                throw new DniExcepcion (dni, " os datos introducidos neste dni non son numeros");
                }
            }

        char letra = dni.charAt(8);

        if(Character.isLetter(letra) == false){
            throw new DniExcepcion(dni, "o ultimo dato do dni introducido non e unha letra");
        }  
        }

    public String getDni() {
        return dni;
    }

        
    }
    
    
