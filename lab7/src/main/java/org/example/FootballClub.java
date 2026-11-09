package org.example;

public class FootballClub {

    private String name;
    private String country;
    private int points;

    private static int totalClubs = 0;
    private static int totalPoints = 0;


    public FootballClub(String name, String country, int points) {
        this.name = name;
        this.country = country;
        this.points = points;

        totalClubs++;
        totalPoints += points;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPoints() {
        return points;
    }

    public static int getTotalClubs() {
        return totalClubs;
    }

    public static int getTotalPoints() {
        return totalPoints;
    }
    public static double getAveragePoints() {
        if (totalClubs == 0) {
            return 0.0;
        }
        return (double) totalPoints / totalClubs;
    }


    public void printInfo() {
        System.out.printf(" клуб: %-15s | страна: %-10s | очки: %d\n", name, country, points);
    }
}