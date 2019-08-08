package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExampleForeachLoop {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("c++");
		list.add("android");
		list.add("kotlin");

		list.forEach((pLanguage) -> {
			System.out.println(pLanguage);
		});
	}

}
