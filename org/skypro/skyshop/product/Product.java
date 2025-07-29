package org.skypro.skyshop.product;

import org.skypro.skyshop.searchable.Searchable;

public abstract class  Product implements Searchable {
    private String nameProduct;

    public Product(String name){
    this.nameProduct = name;

    }

    public String getNameProduct(){

        return this.nameProduct;
    }

    public abstract int getPrice();

    public abstract String toString();

    public boolean isSpecial(){
        return false;
    }

    @Override
    public String searchTerm(){
        return getNameProduct();
    }

    @Override
    public String getContent(){
        return "PRODUCT";
    }




    @Override
    public String getName() {
        return nameProduct;
    }

}
