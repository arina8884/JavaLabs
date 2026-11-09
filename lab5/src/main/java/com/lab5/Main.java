package com.lab5;


import com.lab5.task1.Ticket;
import com.lab5.task2.Airplane;
import com.lab5.task3.Payment;
import com.lab5.task3.PaymentMethod;

public class Main {
    public static void main(String[] args) {

        System.out.println(" задание 1 ");

        Ticket ticket = new Ticket("концерт", 12, 100.0);

        System.out.print("исходная цена: ");
        ticket.printInfo();

        ticket.applyDiscount(20);
        System.out.print("после применения скидки 20%: ");
        ticket.printInfo();


        System.out.println("\n задание 2 -массив самолетов");

        Airplane[] fleet = {
                new Airplane("Boeing 737", 180, 5600),
                new Airplane("Airbus A380", 853, 15200),
                new Airplane("Embraer E190", 114, 4500),
                new Airplane("Boeing 777", 396, 15800),
                new Airplane("ATR 72", 78, 1500),
                new Airplane("Airbus A320", 180, 6100)
        };

        Airplane maxCapacityPlane = fleet[0];
        Airplane maxRangePlane = fleet[0];
        for (int i = 1; i < fleet.length; i++) {

            if (fleet[i].getCapacity() > maxCapacityPlane.getCapacity()) {
                maxCapacityPlane = fleet[i];
            }

            if (fleet[i].getRange() > maxRangePlane.getRange()) {
                maxRangePlane = fleet[i];
            }
        }

        System.out.print("максимальная вместимость: ");
        maxCapacityPlane.printInfo();

        System.out.print("максимальная дальность: ");
        maxRangePlane.printInfo();


        System.out.println("\n задание 3 ");

        Payment[] payments = {
                new Payment(150.50, PaymentMethod.CARD),
                new Payment(40.00, PaymentMethod.CASH),
                new Payment(890.00, PaymentMethod.CARD),
                new Payment(1200.00, PaymentMethod.CRYPTO),
                new Payment(300.25, PaymentMethod.TRANSFER)
        };

        System.out.println("список платежей, совершённых банковской картой (CARD):");

        for (Payment p : payments) {

            if (p.getMethod() == PaymentMethod.CARD) {
                p.printInfo();
            }
        }
    }
}