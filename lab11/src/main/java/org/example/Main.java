package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(" демонстрация перегрузки ");
        Game basicGame = new Game("Обычная игра", "Аркада", 4.0);
        basicGame.play();
        basicGame.play(3);
        basicGame.play("сетевой");

        System.out.println();

        System.out.println(" демонстрация динамического полиморфизма ");
        Game game1 = new BoardGame("Монополия", "Настольная", 4.5, 2);
        Game game2 = new VideoGame("Cyberpunk 2077", "RPG", 4.8, "PC");

        System.out.println("Игра: " + game1.getName() + ", Сложность: " + game1.getDifficulty());
        System.out.println("Игра: " + game2.getName() + ", Сложность: " + game2.getDifficulty());

        if (game2 instanceof VideoGame) {
            VideoGame vg = (VideoGame) game2;
            vg.play(5, "хардкор");
        }
    }
}