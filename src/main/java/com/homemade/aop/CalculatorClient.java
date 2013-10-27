package com.homemade.aop;

public class CalculatorClient {
	public static void main(String[] args){
		System.out.println("In main()");
		Calculator cal = new Calculator();
		System.out.println("Adding 101 and 20 : "+cal.add(101, 20));		
	}
}
