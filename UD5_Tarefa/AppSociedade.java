package UD5_Tarefa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *A aplicación deberá permitir:
• Xestionar actividades (mostrar todas, engadir, borrar, gardar en ficheiro)
• Xestionar socios (mostrar todos, engadir, borrar, buscar polo apelido, gardar en ficheiro)
• Asignar actividades aos socios. (asignar e desasignar)
• Mostrar as actividades dun socio concreto, busquemos AppSociedade
 */
public class AppSociedade {
public static void main(String[] args) throws ExcepcionsSociedade {
    
    String opcion = "";
    int opcion2;
    int opcion3;
    String [] arrayopcion = new String []{"Mostrar todas", "engadir", "borrar", "gardar en ficheiro", "sair"};
    String [] arrayopcionSocios = new String []{"Mostrar todos", "engadir", "borrar", "buscar por apelido", "gardar en ficheiro", "sair"};
    ArrayList<Actividade> arrayActividades = new ArrayList<Actividade>();
    ArrayList<Socio> arraySocios = new ArrayList<Socio>();

    //metodo pa recuperar do ficheiro as actividades 

    arrayActividades.clear();

    String fichero = "Actividades.txt"; 
    File f = new File(fichero);
    try {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String cadea;
        String [] atributos;

        while((cadea = br.readLine())!= null){
            atributos = cadea.trim().split(";");
            arrayActividades.add(new Actividade(Integer.parseInt(atributos[0]), atributos[1], Integer.parseInt(atributos[2]), Double.parseDouble(atributos[3]), atributos[4]));
           }
           br.close();

           for (Actividade Act : arrayActividades) {
                System.out.println(Act.toString());
           }
        } catch (Exception e) {
            System.out.println("Houbo un problema lendo o ficheiro");
        }
        //falta pa recuperar os socios



   

    while (!opcion.equals("5")) {
          
        opcion=JOptionPane.showInputDialog("Elixe a operación que queres realizar: \n 1 -Xestionar actividades \n 2 -Xestionar socios \n 3 -Asignar/desasignar actividades aos socios \n 4 -Mostrar actividades dun socio en concreto \n 5 -Sair  ");

        switch (opcion) {

            case "1":
                do {
                    opcion2 = JOptionPane.showOptionDialog(null, "Elixe que facer en relacion ás actividades ", "Actividades", 0, 1, null, arrayopcion, arrayopcion[4]);
                    switch (opcion2) {
                        case 0:
                           for (Actividade actividade : arrayActividades) {
                            System.out.println(actividade.toString());
                           }
                            break;
                    
                        case 1:
                        try{
                            String codActi = JOptionPane.showInputDialog("introduce o codigo da actividade");
                            int codActiInt = Integer.parseInt(codActi);
                            String nomeActi = JOptionPane.showInputDialog("introduce o nome da acticvidade");
                            String horasActi = JOptionPane.showInputDialog("introduce o numero de horas semanais da actividade");
                            int horasSemanais = Integer.parseInt(horasActi);
                            String precio = JOptionPane.showInputDialog("introduce o precio");
                            Double prezo= Double.parseDouble(precio);
                            String salaActi = JOptionPane.showInputDialog("introduce o nome da sala");
                            Actividade nova = new Actividade(codActiInt, nomeActi, horasSemanais, prezo, salaActi);
                            arrayActividades.add(nova);

                        }catch(ExcepcionsSociedade u){
                            System.out.println(u.getMessage());
                        }
                            break;

                        case 2:
                            String eleccion = JOptionPane.showInputDialog("elixe a posicion do obxeto que queres borrar");
                            int elecion = Integer.parseInt(eleccion);
                            arrayActividades.remove(elecion);
                            break;

                        case 3:
                            try{
                                File ficheiro = new File("Actividades.txt");
                                FileWriter fw = new FileWriter(ficheiro);
                                BufferedWriter bf = new BufferedWriter(fw);
                                    for (Actividade act : arrayActividades) {
                                        bf.write(act.toStringParaFicheiro());
                                    }
                                bf.close();
                                }catch(IOException e){
                                System.out.println(e);
                            }
                            break;
                        case 4:
                            System.out.println("saindo...");
                    }
                }while (opcion2 != 4); 
                   
            case "2":
                do {
                    opcion3 = JOptionPane.showOptionDialog(null, "Elixe que facer en relacion os socios ", "Socios", 0, 1, null, arrayopcionSocios, arrayopcionSocios[5]);
                    switch (opcion3) {
                        case 0:
                        for (Socio socio : arraySocios) {
                            System.out.println(socio.toString());
                        }
                            break;
                        case 1:
                        try{
                            String codSocio = JOptionPane.showInputDialog("introduce o codigo do Socio");
                            int codSocioInt = Integer.parseInt(codSocio);
                            String nomeSocio = JOptionPane.showInputDialog("introduce o nome do socio");
                            String Apelidos = JOptionPane.showInputDialog("introduce os apelidos");
                            String email = JOptionPane.showInputDialog("introduce o email");
                            String dia = JOptionPane.showInputDialog("introduce o dia do nacemento");
                            int diaInt = Integer.parseInt(dia);
                            String mes = JOptionPane.showInputDialog("introduce o mes do nacemento");
                            String ano = JOptionPane.showInputDialog("introduce o ano do nacemento");
                            int mesInt = Integer.parseInt(mes);
                            int anoInt = Integer.parseInt(ano);
                            Socio novoSocio = new Socio(nomeSocio, codSocioInt, Apelidos, email, diaInt, mesInt, anoInt);
                            arraySocios.add(novoSocio);
                        }catch(ExcepcionsSociedade a){
                            System.out.println(a.getMessage());
                        }
                            break;

                        case 2:
                            String eleccion2 = JOptionPane.showInputDialog("elixe a posicion do obxeto que queres borrar");
                            int elecion22 = Integer.parseInt(eleccion2);
                            arraySocios.remove(elecion22);
                            break;
                        case 3:

                            String buscaApelido= JOptionPane.showInputDialog("introduce o apelido");
                            for (Socio socio : arraySocios) {
                                if(socio.getApelidos().equals(buscaApelido)){
                                    System.out.println(socio.toString());
                                }else{
                                    System.out.println("non atopado");
                                }   
                            }
                            break;
                        case 4:
                            try{
                                File f = new File("socios.txt");
                                FileWriter filew = new FileWriter(f);
                                BufferedWriter buf = new BufferedWriter(filew);
                                    for (Socio soc : arraySocios) {
                                        buf.write(soc.toString());
                                    }
                                buf.close();
                                }catch(IOException o){
                                System.out.println(o);
                            }
                            break;
                        case 5:
                            System.out.println("saindo...");
                            break;
                }   
                }while (opcion3 != 5); 
                break;
            case "3":

                    for (Actividade acti : arrayActividades) {
                        System.out.println(acti.getCodActividade());
                    }
                    for (int i = 0; i < 3; i++) { 
                        String elixeSocio = JOptionPane.showInputDialog("elixe o indice para elexir un socio");
                        int elixeSocioInt = Integer.parseInt(elixeSocio);
                        Socio unSocio = arraySocios.get(elixeSocioInt);
                        String elixeCodigo = JOptionPane.showInputDialog("elixe entre os de arriba os codigos das actividades nas que participa o socio");
                        int elixeCodigoInt = Integer.parseInt(elixeCodigo);
                        Socio.setActiviadesInscrito(unSocio, elixeCodigoInt);
                    }
                break;

            case "4":  

                String elixeSocio = JOptionPane.showInputDialog("elixe o indice para elexir un socio do que queres ver as actividades nas que está inscrito");
                int elixeSocioInt = Integer.parseInt(elixeSocio);
                Socio unSocio = arraySocios.get(elixeSocioInt);
                System.out.println(unSocio.getActiviadesInscrito());
                    
                break;
            case "5":
                System.out.println("adios");
                break;
            }


    }
}
    
}