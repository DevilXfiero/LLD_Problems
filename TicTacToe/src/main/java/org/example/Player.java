package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class Player {
    private String id;
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.piece = piece;
    }
}
