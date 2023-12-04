/*1. Realiza un programa que vaia facendo o seguinte:
a) Crea un StringBuilder coa cadea “Bo día paseante”
b) Mostra a súa capacidade e a súa lonxitude (ten relación co tamaño da cadea? )
c) Partindo da cadea anterior emprega os métodos de StringBuilder para converter a cadea en “Bo día
aos 3000 paseantes”, e mostrar a cadea. O número 300 debe ser un int almacenado anteriormente
nunha variable.
d) Partindo da cadea anterior emprega os métodos de StringBuilder para converter a cadea en “Bo día
aos 3000 paseantes da zona vella”. Mostra a cadea.
e) Crea un String coas 10 últimas letras da cadea anterior e móstrao */

package UD3_5_stringbuilder;

class StringBuilder1_1 {
public static void main(String[] args) {

    int num = 3000;
    int contar = 0;

    StringBuilder cadea = new StringBuilder("Bo dia paseante");
    
    System.out.println(" a capacidade e " + cadea.capacity());
    System.out.println("a sua lonxitude e " + cadea.length());

    cadea = cadea.replace(7, 7, "aos  ");
    cadea = cadea.replace(20, 20, "s");
    cadea.insert (11, num);
    System.out.println(cadea);

    cadea = cadea.append(" da zona vella");
    System.out.println(cadea);

    
    contar = cadea.length() - 10;
    cadea = cadea.delete(0, contar);
    System.out.println(cadea);




    }

    
}