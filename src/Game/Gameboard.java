package Game;

import java.util.HashSet;

public class Gameboard extends HashSet<Pair>{


    public Gameboard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j< 8; j++){
                this.add(new Pair(i, j));
            }
        }
    }

    public static boolean outOfBounds(int row, int col){
        return (row < 0 || col < 0 || row > 7 || col > 7);
    }


}
