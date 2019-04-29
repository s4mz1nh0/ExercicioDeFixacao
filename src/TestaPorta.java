
public class TestaPorta {
    
    public static void main(String[] args){
        
        Porta p = new Porta();
        p.Abre=true;
        p.Cor="Vermelho e Preto";
        p.DX=4;
        p.DY=8;
        p.DZ=1;
        
        System.out.println(p.Aberta());
        p.abrir();
        System.out.println(p.Aberta());
        p.fechar();
        System.out.println(p.Aberta());
        p.pintar(p.Cor);
        System.out.println("Cor: "+p.Cor+" Dimensoes: "+p.DX+"x"+p.DY+"x"+p.DZ);
        
    }
}