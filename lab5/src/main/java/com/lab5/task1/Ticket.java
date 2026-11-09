package com.lab5.task1;

public class Ticket {

    private String event;
    private int seatNumber;
    private double price;




    public  int   getSeatNumber() {
        return seatNumber;}

    public void  setSeatNumber(int seatNumber) {
        if(seatNumber>0){
            this.seatNumber= seatNumber;}}




    public Ticket(String event, int seatNumber, double price) {

        this.event = event;
        setSeatNumber(seatNumber);     
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            this.price -= this.price * (discountPercentage / 100.0);
        }
    }

    public void printInfo() {
        System.out.printf("билет на '%s'  место: %d цена: %.2f руб.%n",
                event, seatNumber, price);
    }
}