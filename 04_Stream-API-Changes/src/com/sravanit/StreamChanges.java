package com.sravanit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamChanges {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 45, 70, 85, 90, 100);

		list.stream().limit(2).forEach(num -> System.out.println(num)); // 10,20

		list.stream().skip(2).forEach(num -> System.out.println(num)); // 30,45,70,85,90,100

		System.out.println("take While op ");
		list.stream().takeWhile(num -> num % 2 == 0).forEach(num -> System.out.println(num)); // 10,20,30 it will print after 45 remaining

		list.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.println(num)); // 10,20,30,70,90,100

		System.out.println("drop While op ");
		list.stream().dropWhile(num -> num % 2 == 0).forEach(num -> System.out.println(num)); // 45,70,85,90,100

		System.out.println("====================");
		// 1
		// 10
		// 100
		// 1000
		// 10000
		for (int i = 1; i <= 10000; i = i * 10) {
			System.out.println(i);
		}

		System.out.println("Iterate output");

		Stream.iterate(1, j -> j <= 10000, j -> j * 10).forEach(num -> System.out.println(num));

		Stream<Object> ofNullable = Stream.ofNullable(null);

	}

}
