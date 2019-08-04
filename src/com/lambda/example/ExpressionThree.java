package com.lambda.example;

public class ExpressionThree {
	
	public static void main(String[] args) {
		
        // Lambda expression with single parameter.  
		SayableOne sayName1 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(sayName1.say("Sandeep"));
		
		//We can remove return and parenthesis(parenthesis for a single line code).
		SayableOne sayName2 = (name) -> "Hello " + name;
		
		System.out.println(sayName2.say("Sandeep"));
	}

}

interface SayableOne{
	public String say(String name);
}
