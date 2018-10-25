package com.codecool.uml.overloading;

import java.util.Currency;

public class Webshop {

    public static void main(String[] args) {
        Currency c = Currency.getInstance("EUR");
	    Product dvd = new Product("DVD player", 2.18f, c);
	    Product gps = new Product("GPS", 10.0f, c);

	    ProductCategory mediaDevice = new ProductCategory("Media Device", "MEDIA", "Media for fun");

	    Supplier tesco = new Supplier("TESCO", "Egy fos");

	    dvd.setProductCategory(mediaDevice);
	    dvd.setSupplier(tesco);

	    gps.setProductCategory(mediaDevice);
		gps.setSupplier(tesco);

	    System.out.println(tesco.getProducts().toString());
		System.out.println(mediaDevice.getProducts().toString());
	    System.out.println(dvd.toString());
		System.out.println(gps.toString());
		System.out.println(mediaDevice.toString());
		System.out.println(tesco.toString());
    }
}
