package Pieces;

import Game.Pair;
import java.util.HashSet;

public abstract class GamePiece {

    private int row;
    private int col;

    public abstract Pair getPosition();


    public abstract HashSet<Pair> getMoves();




//region Getters/Setters
    public int getrow() {
        return this.row;
    }

    public void setrow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }
//endregion Getters/Setters
}
