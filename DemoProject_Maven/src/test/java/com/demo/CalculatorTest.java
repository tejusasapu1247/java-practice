package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private Calculator Calculator;
	
	@Before
	public void setUp() throws Exception {
		Calculator=new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(4, Calculator.add(2, 2));
		System.out.println("test1");
	}
	@Test
	public void testMultiply() {
		assertEquals(4, Calculator.multiply(2, 2));
		System.out.println("test1");
	}

	
	public void testDivideWithException() {
		assertEquals(0,Calculator.divide(4, 0));
		
	}
	@After
	public void tearDown() {
		Calculator=null;
	}

}
