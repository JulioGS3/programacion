package UD5_Tarefa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    String [] arrayopcion = new String []{"Mostrar todas", "engadir", "borrar", "gardar en ficheiro", "sair"};
    ArrayList<Actividade> arrayActividades = new ArrayList<Actividade>();
    ArrayList<Socio> arraySocios = new ArrayList<Socio>();

    while (!opcion.equals("5")) {
          
        opcion=JOptionPane.showInputDialog("Elixe a operación que queres realizar: \n 1 -Xestionar actividades \n 2 -Xestionar socios \n 3 -Asignar actividades aos socios \n 4 -Mostrar actividades dun socio en concreto \n 5 -Sair  ");

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

                        }catch(ExcepcionsSociedade e){
                            System.out.println(e.getMessage());
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

                            }catch(IOException i){
                                System.out.println(i);
                            }

                            break;
                    }
                }while (opcion2 != 4); 
            
                
            
        
            case "2":
                break;
        
        }


    }
}
    
}