package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private final Product[] products;
    private int size;

    public ProductBasket(int basket) {
        products = new Product[basket];
        size = 0;
    }


    public void addProduct(Product product) {

        if (size < products.length) {
            products[size] = product;
            size++;
        } else  if (size > products.length){
            System.out.println("Корзина заполнена");
        }
    }

    public int getTotalPrice(){
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice();
        }
        return total;
    }



    public void printProductBasket(){
            if (size == 0){
                System.out.println("В корзине пусто");
            }
        for (Product productBasket: products) {
            if (productBasket != null){
                System.out.println(productBasket.getName() + ": " + productBasket.getPrice());
            }

        }
        System.out.println("Итого: " + getTotalPrice());
    }

    public boolean hasProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(products, null);
    }
}
