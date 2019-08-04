package com.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class ExampleFive {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Sandeep");
		list.add("Chanky");
		list.add("Nisha");
		
		//for loop without Lambda
		for(String name : list) {
			System.out.println(name);
		}
		
		//for loop with Lambda
		list.forEach((name) -> System.out.println(name));
		
	}

}
