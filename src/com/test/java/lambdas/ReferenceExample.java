package com.test.java.lambdas;

public class ReferenceExample {

	public ReferenceExample() {
		// TODO Auto-generated constructor stub
	}

	public void execute(int i) {
		doProcess(i, l -> {
			System.out.println(this); // this works because is not in static block code.
		});
	}

	public static void main(String[] args) {
		int i = 10;
		int b = 30;
		ReferenceExample reference = new ReferenceExample();
		// The compiler take the variable b as final.
		doProcess(i, p -> {
			System.out.println(p + b);
			// System.out.println(this); this will not work because lambda doesn't have
			// reference to the class
		});
		reference.execute(i);
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
	
	@Override
	public String toString() {
		return "Reference to this Object class";
	}
}
