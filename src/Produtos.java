
public class Produtos {
    
    String Nomes;
    double Precos;
    
    void diminuir10(){
        this.Precos-=this.Precos*0.10;
    }
    
    void aumenta25(){
        this.Precos+=this.Precos*0.25;
    }
}
