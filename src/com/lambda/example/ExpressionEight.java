package com.lambda.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpressionEight  {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "Lappy", 23000));
		list.add(new Product(2, "T.V", 53000));
		list.add(new Product(3, "Mobile", 63000));
		
		//Sorting on the basis of name...
		
		Collections.sort(list, (p1,p2) -> p1.getName().compareTo(p2.getName()));
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}

class Product{
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
