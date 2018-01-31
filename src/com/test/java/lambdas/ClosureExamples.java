package com.test.java.lambdas;

public class ClosureExamples {

	public ClosureExamples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		int i = 10;
		int b = 30;
		// The compiler take the variable b as final.
		doProcess(i, p -> System.out.println(p + b));
	}
	
	public static void doProcess (int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}
