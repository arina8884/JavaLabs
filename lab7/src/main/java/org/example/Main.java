package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println(" создание и вывод футбольных клубов  ");

        FootballClub club1 = new FootballClub("реал Мадрид", "Испания", 85);
        FootballClub club2 = new FootballClub("манчестер Сити", "Англия", 88);
        FootballClub club3 = new FootballClub("бавария", "Германия", 78);
        FootballClub club4 = new FootballClub("интер", "Италия", 81);
        FootballClub club5 = new FootballClub("ПСЖ", "Франция", 76);
        FootballClub club6 = new FootballClub("барселона", "Испания", 82);


        club1.printInfo();
        club2.printInfo();
        club3.printInfo();
        club4.printInfo();
        club5.printInfo();
        club6.printInfo();

        System.out.println("\n общая статистика (статические методы)");

        System.out.println("всего клубов: " + org.example.FootballClub.getTotalClubs());
        System.out.println("суммарно очков: " + FootballClub.getTotalPoints());
        System.out.printf("среднее количество очков: %.2f\n", FootballClub.getAveragePoints());
    }
}