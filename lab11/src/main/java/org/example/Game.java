package org.example;

public class Game {
    protected String name;
    protected String genre;
    protected double rating;


    public Game(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }

    public void play() {
        System.out.println("Играю");
    }

    public void play(int level) {
        System.out.println("Играю на уровне " + level);
    }

    public void play(String mode) {
        System.out.println("Играю в режиме " + mode);
    }

    public String getDifficulty() {
        return "средняя";
    }
}