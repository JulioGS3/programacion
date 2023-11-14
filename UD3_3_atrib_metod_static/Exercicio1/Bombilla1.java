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

    
    public Bombilla1(int potencia){
    
        this.potencia = potencia;
        potenciaTotal= potencia + potenciaTotal;
    }
    
    public void setPotencia( int potencia){
        
        
        if (potencia < 2){

            this.potencia = 2;
        }
        else if (potencia > 35){

            this.potencia = 35;
        }
        else {

            this.potencia = potencia;
        }
        
        potenciaTotal = (potenciaTotal + this.potencia)- potenciaTotal;
            
        
    }
    public int getPotencia(){
    
    return potencia;
    
    }
    
    public void aumentaPotencia( int h){
    
        potencia = potencia + h;
        potenciaTotal = potenciaTotal + h;
    
        if (potencia < 2 ){
    
            potencia = 2;
            
        }
        if (potencia > 35 ){
    
            potencia = 35;
            
        }
        } 
        
    
    public void baixaPotencia( int h){
    
        potencia = potencia-h;
        potenciaTotal = potenciaTotal-h;
    
            if(potencia < 2){
    
                potencia = 2;
                
            }
            if(potencia > 35 ){
    
                potencia = 35;
                
            }
            

}
}