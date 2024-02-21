package com.sravanit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws Exception {
		
		FileInputStream inputStream = new FileInputStream(
				"D:\\MyWork\\Java9-WorkSpace\\02_Try-Resource-App\\src\\sample.txt");
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				Test t = new Test();
		
		try (inputStream;reader;t) { 		// java 9 changes here
			
			String st;
			while ((st = reader.readLine()) != null)
				System.out.println(st);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		/*try (FileInputStream inputStream = new FileInputStream(
				"D:\\MyWork\\Java9-WorkSpace\\02_Try-Resource-App\\src\\sample.txt");
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				Test t = new Test();) {

			String st;
			while ((st = reader.readLine()) != null)
				System.out.println(st);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}

}

class Test implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Test class close method");
	}

}