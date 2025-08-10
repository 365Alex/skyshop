package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private final List products;
    private int size;

    public ProductBasket() {
        this.products = new LinkedList<Product>();
        size = 0;
    }

    public List getProducts() {
        return products;
    }

    public int getSize() {
        return size;
    }

    public void addProduct(Product product){
        if (product != null) {
            products.add(product);
        } else {
            System.out.println("Нельзя добавить null продукт");
        }
    }

    public List<Product> deleteNameProduct(String name){
        List<Product> deleteProduct = new LinkedList<>();
        Iterator iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            if (product.getName().equalsIgnoreCase(name)){
                deleteProduct.add(product);
                iterator.remove();

            }
        }
        return deleteProduct;
    }

    public void printDeletedProduct() {


        Iterator iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println(product);
        }
    }
    public int getTotalPrice(){
        int total = 0;
        if (!products.isEmpty()){
            total++;
        }
        return total;
    }


    public void printProductBasket(){
        if (products.isEmpty()) {
            System.out.println("Корзина пуста!!!");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(products.toString());
        }

        int specialCount = 0;
        for (int i = 0; i < size; i++) {
            if (product.isSpecial()){
                specialCount ++;
            }
        }

        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Количество специальных товаров: " + specialCount);
    }

    public boolean hasProduct(String name) {
        for (Product product : products) {
            if (product.getNameProduct().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                size = 0;
            }
        }
    }
}
