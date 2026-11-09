
package org.example;

class Chair extends Furniture {
    private boolean backrest;

    public Chair(String name, String material, double price, boolean backrest) {
        super(name, material, price);
        this.backrest = backrest;
    }

    public boolean hasBackrest() { return backrest; }
    public void setBackrest(boolean backrest) { this.backrest = backrest; }

    @Override
    public String getPurpose() {
        return "Для сидения";
    }

    @Override
    public String getDimensions() {
        return "40x40x90 см";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("спинка: " + (backrest ? "есть" : "нет"));
    }
}