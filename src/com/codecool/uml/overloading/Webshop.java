package com.codecool.uml.overloading;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

public class Webshop {

    public static void main(String[] args) {
        Currency c = Currency.getInstance("EUR");
	    Product dvd = new Product("DVD player", 2.18f, c);
	    Product gps = new Product("GPS", 10.0f, c);

	    ProductCategory mediaDevice = new ProductCategory("Media Device", "MEDIA", "Media for fun");
		ProductCategory milky = new FeaturedProductCategory();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = sdf.parse("2018-02-02");
			endDate = sdf.parse("2018-03-03");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		((FeaturedProductCategory) milky).schedule(startDate, endDate);

		milky.setName("Food with milk in it");
		milky.setDepartment("FOOD");
		milky.setDescription("EAT");

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
		System.out.println(milky.toString());
    }
}
