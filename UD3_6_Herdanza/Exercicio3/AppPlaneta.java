/*Comproba que todo funciona nunha clase AppPlaneta cos seguintes exemplos:
• Crea un obxecto de PlanetaHabitable, de nome Fión, 24 soles e 1.5 anos luz de distancia,
collendo 1000000 de persoas, entre 0ºC e 10ºC.
• Modifica o valor da distancia (mediuse mellor) , e dálle outro nome que che goste máis, así
como cambia a temperatura máxima e mínima.
• Crea un obxecto PlanetaHostil, de nome Kaleva, 50 soles e 0.4 anos luz, true e true.
• Mostra os datos de ambos.
• Introduce un planeta de cada con valores que queiras, e lista todos os valores de todos os
obxectos creados, comprobando o valor da variable estática.
• Fai explotar o último planeta creado, e comproba cantos planetas están accesibles */
package UD3_6_Herdanza.Exercicio3;

public class AppPlaneta{
    
public static void main(String[] args) {
    
    PlanetaHabitable habitable1 = new PlanetaHabitable(true, "fion", 24, 1000000, 0, 10, 1.5);

    habitable1.setDistancia(1.6);
    habitable1.setNome("filon");
    habitable1.setTemperaturaMax(15);
    habitable1.setTemperaturaMin(-1);

    PlanetaHostil hostil1 = new PlanetaHostil(false, "kaleva", 50, true, true, 0.4);

    System.out.println(habitable1.getNome() + " " + habitable1.getAccesibilidade() + ", ten un tamaño de " + habitable1.getTamaño() + " soles, e a temperatura min e de " + habitable1.getTemperaturaMin() + " grados, e a maxima e de " + habitable1.getTemperaturaMax() + "  grados. A distancia e de " + habitable1.getDistancia() + " soles");
    System.out.println(hostil1.getNome() + " " + hostil1.getAccesibilidade() + ", ten un tamaño de " + hostil1.getTamaño() + " soles, "+ hostil1.getHaiVida()+ ", " + hostil1.gethaiEnerxia() + ", e a distancia e de " + hostil1.getDistancia() + " soles");

   System.out.println (Planeta.getNumPlanetasAccesibles() + " planeta/s accesibles");

   PlanetaHabitable habitable2 = new PlanetaHabitable(true, "melon", 27, 1000, 20, 40, 7.5);
   PlanetaHostil hostil2 = new PlanetaHostil(true, "kaya", 20, false, false, 3.4);

    habitable2.listaTodo();
    hostil2.listaTodo();
    habitable1.Explotou();

System.out.println(Planeta.getNumPlanetasAccesibles( ) + " planeta/s accesibles");
}
}