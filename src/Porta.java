
public class Porta {
    boolean Abre;
    String Cor;
    double DX;
    double DY;
    double DZ;
    
    
    void abrir(){
        this.Abre=true;
    }
    void fechar(){
        this.Abre=false;
    } 
    void pintar(String Str){
        this.Cor=Str;
    } 
    boolean Aberta(){
        return this.Abre;
}}