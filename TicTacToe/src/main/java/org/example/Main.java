package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("DevilXfiero", new PieceO());
        Player p2 = new Player("Harshita", new PieceX());
        TicTacToe ticTacToe = new TicTacToe(3, p1, p2);

        Player currPlayer = p1;
        ticTacToe.displayBoard();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(currPlayer.getName() + " turn");
            System.out.println("Please enter spot to move");

            String move = scanner.next();

            String[] values = move.split(",");
            int x = Integer.valueOf(values[0]);
            int y = Integer.valueOf(values[1]);

            if(ticTacToe.freeCells()){
                if (ticTacToe.processMove(currPlayer, x, y)) {
                    if(ticTacToe.checkWinner(x, y, currPlayer.getPiece().getType())) {
                        System.out.println(currPlayer.getName() + " won the game!!!");
                        break;
                    }
                    if (currPlayer == p1) {
                        currPlayer = p2;
                    } else {
                        currPlayer = p1;
                    }
                } else {
                    System.out.println("Invalid move, Please enter correct move again");
                    continue;
                }
            } else {
                System.out.println("Game tied");
                break;
            }
        }
    }
}