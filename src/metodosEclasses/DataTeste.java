package metodosEclasses;

public class DataTeste {
    
    public static void main(String[] args) {
        Data data = new Data();
        Data data2= new Data(31,12,2020);
        System.out.println("Construtor Padrão: "+ data.dataFormatada() );
        System.out.println("Construtor sobrecarregado: "+ data2.dataFormatada());

        data.setDia(8);
        data.setMes(10);
        data.setAno(1989);

         data2.setDia(14);
        data2.setMes(8);
        data2.setAno(1988);

        System.err.printf("%d/%d/%d\n", data.getDia(), data.getMes(), data.getAno());
        System.err.printf("%d/%d/%d\n", data2.getDia(), data2.getMes(), data2.getAno());
        System.out.println(data.dataFormatada());
        System.out.println(data2.dataFormatada());

    }
}
