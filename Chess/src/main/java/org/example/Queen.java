package org.example;

public class Queen extends Piece {
    public Queen(boolean isWhitePiece) {
        super(isWhitePiece);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return true;
    }

    @Override
    public String getSymbol() {
        return "QUEEN";
    }

    @Override
    public void move(Board board, Spot start, Spot end) {

    }
}
