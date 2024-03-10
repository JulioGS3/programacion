/*2. Modifica o exercicio da clase Bombilla, de xeito que os construtores mostren unha mensaxe, e crea
un método equals que compare 2 bombillas. Redefine tamén o método hashCode().
Define outra clase AppBombillaEq, que teña un main( ). Nesta clase Principal crea dúas bombillas,
e asígnalles potencia empregando o método setPotencia( ): 20 e 25. Modifica tamén o método
aumentaPotencia( ) e baixaPotencia( ) para que informe ao usuario se se tentou superar os límites,
se . Comproba que o funcionamento é correcto: para a primeira bombilla subindo 30, baixando 7,
subindo 19, asignando 14 e baixando 20, revisando cada vez o valor da potencia. E para a segunda,
sube 25, baixa 70, asigna 25 e baixa 7. Comproba que o método equals( ) que creaches devolve
false se as 2 potencias son distintas e true se son iguais */
package UD3_8_equals_objects.Exercicio2;

public class Bombilla {

    //atributos

    private int potencia;
    private static int potenciaTotal;
    public String nome;
    public String mensaxe;

    //constructor


    public Bombilla(int pot, String nombre, String mensaje){
    nome = nombre;
    potencia = pot;
    mensaxe = mensaje;
    potenciaTotal= pot + potenciaTotal;
   
    }
    
    //metodos

    public String getMensaxe() {
        return mensaxe;
    }

    public void setMensaxe(String mensaxe) {
        this.mensaxe = mensaxe;
    }

    public static int getPotenciaTotal(){
      
        return potenciaTotal;
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
            mensaxe= "superaches 35";
        }
        potenciaTotal = potenciaTotal + potencia;
        

        } 
        
    
    public void baixaPotencia( int h){
    
      
        potenciaTotal = potenciaTotal - potencia;

        potencia = potencia - h;

    
            if(potencia < 2){
    
                potencia = 2;
                mensaxe = "superaches o limite inferior";
                
            }
            if(potencia > 35 ){
    
                potencia = 35;
                
            }
            potenciaTotal = potenciaTotal + potencia;
          
}
    public static String comparaBombillas(Bombilla bombi1, Bombilla bombi2){

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
        public void mostraTodo(){

            System.out.println("a potencia e " + getPotencia() + " a total e " + getPotenciaTotal() + " e, " + getMensaxe());
        }
        public boolean equals(Object obj){

            if(obj == null){
                return false;
            }
            if(this.getClass() != obj.getClass()){
                return false;
            }
            Bombilla bomb = (Bombilla) obj;
            if(this.potencia != bomb.potencia){
                return false;
            }else{return true;}
        

        }
       
        public int hashCode(){
            return potencia;
        }
    

        
        }

