package org.example;

public class BoardGame extends Game {
    private int minPlayers;

    public BoardGame(String name, String genre, double rating, int minPlayers) {
        super(name, genre, rating);
        this.minPlayers = minPlayers;
    }

    public int getMinPlayers() { return minPlayers; }

    @Override
    public String getDifficulty() {
        return "Легкая";
    }
}