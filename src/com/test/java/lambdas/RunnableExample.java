package com.test.java.lambdas;

public class RunnableExample {

	public RunnableExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String args[]) {
		// thread with anonimus class
		Thread a = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello Word");
			}	
		});
		a.run();	
		
		//Thread with lambda expression
		Thread lambdaThread = new Thread(() -> System.out.println("Thread with lambda"));
		lambdaThread.run();
	}
}
