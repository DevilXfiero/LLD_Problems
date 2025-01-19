package org.example;

public class Player {
    private String name;
    private boolean isHuman;
    private boolean isCurrPlayer;
    private boolean isWhite;

    public Player(String name, boolean isHuman, boolean pIsWhite) {
        this.name = name;
        this.isHuman = isHuman;
        this.isWhite = pIsWhite;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return isWhite;
    }
}
