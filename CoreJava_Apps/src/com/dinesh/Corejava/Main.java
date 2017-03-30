package com.dinesh.Corejava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(2, 4);
		ComplexNumber c2 = new ComplexNumber(3, 5);
		ComplexNumber sum = c1.sum(c2);
		ComplexNumber difference = c1.difference(c2);
		System.out.println("first complex number: " + c1);
		System.out.println("second complex number: " + c2);
		System.out.println("sum of two complex numbers: " + sum);
		System.out.println("difference of two complex numbers: " + difference);
	}
}
