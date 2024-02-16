package UD4_5_exepcions.Exercicio6;

public class Ordenador {
    private Procesador p;
    private Memoria m;
    private DiscoDuro d;
    private int pvp;
    private String numeroDeSerie;
    
    //constructor
    public Ordenador(String numeroDeSerie, int m_capacidade, String m_tipo, int m_velocidade, double d_capacidade, String d_tipo, int d_velocidade, String p_modelo, double p_velocidade, int prezo) throws OrdenadorException{

        m = new Memoria(m_capacidade, m_tipo, m_velocidade);
        d = new DiscoDuro(d_capacidade, d_tipo, d_velocidade);
        p = new Procesador(p_modelo, p_velocidade);
        pvp = prezo;
        this.numeroDeSerie = numeroDeSerie;
        //no constructor ponse o posible fallo no que pode incurrir, ponse aqui porque se hai fallo xa non se crea o obxecto
        if(p_modelo.equals("i7") && !d_tipo.equals("sata3")){

            throw new OrdenadorException(numeroDeSerie, " non se pode crear o ondenador xq e i7 cun sata3 ");//aqui lanzamos a excepcion e xa ye pasamos os parametros que necesita o 
                                                                                    // o seu constructor que son o numserie a unha mensaxe 
        }
        if(numeroDeSerie.equals("HP") && m_velocidade < 4){
            throw new OrdenadorException(numeroDeSerie, " non se pode crear o ordenador porque empeza por HP  e ten pouca memoria");
        }   
        
    
}
    //metodos
    public int getCapacidadeMemoria() {
        return m.getCapacidade();
    }
}
