package org.example;

public class TicTacToe {
    private Player[] players = new Player[2];
    private Board board;

    public TicTacToe(int size, Player p1, Player p2 ) {
        board = new Board(size);
        players[0] = p1;
        players[1] = p2;
    }

    public void displayBoard() {
        board.displayBoard();
    }

    public boolean processMove(Player currPlayer, int x, int y) {

        if(board.move(currPlayer, x, y)) {
            System.out.println(currPlayer.getName() + " played move " + x + ", " + y);
            board.displayBoard();
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0; i<board.getSize(); i++) {
            if(board.slots[row][i] == null || board.slots[row][i].type != pieceType) {
                rowMatch = false;
            }
        }

        for(int i=0; i<board.getSize(); i++) {
            if(board.slots[i][col] == null || board.slots[i][col].type != pieceType) {
                colMatch = false;
            }
        }

        for(int i=0, j=0; i<board.getSize(); i++, j++) {
            if(board.slots[i][j] == null || board.slots[i][j].type != pieceType) {
                diagonalMatch = false;
            }
        }

        for(int i=0, j= board.getSize()-1; i<board.getSize(); i++, j--) {
            if(board.slots[i][j] == null || board.slots[i][j].type != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }

    public boolean freeCells() {
        return  board.freeCells();
    }

}
