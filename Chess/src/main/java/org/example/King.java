package org.example;

public class King extends Piece {
    public King(boolean isWhitePiece) {
        super(isWhitePiece);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return true;
    }

    @Override
    public String getSymbol() {
        return "KING";
    }

    @Override
    public void move(Board board, Spot start, Spot end) {

    }
}
