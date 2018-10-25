package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {
    private int id = 1;
    private String name;
    private String department;
    private String description;

    ProductCategory(){
        id++;
    }

    ProductCategory(String name, String department, String description){
        id++;
        this.name = name;
        this.department = department;
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

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        sb.append("department:"+getDepartment()+",");
        sb.append("description:"+getDescription());

        return sb.toString();
    }
}
