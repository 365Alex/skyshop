package org.skypro.skyshop;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;


public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket(5);
        Product cheese = new Product("сыр", 85);
        Product productTwo = new Product("Печенье", 64);
        Product productTree = new Product("молоко", 94);
        Product productFor = new Product("колбаса", 189);
        Product productFife = new Product("макароны", 58);


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
