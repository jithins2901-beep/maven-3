package com.example; 

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
class Gradectest { 
	@Test
	void testTotal() { 
		assertEquals(235, Gradec.calculateTotal(75, 68, 82)); 
	} 
	@Test 
	void testAverage() { 
		assertEquals(65.0, Gradec.calculateAverage(75, 68, 82)); 
	} 
	@Test
	void testPass() { 
		assertTrue(Gradec.isPass(75.0)); 
	} 
	@Test
	void testFail() { 
		assertFalse(Gradec.isPass(35.0)); 
	}
} 