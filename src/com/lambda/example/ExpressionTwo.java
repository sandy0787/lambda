package com.lambda.example;

public class ExpressionTwo {

	public static void main(String[] args) {

		Sayable saying = () -> System.out.println("I hav nothing to say");
		
		saying.say();
	}

}

interface Sayable {
	void say();
}
