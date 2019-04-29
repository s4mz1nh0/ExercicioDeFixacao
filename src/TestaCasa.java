
public class TestaCasa {
    public static void main(String[] args){
        
        Porta p=new Porta();
        p.Abre=false;
        p.Cor="Vermelho e Preto";
        p.DX=2;
        p.DY=8;
        p.DZ=1;
        
        
        Porta p2=new Porta();
        p2.Abre=false;
        p2.Cor="Verde";
        p2.DX=3;
        p2.DY=9;
        p2.DZ=2;
        
        
        Porta p3=new Porta();
        p3.Abre=false;
        p3.Cor="Vermelho";
        p3.DX=7;
        p3.DY=5;
        p3.DZ=3;
        
        
        Casa c1=new Casa();
        c1.Cor="Cinza";
        c1.Porta01=p;
        c1.Porta02=p2;
        c1.Porta03=p3;
        
        
        c1.pintar("Verde");
        p.abrir();
        p2.abrir();
        p3.fechar();
        
        System.out.println(c1.NPortasAbertas());
    }
}

