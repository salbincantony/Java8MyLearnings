package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaWithFilterCollectionData {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

//		Adding employees
		list.add(new Employee(1, "James", (float) 25000));
		list.add(new Employee(3, "sree", (float) 39000));
		list.add(new Employee(2, "Ram", (float) 15000));
		list.add(new Employee(4, "Paul", (float) 15000));
		list.add(new Employee(5, "Chakko", (float) 35000));
		list.add(new Employee(6, "Bala", (float) 55000));
		list.add(new Employee(7, "Alee", (float) 75000));

//      using lambda to iterate through collection :not sorted	

		System.out.println("------------------employees list as follows-------------------");
		list.forEach(employee -> System.out.println(employee.name + ": " + employee.salary));
		System.out.println("-------------------using lambda to filter data---------------------");

//      using lambda to iterate through collection
		list.stream().filter(employee -> employee.salary > 35000)
//		 using lambda to filter data	
				.forEach(employee -> System.out.println(employee.name + ": " + employee.salary));
		
		
		System.out.println("-------------------using lambda name ");
		list.stream().filter(employee -> employee.salary > 35000)
		.map(emp -> emp.name)
		.forEach(name -> System.out.println(name));

	}
	
}
