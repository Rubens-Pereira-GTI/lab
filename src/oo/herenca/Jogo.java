package oo.herenca;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();        
        
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);

        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.LESTE);

        Jogador j2 = new Jogador();
        j2.andar(Direcao.NORTE);
        

        j2.andar(Direcao.LESTE);
        j2.andar(Direcao.LESTE);


        System.out.println(j1.vida);
        System.out.println(j2.vida);
        j1.atacar(j2);
        System.out.println(j1.vida);
        System.out.println(j2.vida);
    }
}
