package com.sravanit;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorChanges {

	public static void main(String[] args) {

		//List<Integer> list = new ArrayList<Integer>();	//1.5
		//List<Integer> list = new ArrayList<>(); // 1.7
		
		List<Integer> list = new ArrayList<>();

		list.add(10);
		// list.add("sravan");
		// list.add(10.983); // type safety issue
		
		//DiamondOperator<String> do1 = new DiamondOperator<String>() 	//1.8
		//DiamondOperator<String> do1 = new DiamondOperator<>() 	//1.9

		DiamondOperator<String> do1 = new DiamondOperator<>() {
			@Override
			public void validate(String str) {
				System.out.println(" DiamondOperator validate() " + str);
			}
		};
		
		do1.validate("Sravan");

	}

}

abstract class DiamondOperator<T> {

	public abstract void validate(T t);
}