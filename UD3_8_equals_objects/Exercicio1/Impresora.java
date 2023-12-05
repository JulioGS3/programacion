/*1. Redefine o método equals() definindo unha clase Impresora: precio, modelo e follas/minuto. Define
2 construtores e os métodos get e set de cada atributo. Define tamén un método public boolean
equals() que devolva true se as 2 impresoras teñen un prezo similar (diferencia menor que 10
euros), e as mesmas follas por minuto. Redefine tamén o método hashCode( ) para que 2
impresoras que son iguais devolvan o mesmo hashCode.
Define unha clase Applmpresora na que crees 3 impresoras diferentes, e comproba que funcionan
todos os métodos que creaches. */
package UD3_8_equals_objects.Exercicio1;

public class Impresora {

    //atributos

    public int precio;
    public String modelo;
    public int follasMinuto;

    //construtores

    public Impresora(){

        precio = 50;
        modelo = "eco";
        follasMinuto = 20;
    }
    
    public Impresora(int precio, String modelo, int follasMinuto) {

        this.precio = precio;
        this.modelo = modelo;
        this.follasMinuto = follasMinuto;    
    }
    //metodos

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int prec) {
        this.precio = prec;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String mod) {
        this.modelo = mod;
    }
    public int getFollasMinuto() {
        return follasMinuto; /**
        *
        */
    }
    public void setFollasMinuto(int follasMin) {
        this.follasMinuto = follasMin;
    }

    //metodo equals oxecto

    public boolean equals(Object obj){
        if(obj == null){
            return false; // o obxeto non existe
        }
        if(this.getClass() != obj.getClass()){
            return false; //non coinciden as clases
        }
        Impresora imresora2 = (Impresora) obj;
        if(this.precio - imresora2.precio > 10 || imresora2.precio - this.precio > 10 ){
            return false; // o precio supera en 10
        }
        if(this.follasMinuto != imresora2.follasMinuto){
            return false; // as follasminuto son distintas

        }else{
            return true;
        }
        }
    //metodo comparar hashcode
    
        public int hashCode(){
            return follasMinuto;}
}
        




    
