package com.sravanit;

public class InterfaceChanges implements TestInterface {

	public static void main(String[] args) {

		InterfaceChanges ic = new InterfaceChanges();

		ic.m1();
		ic.m2();

		TestInterface.m3();
		TestInterface.m4();

		// ic.reUsable();

		// TestInterface.staticReUsable();
	}

	@Override
	public void test() {
		System.out.println("overriding test() method in InterfaceChanges class");
	}

	/*@Override
	public void reUsable() {
	}

	@Override
	private static void staticReUsable() {
	} */

}
