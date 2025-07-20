package org.skypro.skyshop.discountedproduct;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int percent;
    private  int discount;

    public DiscountedProduct(String name, int basPrice, int percent){
        super(name);
        this.basePrice = basPrice;
        this.percent = percent;

    }

    @Override
    public int getPrice(){
        discount = basePrice - (basePrice * percent /100);
        return discount;
    }

    @Override
    public String toString(){
        return "Продукт: " + this.getName() +  " стоимость без скидки: " + this.basePrice + " руб." + " скидка: " + this.percent + "%" + " цена со скидкой: " + this.getPrice() + " руб.";
    }

    @Override
    public boolean isSpecial(){
        return true;
    }
}
