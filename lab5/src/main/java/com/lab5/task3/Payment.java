package com.lab5.task3;

public class Payment {
    private double amount;
    private PaymentMethod method;

    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void printInfo() {
        System.out.printf("платеж: %.2f BYN | способ: %s%n", amount, method);
    }
}