package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("DevilXfiero", true, false);
        Player p2 = new Player("Magnus Carlsen", true, true);

        Game game = new Game(p1, p2);
        Player currPlayer = p1;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter start spot:");
            String start = scanner.next();
            if (start.equals("q")) {
                System.out.println("GAME OVER");
                System.out.println("-----------------------------------------------");
                break;
            } else if (start.equals("u")) {
                continue;
            }

            System.out.println("Please enter end spot:");
            String end = scanner.next();
            if (end.equals("q")) {
                System.out.println("GAME OVER");
                System.out.println("-----------------------------------------------");
                break;
            }

            if (game.processMove(currPlayer, start, end)) {
                if (currPlayer == p1)
                    currPlayer = p2;
                else
                    currPlayer = p1;
                System.out.println("It is " + currPlayer.getName() + "'s turn now");
            }
        }


    }
}