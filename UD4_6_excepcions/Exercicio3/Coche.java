/*Define unha clase Coche para gardar información de varios coches para vender:matrícula, prezo e modelo. Teremos como moito 4 coches á venta. 
Teremos unha clase AppCoche cun menú que se mostra nun JOptionPane coas seguintes opcións:
a) Introducir un vehículo: matrícula, prezo e modelo. Teremos as seguintes restriccións nos valores:

    O prezo debe estar entre 10000 e 100000
    O modelo ten que empezar pola marca, e só vendemos Tesla e Toyota
    A matrícula debe axustarse á normal actual: 4 números, e 3 letras sen vocais.

b) Mostrar vehículos (só os elementos que xa se introduciron)

c) Saír

Cando se introduce un coche que non se axusta ás restriccións indicadas, o construtor da clase Coche debe lanzar unha excepción. 
Para que o código sexa máis lexible debes facer varias funcións booleanas estáticas na clase coche: comprobaPrezo(), comprobaModelo() 
e comprobaMatricula(), que serán chamadas nun único if’s no construtor de Coche. Se algunha falla debes lanzar a excepción cunha mensaxe que 
se axuste ao fallo do valor de vehículo, que será capturada no main e pedir o Coche de novo. */

package UD4_6_excepcions.Exercicio3;

import javax.swing.JOptionPane;

public class Coche {

    public String matricula;
    public int prezo;
    public String modelo;


    public Coche(String matricula, int prezo, String modelo) throws ExcepcionCoche {

        this.matricula = matricula;
        this.prezo = prezo;
        this.modelo = modelo;
        
        if(Coche.ComprobaPrezo(prezo) == false){
            throw new ExcepcionCoche("o prezo introducido non e valido");
        }
        if(Coche.ComprobarModelo(modelo) == false){
            throw new ExcepcionCoche("o modelo introducido non e valido");
        }
        if(Coche.comprobaMatricula(matricula) == false){
            throw new ExcepcionCoche("a matricula non e valida");
        }
    }

    public static boolean ComprobaPrezo(int prezo){   
   
        if(prezo < 1000 || prezo > 10000){
            return false;
    }else{
        return true;
    }
    }

    public static boolean ComprobarModelo(String modelo){

        if (modelo.startsWith("toyota") || modelo.startsWith("tesla")){
            return true;
    }else{
        return false;
    }
    }

    public static boolean comprobaMatricula(String matricula){
        boolean valido= true;
        String InicioMatricula = matricula.substring(0,3);
        String FinalMatricula = matricula.substring(4);
        if(FinalMatricula.contains("a") || FinalMatricula.contains("e") || FinalMatricula.contains("i") || FinalMatricula.contains("o") || FinalMatricula.contains("u")){
            valido = false;
        }else{
            try{
            int numMatricula = Integer.parseInt(InicioMatricula);
                
            }catch(NumberFormatException e){
                valido = false;
        }
    }
        return valido;
       
    }


    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", prezo=" + prezo + ", modelo=" + modelo + "]";
    }
    
}    

