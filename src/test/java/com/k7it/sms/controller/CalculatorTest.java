package com.k7it.sms.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void multiply() {
		Calculator calculator = new Calculator();
		assertEquals(70,calculator.multiply(7, 10));
	}
	
	@Test
	public void multiply1() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.multiply(8, 8)==64);
	}

}
