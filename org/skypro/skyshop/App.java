package org.skypro.skyshop;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.discountedproduct.DiscountedProduct;
import org.skypro.skyshop.fixPriceproduct.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.searchengine.SearchEngine;
import org.skypro.skyshop.simpleproduct.SimpleProduct;

import java.util.Arrays;



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


        ProductBasket productBasketOne = new ProductBasket(5);
        SimpleProduct bread = new SimpleProduct("хлеб", 30);
        SimpleProduct tea = new SimpleProduct("чай чёрный", 75);
        DiscountedProduct candies = new DiscountedProduct("чай с бергамотом", 89, 10);
        DiscountedProduct coffee  = new DiscountedProduct("Кофе", 275, 20);

        productBasketOne.addProduct(bread);
        productBasketOne.addProduct(tea);
        productBasketOne.addProduct(candies);
        productBasketOne.addProduct(coffee);
        productBasketOne.printProductBasket();

        SearchEngine searchEngine = new SearchEngine(5);

        searchEngine.add(bread);
        searchEngine.add(tea);
        searchEngine.add(candies);

        Article articleOne = new Article("Новинки автомобилей", "Топ 5 автомобилей 2025");
        Article articleTwo = new Article("Рецепт вкусных блинчиков", "Топ 10 рецептов блинчиков");

        searchEngine.add(articleOne);
        searchEngine.add(articleTwo);

        System.out.println(Arrays.toString(searchEngine.search("чай")));
        System.out.println(Arrays.toString(searchEngine.search("Новинки")));
    }
}
