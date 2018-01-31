package com.test.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.test.java.dto.ExampleObject;

public class Unit1Exercise {

	public Unit1Exercise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<ExampleObject> transactions = Arrays.asList(new ExampleObject(1, "carlos", "test", 28),
				new ExampleObject(2, "pepe", "GROCERY", 14), new ExampleObject(3, "andres", "test", 48),
				new ExampleObject(4, "julian", "GROCERY", 8), new ExampleObject(5, "bryan", "test", 31),
				new ExampleObject(6, "echeverry", "GROCERY", 215));

		// sort by name Java 7
		Collections.sort(transactions, new Comparator<ExampleObject>() {
			@Override
			public int compare(ExampleObject s1, ExampleObject s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		// sort by name Java 8
		Collections.sort(transactions, (t1, t2) -> t1.getName().compareTo(t2.getName()));

		// create one method that print all element list Java 7
		printAll(transactions);
		// Print all elements that the length name to be > 4
		/*
		 * printConditional(transactions, "> 4", new Condition() {
		 * 
		 * @Override public boolean isTrue(ExampleObject transaction) { return
		 * transaction.getName().length() > 4; } });
		 */

		printConditional(transactions, "> 4", t -> t.getName().length() > 4);

		// Print all elements that the name start with the letter c java 7.
		/*
		 * printConditional(transactions, "Start with C", new Condition() {
		 * 
		 * @Override public boolean isTrue(ExampleObject transaction) { return
		 * transaction.getName().startsWith("c"); } });
		 */

		printConditional(transactions, "Start with C", t -> t.getName().startsWith("c"));

	}

	interface Condition {
		boolean isTrue(ExampleObject transaction);
	}

	public static void printAll(List<ExampleObject> transactions) {
		for (ExampleObject transaction : transactions) {
			System.out.println("transation : " + transaction.toString());
		}
	}

	// Predicate is a default functional interface of java this interface has by
	// default a test method that return a one boolean.
	public static void printConditional(List<ExampleObject> transactions, String Name,
			Predicate<ExampleObject> condition) {
		for (ExampleObject transaction : transactions) {
			if (condition.test(transaction)) {
				System.out.println("transation Conditional with : " + Name + " Tx:" + transaction.toString());
			}
		}
	}

}
