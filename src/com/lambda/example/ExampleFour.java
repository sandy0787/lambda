package com.lambda.example;

public class ExampleFour {
	
	public static void main(String[] args) {
		addable lambdaAdd = (a,b) ->(a+b);
		
		System.out.println(lambdaAdd.add(10, 20));
	}

}

interface addable{
	int add(int a,int b);
}
