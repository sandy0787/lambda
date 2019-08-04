package com.lambda.example;

public class ExpressionOne {

	public static void main(String[] args) {
		
		int width = 10;
		
		Drawable drawable1 = () -> System.out.println("Drawing" + width);
		
		Drawable drawable = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing" + width);
			}
		};
		
		drawable.draw();
		drawable1.draw();
		
	}

}

interface Drawable{
	void draw();
}
