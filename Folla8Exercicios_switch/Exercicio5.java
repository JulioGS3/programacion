/* 5. Xogo de adiviñar unha palabra entre 5 diferentes que empecen cada unha por unha vogal distinta.
O xogador terá 2 intentos para cada unha, sendo felicitado ao acertar, e informado da palabra no
caso de fallar. Poderá xogar as veces que queira. Emprega switch*/

package Folla8Exercicios_switch;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    int intentos = 0;
    String opcion = "";
    String adivina = "";
  
       
        while(!opcion.equals("s")){

            System.out.println("Debes adivinar unha palabra que empece por cada vocal, elixe a vocal ca que queres probar ");
            System.out.println("a ");
            System.out.println("e ");
            System.out.println("i ");
            System.out.println("o ");
            System.out.println("u ");
            System.out.println("s "+". sair");

            opcion = entrada.nextLine();

        switch(opcion){


            case("a"):

                for( int i = 1; i < 3; i++){

                    System.out.println("proba con unha palabra que empece por a");

                    adivina = entrada.nextLine();
                    
                    if(adivina.equals("arena")){

                        System.out.println("acertaches");

                        break;

                    }else{
            
                        System.out.println("mala sorte, fallaches");
                    }
                }
            break;

            case("e"):
                    
                for( int i = 1; i < 3; i++){

                    System.out.println("proba con unha palabra que empece por e");

                    adivina = entrada.nextLine();
                    
                    if(adivina.equals("etapa")){

                        System.out.println("acertaches");

                        break;  
                    
                    }else{
            
                        System.out.println("mala sorte, fallaches");
                    }
                }
            break;

            case("i"):

                for( int i = 1; i < 3; i++){

                     System.out.println("proba con unha palabra que empece por i");
    
                     adivina = entrada.nextLine();
                        
                    if(adivina.equals("ingles")){
    
                        System.out.println("acertaches");
    
                        break;
    
                    }else{
                
                        System.out.println("mala sorte, fallaches");
                    }
                }

            break;  

            case("o"):
                
                for( int i = 1; i < 3; i++){

                    System.out.println("proba con unha palabra que empece por o");

                    adivina = entrada.nextLine();
                    
                    if(adivina.equals("oso")){

                        System.out.println("acertaches");

                        break;

                    }else{
            
                        System.out.println("mala sorte, fallaches");
                    }
                }

            break;  

                case("u"):

                    for( int i = 1; i < 3; i++){

                        System.out.println("proba con unha palabra que empece por u");

                        adivina = entrada.nextLine();
                        
                        if(adivina.equals("ultimo")){

                            System.out.println("acertaches");

                            break;

                        }else{
                
                            System.out.println("mala sorte, fallaches");
                    }
                }
            break;

                }

        }
    }
}
    

