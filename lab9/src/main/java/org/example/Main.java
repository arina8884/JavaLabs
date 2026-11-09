
package org.example;
public class Main {
    public static void main(String[] args) {

        Furniture[] items = new Furniture[5];
        items[0] = new Table("офисный стол", "ДСП", 250.0, 4);
        items[1] = new Table("обеденный стол", "Дуб", 500.0, 4);
        items[2] = new Table("журнальный столик", "Стекло", 180.0, 3);
        items[3] = new Chair("кухонный стул", "Дерево", 80.0, true);
        items[4] = new Chair("барный табурет", "Металл", 120.0, false);

        System.out.println(" информация о мебели и размеры ");

        for (Furniture item : items) {
            item.displayInfo();
            System.out.println("назначение: " + item.getPurpose());
            System.out.println("размеры: " + item.getDimensions());
            System.out.println("    ");
        }
    }
}