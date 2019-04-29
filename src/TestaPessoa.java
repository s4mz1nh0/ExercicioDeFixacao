
public class TestaPessoa {
    
    public static void main(String[] args){
        
        Pessoa Pe = new Pessoa();
            Pe.Individuo = "Rob";
            Pe.Idade = 58;
            
            Pe.Aniversario();
            System.out.println(Pe.Individuo+" está fazendo"+" "+Pe.Idade+" anos de idade");
        }
    }