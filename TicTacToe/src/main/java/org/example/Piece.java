package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Piece {
    PieceType type;

    public Piece(PieceType type) {
        this.type = type;
    }

}
