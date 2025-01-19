package org.example;

public class Spot {
    private Piece piece;
    private int row;
    private int column;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Spot(int row, int column, Piece piece) {
        this.piece = piece;
        this.row = row;
        this.column = column;
    }
}
