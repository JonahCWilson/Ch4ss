
public class Knight extends GamePiece{

    private int row;
    private int col;


    public Knight(int uniqueID, int row, int col){
        this.row = row;
        this.col = col;
    }

    public HashSet<Pair> getMoves(){
        HashSet<Pair> output = new HashSet<Pair>();
        if !Gameboard.outOfBounds(this.row - 2, this.col -1){
            output.add(new Pair(this.row - 2, this.col-1));
        }
    }

}