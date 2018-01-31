/**
 * 
 */
package com.test.java.stream;

import java.util.ArrayList;
import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.java.dto.Drones;
import com.test.java.dto.ExampleObject;

/**
 * @author Admin
 *
 */
public class TestStream {

	/**
	 * 
	 */
	public TestStream() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<ExampleObject> transactions = new ArrayList<ExampleObject>();
		ExampleObject a = new ExampleObject(1,"carlos","test",28);
		ExampleObject b = new ExampleObject(2,"pepe","GROCERY",14);
		ExampleObject c = new ExampleObject(3,"andres","test",48);
		ExampleObject d = new ExampleObject(4,"julian","GROCERY",8);
		ExampleObject e = new ExampleObject(5,"bryan","test",31);
		ExampleObject f = new ExampleObject(6,"echeverry","GROCERY",215);
		
		transactions.add(a);
		transactions.add(b);
		transactions.add(c);
		transactions.add(d);
		transactions.add(e);
		transactions.add(f);
		
		getListId(transactions);

	}
	
	public static void getListId(List<ExampleObject> transactions) {
		
		List<Long> transactionsIds = 
				transactions.stream()   
				.filter(t -> t.getType() == "GROCERY")   
				.sorted(Comparator.comparingInt(ExampleObject::getEdad).reversed())   
				.map(ExampleObject::getId)   
				.collect(Collectors.toList());
		System.out.println(transactionsIds);
		
	}

	public static void getTrips(List<Drones> drones, int maxWeight, List<Integer> ids) {
		
	/*	drones.stream().filter(t -> !ids.contains(t.getId()))
		.sorted(Comparator.comparingInt(Drones::getWeight))
		.map(t -> t.getWeight())
		.forEach((a,b) -> (a + b) < maxWeight);*/
	
	}


}
