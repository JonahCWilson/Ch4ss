package Game;

import Pieces.GamePiece;

import java.util.HashSet;

public class GameState {

    Gameboard board = new Gameboard();
    HashSet<GamePiece> white, black;



    public GameState(){
        white = new HashSet<GamePiece>();
        black = new HashSet<GamePiece>();
    }

    public void startGame(){
        System.out.println("I'm working");
    }

    private HashSet<GamePiece> getBlackTeam(){
        HashSet output = new HashSet();

        return output;
    }
}
