package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {
    private int id = 1;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();


    Product(){
        id++;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency){
        id++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getDefaultPrice(){
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice){
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency(){
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency){
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory(){
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory){
        this.productCategory = productCategory;
    }

    public Supplier getSupplier(){
        return supplier;
    }

    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }


    public static List<Product> getAllProductsBy(ProductCategory productCategory){
        List<Product> toReturn = new ArrayList<>();
        for (Product product: productList) {
            if(product.getProductCategory().equals(productCategory)){
                toReturn.add(product);
            }
        }
        return toReturn;
    }

    public static List<Product> getAllProductsBy(Supplier supplier){
        List<Product> toReturn = new ArrayList<>();
        for (Product product: productList) {
            if(product.getSupplier().equals(supplier)){
                toReturn.add(product);
            }
        }
        return toReturn;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("id:" + getId()+",");
        sb.append("name:"+getName()+",");
        sb.append("defaultPrice:"+getDefaultPrice()+",");
        sb.append("defaultCurrency:"+getDefaultCurrency()+",");
        sb.append("productCategory:"+getProductCategory().getName()+",");
        sb.append("supplier:"+getSupplier().getName());

        return sb.toString();
    }
}
