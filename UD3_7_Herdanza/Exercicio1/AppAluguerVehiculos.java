/*Comproba que todo vai ben, nunha clase AppAlugueiroTurismos nos seguintes pasos:
• Crea un turismo matrícula 1111-BCD, e un camión 2222-BCD.
• Crea outro turismo matrícula 3333-BCD e outro camión 4444-BCD.
• Alúgase o turismo 1111-BCD con 12000 kms, e o camión 2222-BCD o día 129.
• Algúen pide alugar o turismo 1111-BCD.
• Mostra os datos de todos os vehículos, coas variables estáticas. Mostra as variables estáticas
(variables de clase) empregando o nome da clase, por exemplo: Turismo.numTurismos.
• Devólvense os turismos 1111-BCD con 14500 kms, e o camión 2222-BCD o día 133.
• Mostra de novo os datos de todos os vehículos */
package UD3_7_Herdanza.Exercicio1;

public class AppAluguerVehiculos {
    public static void main(String[] args) {
        

        Turismo tur1 = new Turismo("1111-bcd", true, 100, 12000,0);
        Camion cami1 = new Camion("222-bcd", true, 200, 129, 0);

        

        tur1.alugar();
        cami1.alugar();
        System.out.println("turismos alquilados " + Turismo.getNumTurismosAlquilados());
        System.out.println("turismos dispoñibles " + Turismo.getNumTurismos());
        System.out.println("camions alquilados " +  Camion.getNumCamionsAlquilados());
        System.out.println("camions dispoñibles " + Camion.getNumCamions());
        tur1.alugar();
        tur1.devolver(14500);
        cami1.devolver(133);
        tur1.mostraInfo();
        cami1.mostraInfo();
    }
}
