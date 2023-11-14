package UD3_3_atrib_metod_static.Exercicio4;

public class Parcela {

    //atributos

    private String nome;
    private Double base;
    private Double altura;

    //constructor

    public Parcela (String nom, Double bas, Double alt){

        nome = nom;
        base = bas;
        altura = alt;

    }

    //metodos

    public String getNome(){

        return nome;
    }
    public double getBase(){

        return base;
    }
    public double getAltura(){

        return altura;
    }
    public void setNome(String nom){

        nome = nom;
    }
    public void setBase(double bas){

        base = bas;
    }
    public void setAltura(double alt){

        altura = alt;
    }

    public double area(){

        Double resultArea = base * altura;

        return resultArea;
    }

    public static String calculaMaiorArea2(Parcela par1, Parcela par2){

        String maior = "";

        Double arePar1 = par1.base * par1.altura;

        Double arePar2 = par2.base * par2.altura;

            if(arePar1 > arePar2){

                maior = par1.nome;

            }else{

                maior = par2.nome;

            }
            return maior;

    }

    public static String calculaMaiorArea3(Parcela par1, Parcela par2, Parcela par3){

        String maior = "";

            if(par1.area() > par2.area() && par1.area() > par3.area()){

                maior = par1.nome;
            }
            if(par2.area() > par1.area() && par2.area() > par3.area()){

                maior = par2.nome;
            }
            if(par3.area() > par1.area() && par3.area() > par2.area()){

                maior = par3.nome;
            }

        return maior;
    }


    
}
