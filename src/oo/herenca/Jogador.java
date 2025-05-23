package oo.herenca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    boolean andar(Direcao direcao){
        if(direcao == Direcao.NORTE){
            y++;
        }else if(direcao == Direcao.SUL){
            y--;
        }else if(direcao == Direcao.OESTE){
            x--;
        }else if(direcao == Direcao.LESTE){
            x++;
        }
        return true;
    }

    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY==1){
            oponente.vida -= 10;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= 10;
        }else{
            return false;
        }
        return true;
    }
}
