package UD4_5_exepcions;

class Ponto {
    int x = 0;
    int y = 0;
    Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}

class Rectangulo {
    Ponto orixe;
    int ancho;
    int alto;
    Rectangulo(int x, int y, int w, int h) {
        orixe = new Ponto(x,y);
        ancho = w;
        alto = h;
    }
    public void puntoNegativo(Object obj) throws Exception{
        Rectangulo unRectangulo = (Rectangulo) obj;
        if (unRectangulo.orixe.x < 0 || unRectangulo.orixe.y < 0){
            throw new Exception("nin X nin Y poden ser negativos");
        }else{System.out.println("todo ben");}
    }
}
class App{
    public static void main(String[] args){
        try{
            Rectangulo oRectangulo=new Rectangulo(-2,3,4,5);
            oRectangulo.puntoNegativo(oRectangulo);
        }
        catch (Exception e){
            System.out.println("non se puido crear o obxeto, " + e.getMessage());
        }
            
        }
}
