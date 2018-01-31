package com.test.java.lambdas;

public class Examples {
	
	// Receive one lambda or interface expresion and execute the method
	public void executeMethod(ILambdaSys lambda) {
		lambda.lambdaMethod();
	}

	public static void main(String args[]) {
	
	Examples example = new Examples();
	
    // The interface instance one class and the lambda instance one method.
	ILambdaSys systemOutFunction = () -> System.out.println("Hello word");
	LLambdaAdd addLambda = (a,b) -> a + b;
	ILambdaOne oneLambda = a -> a*2;
	
	//Anonimus Class create one class inside other class.
	ILambdaSys innerLambda = new ILambdaSys() {
		public void lambdaMethod() {
			System.out.println("Hello word");
		}
	};
	
	systemOutFunction.lambdaMethod();
	innerLambda.lambdaMethod();
	System.out.println((addLambda.lambdaMethod(7,8)));
	System.out.println((oneLambda.lambdaMethod(7)));
	
	example.executeMethod(systemOutFunction);
	example.executeMethod(innerLambda);

	
	
	}

}
