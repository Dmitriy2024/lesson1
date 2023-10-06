package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public Chocolate getChocolate(double weight, int cocoa){
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getWeight() == weight && chocolate.getCocoa() == cocoa){
                    return chocolate;
                }
            }
        }
        return null;
    }

}
