package com.homemade.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.homemade.aop.Calculator;

/**
 * @author Naren
 * 
 */
public class CalculatorTest {
	private Calculator calc = null;

	public CalculatorTest() {
		calc = new Calculator();
	}

	@Before
	public void testSetup() {
		System.out.println("In setUp()");
	}

	@After
	public void testCleanup() {
		System.out.println("In tearDown()");
	}

	@Test
	public void addition() {
		System.out.println("Testing Calculator addition() method");
		int result = calc.add(5, 11);
		Assert.assertEquals(result, 16);
	}

	@Test
	public void subtraction() {
		System.out.println("Testing Calculator subtraction() method");
		int result = calc.sub(5, 11);
		Assert.assertEquals(result, -6);
	}

}
