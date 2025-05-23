package lambdas;

@FunctionalInterface
public interface Calculo {    
        
    public double executar(double a, double b);
    
    static String fazAlgo(){
        return "Alguma coisa";
    }    

} 

