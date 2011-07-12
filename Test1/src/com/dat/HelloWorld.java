package com.dat;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("test"); 
		HelloWorld hello = new HelloWorld();
		hello.test("bebe");

	}
	
	public void test(String str) {
		System.out.println("show text: " + str);
	}

	public void showMessage() {
		System.out.println("alo1");
	}
}
