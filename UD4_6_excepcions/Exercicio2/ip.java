package UD4_6_excepcions.Exercicio2;

import javax.swing.JOptionPane;

/**
 * Crea un validador de direcciones IP. Lembra que as direcciones IP son especificadas en decimal como 4 grupos de números separados por ‘.’ 
 * Cada grupo puede contener un número decimal de 0 a 255. Por exemplo son IP válidas:

    0.1.2.3
    255.255.255.255
    9.234.1.199

Son inválidas:

    0.1.2.
    0.1.2.3.
    256.1.2.3

 */
public class ip {

    public String ip;

    public ip (String ip) throws ipExepcion{

        this.ip = ip;

        String [] arrayIp = ip.split("\\.");
        int parteEnteira = 0;

        for (int i = 0; i < arrayIp.length; i++) {

          if(ip.contains(".") == false){

            throw new ipExepcion("non e o formato adecuado");
          }  

            String parte = arrayIp[i];
            
            try{
                parteEnteira = Integer.parseInt(parte);

            }catch(NumberFormatException e){
                System.out.println("o formato non e correcto");
            }

            if(parteEnteira < 0 || parteEnteira > 255){
                throw new ipExepcion("o numero non e valido");
            }
          
        }
          
            }

    @Override
    public String toString() {
        return "ip [ip= " + ip + "]";
    } 
     
            }
        



    



    

