package org.skypro.skyshop;
import org.skypro.skyshop.discountedproduct.DiscountedProduct;
import org.skypro.skyshop.fixPriceproduct.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.simpleproduct.SimpleProduct;

import java.util.LinkedList;
import java.util.List;


public class App {
    public static void main(String[] args)  {

        System.out.println("Корзина №1");
        ProductBasket productBasket = new ProductBasket();
        DiscountedProduct cheese = new DiscountedProduct("сыр", 85, 10);
        FixPriceProduct productTwo = new FixPriceProduct("Печенье");
        SimpleProduct productTree = new SimpleProduct("молоко", 94);
        DiscountedProduct productFor = new DiscountedProduct("колбаса", 189, 15);
        SimpleProduct productFife = new SimpleProduct("макароны", 58);


        List<Product> products = new LinkedList<>();
        products.add(cheese);
        products.add(productTwo);
        products.add(productTree);
        products.add(productFor);
        products.add(productFife);
        System.out.println(products);
        productBasket.addProduct(cheese);
        productBasket.addProduct(productFife);
        productBasket.addProduct(productFor);
        productBasket.printDeletedProduct();
        System.out.println(productBasket.deleteNameProduct("сыр") + " такого продукта нет");
        productBasket.printDeletedProduct();



    }
}
