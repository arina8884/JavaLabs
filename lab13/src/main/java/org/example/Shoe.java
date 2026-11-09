
package org.example;
public class Shoe {
    private String brand;
    private int size;
    private String color;
    private double price;
    private int stock;


    public Shoe(String brand, int size, String color, double price, int stock) throws InvalidShoeDataException {
        if (size < 20 || size > 50) {

            throw new InvalidShoeDataException("недопустимый размер: " + size + ". должен быть от 20 до 50");
        }
        if (price <= 0) {
            throw new InvalidShoeDataException("цена должна быть больше нуля!");
        }
        if (stock < 0) {
            throw new InvalidShoeDataException("количество на складе не может быть отрицательным!");
        }

        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int quantity) throws StockException, InvalidShoeDataException {
        if (quantity <= 0) {
            throw new InvalidShoeDataException("количество для продажи должно быть больше нуля!");
        }
        if (quantity > stock) {
            throw new StockException("недостаточно товара на складе!", quantity, stock);
        }
        stock -= quantity;
        System.out.println("успешно продано пар: " + quantity + ". остаток на складе: " + stock);
    }

    public void restock(int quantity) throws InvalidShoeDataException {
        if (quantity <= 0) {
            throw new InvalidShoeDataException(" колво для пополнения должно быть больше нуля!");
        }
        stock += quantity;
        System.out.println("склад пополнен на " + quantity + ". Всего на складе: " + stock);
    }


    public String getBrand() { return brand; }
    public int getStock() { return stock; }
}