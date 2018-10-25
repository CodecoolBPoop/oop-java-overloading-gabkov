package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private int id = 1;
    private String name;
    private String description;

    Supplier(){
        id++;
    }

    Supplier(String name, String description){
        id++;
        this.name = name;
        this.description = description;
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

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts(){
        return Product.getAllProductsBy(this);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("id:" + getId()+",");
        sb.append("name:"+getName()+",");
        sb.append("description:"+getDescription());

        return sb.toString();
    }
}
