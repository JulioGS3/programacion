/*. Fai unha clase Nave que teña como atributo un nome que che guste, e unha variable pública enteira tempo. Crea un
construtor que lle asigne a tempo o valor 10.
Crea unha clase AppNave, cun único método main( ) na que crees un obxecto Nave. O main( ) deberá nun bucle for ir
restando o valor tempo da nave de segundo a segundo ata chegar a 0, avisando finalmente do despegue, indicando o nome da
nave. Por exemplo: “A nave Apolo13 acaba de despegar!”. */

package UD3.Exercicio1;

public class Nave {
    
    public String nome;
    public int tempo; 
    

    public Nave(){

        tempo = 10;

}

}