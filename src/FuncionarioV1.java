
public class FuncionarioV1 {
    
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
}
