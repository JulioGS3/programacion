/*1. Imos modificar o exercicio da clase Bombilla. Engade á clase Bombilla un atributo nome, e un atributo privado
estático potenciaTotal, na que gardamos a potencia total que está empregando o alumeado. Crea tamén un
método estático que devolva o valor desa potenciaTotal. Queremos que se vaia gardando nese atributo o
total de watios que están empregando as bombillas en cada momento. Pensa como terás que modificar o
exercicio anterior para que isto aconteza: terás que modificar varios dos métodos xa creados. */

package UD3_3_atrib_metod_static.Exercicio1;

public class Bombilla1 {
    
    
    private int potencia;
    private static int potenciaTotal;
    public String nome;



    public static int getPotenciaTotal(){
      
        return potenciaTotal;
    }

    
    public Bombilla1(int pot){
    
        potencia = pot;
        potenciaTotal= pot + potenciaTotal;
    }
    
    public void setPotencia( int pot){
        
        potenciaTotal = potenciaTotal - potencia;

        if (pot < 2){

            potencia = 2;
        }
        else if (pot > 35){

            potencia = 35;
        }
        
            potenciaTotal = potenciaTotal + potencia;
    
        
    }
    public int getPotencia(){
    
    return potencia;
    
    }
    
    public void aumentaPotencia( int h){
    
    
        potenciaTotal = potenciaTotal - potencia;
        
        potencia= potencia + h;

       
        if (potencia > 35 ){
    
            potencia = 35;
            
        }
        potenciaTotal = potenciaTotal + potencia;

        } 
        
    
    public void baixaPotencia( int h){
    
        
        potenciaTotal = potenciaTotal - potencia;

        potencia = potencia - h;

    
            if(potencia < 2){
    
                potencia = 2;
                
            }
            if(potencia > 35 ){
    
                potencia = 35;
                
            }
            potenciaTotal = potenciaTotal + potencia;
          
}
public static String comparaBombillas(Bombilla1 bombi1, Bombilla1 bombi2){

    String mensaxe = "son iguales";


if(bombi1.potencia > bombi2.potencia){

return bombi1.nome;

}
if(bombi2.potencia > bombi1.potencia){

return bombi2.nome;

}else{

return mensaxe;
}

}
}

