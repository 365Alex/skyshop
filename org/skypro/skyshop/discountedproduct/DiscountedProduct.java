package org.skypro.skyshop.discountedproduct;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private int basPrice;
    private int discountPrice;

    public DiscountedProduct(String name, int basPrice, int discountPrice){
        super(name);
        this.basPrice = basPrice;
        this.discountPrice = discountPrice;
    }

    @Override
    public int getPrice(){
        discountPrice = basPrice - (basPrice * discountPrice/100);
        return discountPrice;
    }

    @Override
    public String toString(){
        return "Продукт: " + this.getName() +  " стоимость без скидки: " + this.basPrice + " руб." + " скидка: " + this.discountPrice + "%" + " стоимость со скидкой: " + this.getPrice() + " руб.";
    }

    @Override
    public boolean isSpecial(){
        return true;
    }
}
