package com.java8.lambda;


/**
 * 
 * lambda expressions are nameless functions given as constant values, and
 * written exactly in the place where it’s needed, typically as a parameter to
 * some other function
 * 
 * 
 * Enable to treat functionality as a method argument, or code as data. A
 * function that can be created without belonging to any class. A lambda
 * expression can be passed around as if it was an object and executed on
 * demand.
 * 
 * 
 * Note that lambda expressions can only be used to implement functional
 * interfaces.
 * 
 * 
 */
public class LambdaExpression {
	public static void main(String[] args) {
		int width = 10;

// 		without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();

		Drawable d3 = () -> {
			System.out.println("i dont understand it");
		};
		d3.draw();
// 		with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();

// 		Lambda expression with single parameter.
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

// 		You can omit function parentheses
		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));

//		WITH OUT RETURN KEYWORD
		MathFuntion mul = (int a, int b) -> (a * b);
		System.out.println(mul.calculate(5, 2));

//		WITH RETURN KEYWORD
		MathFuntion sum = (int a, int b) -> {
			return a + b;
		};
		System.out.println(sum.calculate(5, 2));

	}
}

interface MathFuntion {
	public int calculate(int a, int b);
}

interface Drawable {
	public void draw();
}

interface Sayable {
	public String say(String name);
}

