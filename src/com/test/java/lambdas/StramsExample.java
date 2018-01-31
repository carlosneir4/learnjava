package com.test.java.lambdas;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.test.java.dto.ExampleObject;

public class StramsExample {

	public StramsExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<ExampleObject> transactions = Arrays.asList(new ExampleObject(1, "carlos", "test", 28),
				new ExampleObject(2, "pepe", "GROCERY", 14), new ExampleObject(3, "andres", "test", 48),
				new ExampleObject(4, "julian", "GROCERY", 8), new ExampleObject(5, "bryan", "test", 31),
				new ExampleObject(6, "echeverry", "GROCERY", 215));
		
		Long a = new Date().getTime();
		transactions.stream().forEach(p -> System.out.println(p.getName()));
		System.out.println(new Date().getTime() - a + "Miliseconds");
		
		Long b = new Date().getTime();
		transactions.parallelStream().forEach(p -> System.out.println(p.getName()));
		System.out.println(new Date().getTime() - b + "Miliseconds");
		
		Long bh = new Date().getTime();
		transactions.forEach(t -> System.out.println(t.getName()));
		System.out.println(new Date().getTime() - bh + "Miliseconds");

	}

}
