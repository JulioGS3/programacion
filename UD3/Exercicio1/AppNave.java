package UD3.Exercicio1;

public class AppNave {
    public static void main(String[] args) {
        
    

    Nave interceptor = new Nave(); // exercicio 2, se cambiamos o tempo a private non vai

        System.out.println("tempo ");
        
        int tempoDaNave= 0;

        for (int i = interceptor.tempo; i >=0; i--){
            
            tempoDaNave = i;
        

            System.out.println("faltan " + tempoDaNave + " segundos");
        }

        System.out.println("despegando! ");
        
}

}