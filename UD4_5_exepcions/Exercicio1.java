package UD4_5_exepcions;
class AppEx1{
    public static void main(String[] args){

        int[] x= {0,1,2,3,4};
        try{  
            x[5]=5;
        }catch(ArrayIndexOutOfBoundsException excepcionArray){
            System.out.println("o array non ten esa lonxitude");
        }
        System.out.println("O programa recupérase da excepción e continúa ata aquí");
}
}