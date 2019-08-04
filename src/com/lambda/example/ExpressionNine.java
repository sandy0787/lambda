package com.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNine {
	
	public static void main(String[] args) {	
	
	List<Product> list = new ArrayList<Product>();
	
	list.add(new Product(1, "Lappy", 23000));
	list.add(new Product(2, "T.V", 53000));
	list.add(new Product(3, "Mobile", 63000));
	
	list.stream().filter(p -> p.getPrice() > 30000)
	.forEach(p-> System.out.println(p));

}
}