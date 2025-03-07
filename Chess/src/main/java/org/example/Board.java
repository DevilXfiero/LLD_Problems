package org.example;

import java.util.List;

public class Board {
    private Spot[][] boxes = new Spot[8][8];

    public Board() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                boxes[i][j] = null;
            }
        }
        resetBoard();
    }

    public Spot getSpot(int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8) {
            System.err.println("Error: Index out of bounds");
            return null;
        }
        return boxes[row][col];
    }

    public void resetBoard() {
        boxes[0][0] = new Spot(0, 0, new Rook(true));
        boxes[0][1] = new Spot(0, 1, new Knight(true));
        boxes[0][2] = new Spot(0, 2, new Bishop(true));
        boxes[0][3] = new Spot(0, 3, new Queen(true));
        boxes[0][4] = new Spot(0, 4, new King(true));
        boxes[0][5] = new Spot(0, 5, new Bishop(true));
        boxes[0][6] = new Spot(0, 6, new Knight(true));
        boxes[0][7] = new Spot(0, 7, new Rook(true));

        for (int i = 0; i < 8; i++) {
            boxes[1][i] = new Spot(1, i, new Pawn(true));
        }

        // Initialize black pieces
        boxes[7][0] = new Spot(7, 0, new Rook(false));
        boxes[7][1] = new Spot(7, 1, new Knight(false));
        boxes[7][2] = new Spot(7, 2, new Bishop(false));
        boxes[7][3] = new Spot(7, 3, new Queen(false));
        boxes[7][4] = new Spot(7, 4, new King(false));
        boxes[7][5] = new Spot(7, 5, new Bishop(false));
        boxes[7][6] = new Spot(7, 6, new Knight(false));
        boxes[7][7] = new Spot(7, 7, new Rook(false));

        for (int i = 0; i < 8; i++) {
            boxes[6][i] = new Spot(6, i, new Pawn(false));
        }

        // Initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Spot(i, j, null);
            }
        }
    }

    public void displayBoard() {
        System.out.printf("%12s", "");
        for (char ch = 'a'; ch <= 'h'; ch++) {
            System.out.printf("%12c", ch);
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.printf("%12d", 8 - i);
            for (int j = 0; j < 8; j++) {
                Spot spot = getSpot(i, j);
                if (spot.getPiece() != null) {
                    String symbol = "";
                    if (spot.getPiece().isWhite()) {
                        symbol = "WHITE" + spot.getPiece().getSymbol();
                    } else {
                        symbol = "BLACK" + spot.getPiece().getSymbol();
                    }
                    System.out.printf("%12s", symbol);
                } else {
                    System.out.printf("%12s", ".");
                }
            }
            System.out.printf("%12d%n", 8 - i);
        }

        System.out.printf("%12s", "");
        for (char ch = 'a'; ch <= 'h'; ch++) {
            System.out.printf("%12c", ch);
        }
        System.out.println("\n");
    }
}
