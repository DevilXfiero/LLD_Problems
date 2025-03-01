package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private int size;
    public Piece[][] slots;

    public Board (int size) {
        this.size = size;
        slots = new Piece[size][size];
    }


    public boolean move(Player player, int x, int y) {
        Piece p = player.getPiece();

        if( (x>=0 && x<size) && (y>=0 && y<size) && slots[x][y] == null) {
            slots[x][y] = p;
            return true;
        }
        return false;
    }

    public boolean freeCells() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(slots[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void displayBoard() {
        for(int i=0; i< slots.length; i++) {
            for(int j=0; j< slots[i].length; j++) {
               Piece p = slots[i][j];
               if(p == null) {
                   System.out.print(" ");
               }
               else {
                   if(p.type == PieceType.O) {
                       System.out.print("O");
                   } else {
                       System.out.print("X");
                   }
               }
                System.out.print("  |");
            }
            System.out.println();
        }

    }
}
