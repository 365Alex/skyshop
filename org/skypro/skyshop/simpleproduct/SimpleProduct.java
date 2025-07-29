package org.skypro.skyshop.simpleproduct;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price){
        super(name);
        this.price = price;
    }


    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Продукт: " + this.getNameProduct() + " цена: " + this.price + " руб.";
    }

    public boolean isSpecial(){
        return false;
    }


}
