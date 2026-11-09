
package org.example;
public class Main {
    public static void main(String[] args) {
        try {

            Shoe myShoe = new Shoe("Nike", 42, "белый", 300.0, 5);
            System.out.println("обувь бренда " + myShoe.getBrand() + " успешно создана");


            myShoe.sell(2);

            myShoe.sell(10);

        } catch (InvalidShoeDataException e) {
            System.out.println(" ошибка в данных обуви: " + e.getMessage());
        } catch (StockException e) {
            System.out.println(" ошибка склада: " + e.getMessage());
            System.out.println(" запрошено: " + e.getRequested() + ", доступно: " + e.getAvailable());
        } finally {
            System.out.println(" работа программы завершена");
        }
    }
}