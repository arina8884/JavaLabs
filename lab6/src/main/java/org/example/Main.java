package org.example;

public class Main {
    public static void main(String[] args) {

        Restaurant rest1 = new Restaurant("La Spezia", "Итальянская", 5);
        Restaurant rest2 = new Restaurant("У бабушки", "Домашняя", 3);


        System.out.println("ресторан: " + rest1.getName());
        System.out.println("кухня: " + rest1.getCuisine());
        System.out.println("рейтинг: " + rest1.getRating());
        System.out.println("Популярный? " + rest1.isPopular());

        System.out.println("");


        System.out.println("ресторан: " + rest2.getName());
        System.out.println("кухня: " + rest2.getCuisine());
        System.out.println("рейтинг: " + rest2.getRating());
        System.out.println("Популярный? " + rest2.isPopular());
    }
}