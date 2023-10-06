package ru.geekbrains.lesson1;
public class Chocolate extends Product {

    private double weight; //  Вес
    private int cocoa; // Содержание какао

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCocoa() {
        return cocoa;
    }

    public void setCocoa(int fat) {
        this.cocoa = cocoa;
    }

    public Chocolate(String brand, String name, double price, double weight, int cocoa){
        super(brand, name, price);
        this.weight = weight;
        this.cocoa = cocoa;
    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - вес: %.2f; Содержание какао: %d", brand, name, price, weight, cocoa);
    }
}
