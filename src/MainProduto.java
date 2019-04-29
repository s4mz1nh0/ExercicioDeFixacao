
public class MainProduto {
    public static void main(String[] args){
        
        Produtos p = new Produtos();
        p.Nomes="Jotta";
        p.Precos=20;
        
        System.out.println(p.Nomes);
        
        p.diminuir10();
        System.out.println(p.Precos);
        
        p.aumenta25();
        System.out.println(p.Precos);
}
}