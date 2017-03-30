package com.dinesh.Corejava;

class ComplexNumber {
	private final double real;
	private final double imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public ComplexNumber sum(ComplexNumber other) {
		double r = this.real + other.real;
		double i = this.imaginary + other.imaginary;
		return new ComplexNumber(r, i);
	}

	public ComplexNumber difference(ComplexNumber other) {
		double r = this.real - other.real;
		double i = this.imaginary - other.imaginary;
		return new ComplexNumber(r, i);
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
}
