package UD3_3_atrib_metod_static.Exercicio4;

public class AppParcela {

public static void main(String[] args) {
    

    Parcela parcela1 = new Parcela("par1", 2.0, 2.0);
    Parcela parcela2 = new Parcela("par2", 3.0, 3.0);
    Parcela parcela3 = new Parcela("par3", 4.0, 4.0);
    Parcela parcela4 = new Parcela("par4", 5.0, 5.0);
    Parcela parcela5 = new Parcela("par5", 6.0, 6.0);

    Double resArea = parcela1.area();

    System.out.println("a area e " + resArea);

    String resGrande2 = Parcela.calculaMaiorArea2(parcela1, parcela2);

    System.out.println("a mais grande de 2 e " + resGrande2);

    String resGrande3 = Parcela.calculaMaiorArea3(parcela1, parcela4, parcela5);

    System.out.println("a mais grande e " + resGrande3);

    // solo chamando 3 veces os metodos

    String masGrande = Parcela.calculaMaiorArea3(parcela1, parcela2, parcela3);

    System.out.println(masGrande);

    String masGrande2 = Parcela.calculaMaiorArea3(parcela3, parcela4, parcela5);

    System.out.println("a mais grande das 5 e " + masGrande2);

    Double areaMaior = parcela5.area();

    System.out.println("a parcela maior das 5 e " + masGrande2 +" e ten un area de " + areaMaior);

}
}
    

