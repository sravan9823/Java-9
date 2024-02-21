package com.sravanit;

public interface TestInterface {

	public void test();

	default void m1() {
		reUsable();
		System.out.println("default method m1() in TestInterface");
	}

	default void m2() {
		reUsable();
		System.out.println("default method m2() in TestInterface");
	}

	static void m3() {
		staticReUsable();
		System.out.println("static method m3() in TestInterface");
	}

	static void m4() {
		staticReUsable();
		System.out.println("static method m4() in TestInterface");
	}

	private void reUsable() {
		// common code or DB code
		System.out.println("Common code which use acrror default methods");
	}

	private static void staticReUsable() {
		// common code or DB code
		System.out.println("Common code which use acrror default methods");
	}
}
