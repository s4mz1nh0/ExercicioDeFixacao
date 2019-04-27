
public class FuncionarioV3 {
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
}
