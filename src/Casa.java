
public class Casa {
    String Cor;
    Porta Porta01;
    Porta Porta02;
    Porta Porta03;
    
     void pintar(String Str){
         this.Cor=Str;
     }
     
     int NPortasAbertas(){
         int p1=0;
         if(this.Porta01.Abre==true){ p1++; }
         if(this.Porta02.Abre==true){ p1++; }
         if(this.Porta03.Abre==true){ p1++; }
         return p1;
}}
