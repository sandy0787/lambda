package com.lambda.example;

public class ExpressionSix {
	
	public static void main(String[] args) {
		
		SayableOne lambadaSay = (name) -> {
			String s1 = "You are amazing";
			String s2 = name + s1;
			return s2;
		};
		
		System.out.println(lambadaSay.say("Man"));
	}

}
