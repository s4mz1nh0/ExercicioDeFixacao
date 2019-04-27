
public class FuncionarioV2 {
    
    String funcionario;
    String departamento;
    double salario;
    String entradaNoBanco;
    String rg;
    boolean ativo;    

    void bonifica(double aumentar){
    salario+=salario*(aumentar/100);
    }
    void demite(){
    ativo = false;
    }
void mostrar(){
        System.out.println(funcionario);
        System.out.println(departamento);
        System.out.println(salario);
        System.out.println(entradaNoBanco);
        System.out.println(rg);
        System.out.println(ativo);
}}
