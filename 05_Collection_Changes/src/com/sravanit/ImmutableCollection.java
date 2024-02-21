package com.sravanit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollection {

	public static void main(String[] args) {

		String s = "Sravan";
		s = "ABC";

		// Write a program to create immutable collection ?
		// Jan , Feb ..... Dec

		List<String> monthsList = new ArrayList<>();
		monthsList.add("Jan"); monthsList.add("Feb"); monthsList.add("Mar");
		monthsList.add("Apr"); monthsList.add("May"); monthsList.add("Jun");
		monthsList.add("Jul"); monthsList.add("Aug"); monthsList.add("Sep");
		monthsList.add("Oct"); monthsList.add("Nov"); monthsList.add("Dec");

		monthsList = Collections.unmodifiableList(monthsList);

		try {
			monthsList.add("test");
			monthsList.remove("Jan");
		} catch (Exception ex) {
			ex.printStackTrace();
			
		}

		System.out.println(monthsList);

		List<String> list = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

		list.remove("Jan");
		System.out.println(list);

	}

}
