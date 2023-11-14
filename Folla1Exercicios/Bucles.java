import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        
/*si sabemos o numero de veces que empregaremos, usamos a palabra FOR */

// for(inicializacion; condicion, actualizacion da variable) . (i=valor inicial; condicion final, como se vai incrementando)

    for(int i=0; i<5; i=i+1){
    System.out.println(i);
    }
        
/*si non sabemos numero de veces que empregaremos,usamos  a palabra while */

 //   while( Condicion){} ejecutase mentras se cumpla esa condicion

Scanner ent= new Scanner(System.in);
System.out.println("introduce numeros e parara cando introduzas o 10");
int num=1;
while( num <10){    
    num= ent.nextInt();
}
//do{}//executase sempre a prieira vez




    }
}

