package org.example;

class Restaurant {

    private String name;
    private String cuisine;
    private int rating;


    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public int getRating() {
        return rating;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        }
    }


    public boolean isPopular() {
        return this.rating > 4;
    }
}

