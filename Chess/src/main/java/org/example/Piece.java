package org.example;

public abstract class Piece {
    private boolean isKilled = false;
    private boolean isWhitePiece = true;

    public Piece(boolean isWhitePiece) {
        this.isWhitePiece = isWhitePiece;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public boolean isWhite() {
        return isWhitePiece;
    }

    public void setWhite(boolean white) {
        isWhitePiece = white;
    }

    public abstract boolean canMove(Board board, Spot start, Spot end);
    public abstract String getSymbol();
    public abstract void move(Board board, Spot start, Spot end);
}
