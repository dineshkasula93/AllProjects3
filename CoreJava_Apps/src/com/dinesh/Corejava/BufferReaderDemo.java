package com.dinesh.Corejava;

import java.io.*;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Entered Array size is:" + size);
		BufferedReaderEmployee arr[] = new BufferedReaderEmployee[5];

		for (int i = 0; i < size; i++) {
			System.out.println("Entered Id:");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter Name:");
			String name = br.readLine();

			arr[i] = new BufferedReaderEmployee(id, name);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
		}
	}
}