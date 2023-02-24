package com.luis.tdd.EjemploTdd;

public class Calc {	
	
	private int num1;
	private int num2;
	
	public Calc(int x, int y) {
		this.num1 = x;
		this.num2 = y;
	}
	public int sumar() {
		return num1+num2;
	}
	public int restar() {
		return num1-num2;
	}
	public int mult() {
		return num1*num2;
	}
	public int div() {
		return num1/num2;
	}
}
