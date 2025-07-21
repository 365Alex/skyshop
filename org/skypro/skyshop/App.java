package org.skypro.skyshop;
import org.skypro.skyshop.discountedproduct.DiscountedProduct;
import org.skypro.skyshop.fixPriceproduct.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.simpleproduct.SimpleProduct;


public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket(5);
        DiscountedProduct cheese = new DiscountedProduct("сыр", 85, 10);
        FixPriceProduct productTwo = new FixPriceProduct("Печенье");
        SimpleProduct productTree = new SimpleProduct("молоко", 94);
        DiscountedProduct productFor = new DiscountedProduct("колбаса", 189, 15);
        SimpleProduct productFife = new SimpleProduct("макароны", 58);


        productBasket.addProduct(cheese);
        productBasket.addProduct(productTwo);
        productBasket.addProduct(productTree);
        productBasket.addProduct(productFor);
        productBasket.addProduct(productFife);
        productBasket.printProductBasket();


        System.out.println();
        System.out.println(("Есть ли огурцы в корзине? " + productBasket.hasProduct("огурцы")));
        System.out.println(("Есть ли молоко в корзине? " + productBasket.hasProduct("молоко")));

        productBasket.clear();
        productBasket.printProductBasket();
    }
}
