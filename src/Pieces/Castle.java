package Pieces;


import Game.Pair;
import java.util.HashSet;

public class Castle extends Pieces.GamePiece {

    private int row;
    private int col;


    public Castle(int uniqueID, int row, int col){
        this.row = row;
        this.col = col;
    }

    public HashSet<Pair> getMoves(){
        return null;
    }

    @Override
    public Pair getPosition() {
        return null;
    }
}
