package org.skypro.skyshop.product;

public abstract class  Product {
    private String name;

    public Product(String name){
    this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public abstract int getPrice();

    public abstract String toString();

    public boolean isSpecial(){
        return false;
    }

}
