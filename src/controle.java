
public class controle {
    private int Numero;
    private int Numero2;
    private int resultado;
   
    public controle(){
        this(0,0,0);
    }
    
    public controle(int Numero,int Numero2,int resultado){
        this.Numero = Numero;
        this.Numero2 = Numero2;
        this.resultado = resultado;
    }
    
  public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }
    
    public int Mais(int Numero,int Numero2,int resultado){
        setNumero(Numero);
        setNumero2(Numero2);
        
        resultado = Numero + Numero2;
        
        return resultado;
    }
    
     public int Menos(int Numero,int Numero2,int resultado){
        setNumero(Numero);
        setNumero2(Numero2);
        
        resultado = Numero - Numero2;
        
         return resultado;
    }
     
      public int Vezes(int Numero,int Numero2,int resultado){
        setNumero(Numero);
        setNumero2(Numero2);
        
        resultado = Numero * Numero2;
        
         return resultado;
    }
      
       public int Dividir(int Numero,int Numero2,int resultado){
        setNumero(Numero);
        setNumero2(Numero2);
        
        resultado = Numero / Numero2;
        
         return resultado;
    }
    
       
}
