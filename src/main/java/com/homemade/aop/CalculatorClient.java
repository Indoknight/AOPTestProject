package com.homemade.aop;

import org.apache.log4j.Logger;


public class CalculatorClient {
	
	private static final Logger LOGGER = Logger.getLogger(CalculatorClient.class);
	
	public static void main(String[] args){
		LOGGER.info("*************************************");
		LOGGER.info("In main()");
		Calculator cal = new Calculator();
		LOGGER.info("Adding 101 and 20 : "+cal.add(101, 20));		
	}
}
