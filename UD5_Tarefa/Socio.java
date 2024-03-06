package UD5_Tarefa;
/**
 * Dos socios gardaremos o seu nome, codSocio, nome, apelidos, email, dataNacemento, actividadesInscrito
(un array de ata 3 códigos de actividade). Define tamén os métodos de acceso e os métodos que precises. Socio

• O email deberá ser validado, para que sexa un email válido, cunha expresión regular.
• A data debe ser correcta, podes empregar por exemplo a clase LocalDate e o método LocaDate.of()
para comprobar se a data é correcta
 */

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Socio {

    public String nome;
    public int codSocio;
    public String apelidos;
    public String email;
    public LocalDate dataNacemento;
    public static int [] activiadesInscrito;

    public Socio(String nome, int codSocio, String apelidos, String email, LocalDate dataNacemento) throws ExcepcionsSociedade{
        this.nome = nome;
        this.codSocio = codSocio;
        this.apelidos = apelidos;
        this.email = email;
        try{
            this.dataNacemento = dataNacemento;
        }catch(Exception e){
            System.out.println(e);
        }
      
        if(Socio.comprobarEmail(email) == false){
            throw new ExcepcionsSociedade("O email introducido non é válido", 4);
        }
    }
    public static boolean comprobarEmail(String email){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher match = patron.matcher(email); 
        if(match.find()){
            return true;
        }else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(LocalDate dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public static int[] getActiviadesInscrito() {
        return activiadesInscrito;
    }

    public static void setActiviadesInscrito(int[] activiadesInscrito) {
        Socio.activiadesInscrito = activiadesInscrito;
    }

   

    
}