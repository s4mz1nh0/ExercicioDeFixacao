
public class TestaFuncionarioV1 {
    public static void main(String[] args){
    FuncionarioV1 f1 = new FuncionarioV1();
    f1.funcionario = "samuel santana";
    f1.rg = "22.333.333";        
    f1.departamento = "Corregedoria" ;
    f1.salario = 15000;
    f1.entradaNoBanco = "27-04-2019";
    f1.ativo = true;
    
    f1.bonifica(10);
    System.out.println(f1.salario);
    f1.demite();
    System.out.println(f1.ativo);
}}
