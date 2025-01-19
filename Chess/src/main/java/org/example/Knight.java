package org.example;

public class Knight extends Piece {
    public Knight(boolean isWhitePiece) {
        super(isWhitePiece);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return true;
    }

    @Override
    public String getSymbol() {
        return "KNIGHT";
    }

    @Override
    public void move(Board board, Spot start, Spot end) {

    }
}
