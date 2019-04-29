
public class FuncionarioV4 {
    
    String funcionario;
    String departamento;
    double salario;
    Data entradaNoBanco;
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
        System.out.println(entradaNoBanco.Dia+"-"+entradaNoBanco.Mes+"-"+entradaNoBanco.Ano);
        System.out.println(rg);
        System.out.println(ativo);
}   
    void Equals(FuncionarioV4 test){
        if((this.rg.equals(test.rg))&&(this.funcionario.equals(test.funcionario))){
            System.out.println("Funcionario ja existente");
        }
        else{
            System.out.println("Funcionarios distintos");
        }
        }
}
