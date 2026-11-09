package org.example;

public class StockException extends Exception {
    private int requested;
    private int available;

    public StockException(String message, int requested, int available) {
        super(message);
        this.requested = requested;
        this.available = available;
    }

    public int getRequested() { return requested; }
    public int getAvailable() { return available; }
}