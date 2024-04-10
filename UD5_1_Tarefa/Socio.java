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
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Socio {

    public String nome;
    public int codSocio;
    public String apelidos;
    public String email;
    public int anoNacemento;
    public int mesNacemento;
    public int diaNacemento;
    public int [] activiadesInscrito= new int[3];

    public Socio(String nome, int codSocio, String apelidos, String email, int ano, int mes, int dia, int acti1, int acti2, int acti3) throws ExcepcionsSociedade{
        this.nome = nome;
        this.codSocio = codSocio;
        this.apelidos = apelidos;
        this.email = email;
        anoNacemento=ano;
        mesNacemento=mes;
        diaNacemento=dia;
        activiadesInscrito[0]=acti1;
        activiadesInscrito[1]=acti2;
        activiadesInscrito[2]=acti3;
        try{
           LocalDate fecha = LocalDate.of(anoNacemento, mesNacemento, diaNacemento);
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

    public int getAnoNacamento() {
        return anoNacemento;
    }
    public void setAnoNacamento(int anoNacemento) {
        this.anoNacemento = anoNacemento;
    }
    public int getMesNacemento() {
        return mesNacemento;
    }
    public void setMesNacemento(int mesNacemento) {
        this.mesNacemento = mesNacemento;
    }
    public int getDiaNacemento() {
        return diaNacemento;
    }
    public void setDiaNacemento(int diaNacemento) {
        this.diaNacemento = diaNacemento;
    }
    
    public String getActiviadesInscrito() {
        return activiadesInscrito[0] + ", " + activiadesInscrito[1] +", " + activiadesInscrito[2];
    }
    public static void setActividadesInscrito(Socio unsocio, int activiades, int i) {
  
        unsocio.activiadesInscrito[i]= activiades;
    }
   
    @Override
    public String toString() {
        
        return "Socio [nome=" + nome + ", codSocio=" + codSocio + ", apelidos=" + apelidos + ", email=" + email
                + ", anoNacamento=" + anoNacemento + ", mesNacemento=" + mesNacemento + ", diaNacemento=" + diaNacemento
                + ", activiadesInscrito="+ activiadesInscrito[0]+";"+activiadesInscrito[1]+";"+activiadesInscrito[2];
    }

    public String toStringParaFicheiroSocio() {
        
        return nome + ";" + codSocio + ";" + apelidos + ";" + email
                + ";" + anoNacemento + ";" + mesNacemento + ";" + diaNacemento+ ';'
                +activiadesInscrito[0]+";"+activiadesInscrito[1]+";"+activiadesInscrito[2]+"\n";
    }

   

    
}