package org.example;


public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, String genre, double rating, String platform) {
        super(name, genre, rating);
        this.platform = platform;
    }

    public String getPlatform() { return platform; }

    @Override
    public String getDifficulty() {
        return "сложная";
    }

    public void play(int level, String mode) {
        System.out.println("играю в видеоигру " + getName() + " на уровне " + level + " в режиме " + mode + " на " + platform);
    }
}