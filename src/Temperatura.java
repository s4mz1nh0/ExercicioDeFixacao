
public class Temperatura {
    
    double ConvFarenheit(double GC){
        double GF;
        GF=((GC/5)*9)+32;
        return GF;
    }
    
    double ConvCelsius(double GF){
       double GC;
       GC=((GF-32)/9)*5;
       return GC;
    }
}
