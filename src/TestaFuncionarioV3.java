
public class TestaFuncionarioV3 {
     public static void main(String[] args){
        
        FuncionarioV3 f3 = new FuncionarioV3();
        f3.funcionario = "Thais Nardiellen";
        f3.rg = "18.555.888";        
        f3.departamento = "Diretoria" ;
        f3.salario = 10000;
        Data d1 = new Data();
        d1.Dia = 27;
        d1.Mes = 04;
        d1.Ano = 2019;
        f3.entradaNoBanco = d1;
        f3.ativo = true;
        
        f3.bonifica(2);
        f3.demite();
        f3.mostrar();
    
}}
