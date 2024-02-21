package com.sravanit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithoutResource {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		BufferedReader reader = null;

		try {
			inputStream = new FileInputStream("D:\\MyWork\\Java9-WorkSpace\\02_Try-Resource-App\\src\\sample.txt");
			reader = new BufferedReader(new InputStreamReader(inputStream));
			String st;
			while ((st = reader.readLine()) != null)
				System.out.println(st);

		} catch (FileNotFoundException e) {
			System.out.println(" FileNotFoundException " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(" IOException " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
		}

	}

}
