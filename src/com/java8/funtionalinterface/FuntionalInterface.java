package com.java8.funtionalinterface;

@FunctionalInterface
interface sayable {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FuntionalInterface implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FuntionalInterface fie = new FuntionalInterface();
		fie.say("Hello there");
	}
}

