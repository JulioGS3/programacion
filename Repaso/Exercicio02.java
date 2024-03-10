/*2. Crea unha clase FraseBuilder que teña como atributo un StringBuilder frase e outro atributo String saudo.
Crea agora os seguintes métodos:
a) iniciaFrase( ): engadirá un valor pedido por teclado a frase
b) eliminaFrase( ): Podes empregar o método delete, ou asignar un length = 0.
c) mostraFrase( ): Mostrará o saúdo, e a continuación a frase
d) mostraLonxitudeCapacidade( ): mostra a lonxitude e a capacidade de frase
e) eliminaParte( ): Pedirá dous índices e eliminará as letras entre eses índices de frase.
f) introducirDouble( ): Pedirá a posición e o double e o introducirá na frase.
g) invertirFrase( ): inverterá a frase */

package Repaso;

public class Exercicio02 {
    //atributos
    public StringBuilder frase;
    public String saudo;

        //constructores
    public Exercicio02(String saludo, StringBuilder fras){
    
        saudo = saludo;
        frase = fras;
    }

    //metodos

    public void setIniciaFrase(StringBuilder fras){

        frase = fras;
    }
    public StringBuilder EliminaFrase(StringBuilder fras){

        frase = fras;
        int num = frase.length();
        frase = frase.delete(0, num);
        return frase;
    }
    public void mostraLonxitude(StringBuilder fras){

        frase = fras;
        int cap = frase.capacity();
        int lonx = fras.length();

        System.out.println("ten unha lonxittude de  " + lonx + " e unha cap de " + cap);
    }

    public StringBuilder eliminaParte(int ini, int fin, StringBuilder fras){

        frase = fras;
        frase = frase.replace(ini, fin, "");
        return frase;
    }
    public StringBuilder darVolta(StringBuilder fras){
        frase = fras;
        frase = frase.reverse();
        return frase;
    }
    public StringBuilder insertarDouble (StringBuilder fras, int pos, Double num){
        frase = fras;

        frase = frase.insert(pos, num);
        return frase;
    
    } 




        }






