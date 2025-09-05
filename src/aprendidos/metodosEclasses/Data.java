package metodosEclasses;

public class Data {
    String n1;
    String n2="";
    String n3=null;

    private int dia=1, mes=1, ano=1970;


    //construtores
    public Data(){

    }

    // com o this apontamos para a variável de instância
    public Data(int dia, int mes, int ano){
        this.dia= dia;
        this.mes= mes;
        this.ano= ano;
    }

    public void setDia(int d){
        dia = d;
    }
    public void setMes(int m){
        mes = m;
    }
    public void setAno(int a){
        ano = a;
    }

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }

    public String dataFormatada(){
        String dataF = dia+"/"+mes+"/"+ano;
        return dataF;
    }

    public void dataFormatada2(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
}
