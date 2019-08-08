package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.stream.Employee;
/**
 * 
 * Stream provides fast execution
 * Code is optimized and maintained
 * 
 */
public class FilteringCollectionByUsingStream {

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

		List<String> employeeNames = list.stream()
			.filter(employee -> employee.salary > 35000)   //filtering data by using stream
			.map(employee -> employee.name)
			.collect(Collectors.toList()); // add
		
		employeeNames.forEach(name -> System.out.println(name));

	}

}
