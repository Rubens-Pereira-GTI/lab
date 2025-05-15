package metodosEclasses;

public class AreaCirc {
    double raio;
    static final double PI=3.14;

    public AreaCirc(double raioInicial){
        
        raio = raioInicial;
    }

    public double area(){
        return PI * Math.pow(raio, 2);
    }
}
