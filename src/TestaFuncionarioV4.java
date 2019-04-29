
public class TestaFuncionarioV4 {
     public static void main(String[] args){
        
        FuncionarioV4 f4 = new FuncionarioV4();
        f4.funcionario = "Kay";
        f4.rg = "12.545.858";        
        f4.departamento = "TI" ;
        f4.salario = 5000;
        Data d2 = new Data();
        d2.Dia = 07;
        d2.Mes = 02;
        d2.Ano = 2017;
        f4.entradaNoBanco = d2;
        f4.ativo = true;
        
        f4.bonifica(3);
        f4.demite();
        f4.mostrar();
        
        FuncionarioV4 Nf4 = new FuncionarioV4();
        Nf4.funcionario = "Mohamed";
        Nf4.rg = "44.555.666";        
        Nf4.departamento = "Entregador" ;
        Nf4.salario = 2000;
        Data d3 = new Data();
        d3.Dia = 11;
        d3.Mes = 12;
        d3.Ano = 2013;
        Nf4.entradaNoBanco = d3;
        Nf4.ativo = true;
        
        Nf4.Equals(Nf4);
        Nf4.Equals(f4);
}
}