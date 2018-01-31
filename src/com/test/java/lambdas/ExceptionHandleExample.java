package com.test.java.lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandleExample {

	public ExceptionHandleExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		int[] numbers = { 1, 4, 6, 9, 6 };
		int key = 0;

		process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : numbers) {
			consumer.accept(i, key);
		}

	}
	
	// this can be improve with generics.
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}catch(Exception e) {
				System.out.println("Exception in wrapper lambda");
			}
		};
	}

}
