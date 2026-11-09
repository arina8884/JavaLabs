
package org.example;
abstract class Furniture {

    private String name;
    private String material;
    private double price;


    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }


    public void displayInfo() {
        System.out.println("Название: " + name + " | Материал: " + material + " | Цена: " + price + " руб.");
    }

    public abstract String getPurpose();
    public abstract String getDimensions();
}