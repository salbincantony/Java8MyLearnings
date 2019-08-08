package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * 
 * Java 8 Comparator interface is a functional interface that contains only one
 * abstract method. We can use the Comparator interface as the assignment
 * target for a lambda expression or method reference
 */
public class LambdaExpressionWithComparator {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

//		Adding employees
		list.add(new Employee(1, "James", (float) 25000));
		list.add(new Employee(3, "sree", (float) 30000));
		list.add(new Employee(2, "Ram", (float) 15000));

		Collections.sort(list, (emp1, emp2) -> {
			return emp1.salary.compareTo(emp2.salary);
		});
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.salary);
		}

	}

}
