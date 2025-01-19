package org.example;

public class Rook extends Piece {
    public Rook(boolean isWhitePiece) {
        super(isWhitePiece);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return true;
    }

    @Override
    public String getSymbol() {
        return "ROOK";
    }

    @Override
    public void move(Board board, Spot start, Spot end) {

    }
}
