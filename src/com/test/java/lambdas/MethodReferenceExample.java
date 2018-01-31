package com.test.java.lambdas;

public class MethodReferenceExample {

	public MethodReferenceExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	Thread t = new Thread(() -> printMessage("Hello") );
	 //	Thread t = new Thread(MethodReferenceExample::printMessage);
		t.run();
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
