package com.nashtech.java11;


public class LambdaEnhancement {

	public static void main(String args[]) {
		beforeJava11();
		fromJava11();
	}

	private static void beforeJava11() {
		final AddInterface1 addInterface1 = (a, b) -> (a + b);
		final int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("Before Java 11 - Sum of two Numbers: " + sum);

	}

	private static void fromJava11() {
		final AddInterface1 addInterface1 = (var a, var b) -> (a + b);
		final int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("From Java 11 - Sum of two Numbers: " + sum);
	}

}

interface AddInterface1 {
	public int addTwoNumbers(int a, int b);
}