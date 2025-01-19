package org.example;

public class Pawn extends Piece{
    public Pawn(boolean isWhitePiece) {
        super(isWhitePiece);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return true;
    }

    @Override
    public String getSymbol() {
        return "PAWN";
    }

    @Override
    public void move(Board board, Spot start, Spot end) {

    }
}
