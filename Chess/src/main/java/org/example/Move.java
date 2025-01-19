package org.example;

public class Move {
    private Player player;
    private Spot startSpot;
    private Spot endSpot;
    private Piece pieceMove;
    private Piece pieceKilled;
    private boolean isValidMove;

    public Move(Player player, Spot startSpot, Spot endSpot, Piece pieceMove) {
        this.player = player;
        this.startSpot = startSpot;
        this.endSpot = endSpot;
        this.pieceMove = pieceMove;
    }

    public void setValidMove(boolean validMove) {
        isValidMove = validMove;
    }

    public Player getPlayer() {
        return player;
    }

    public Spot getStartSpot() {
        return startSpot;
    }

    public Spot getEndSpot() {
        return endSpot;
    }

    public Piece getPieceMove() {
        return pieceMove;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public boolean isValidMove() {
        return isValidMove;
    }
}
