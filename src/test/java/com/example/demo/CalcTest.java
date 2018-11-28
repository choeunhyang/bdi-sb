package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.util.Calc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalcTest {
	
	@Autowired
	private Calc calc;
	
	@Test
	public void addTest() {
		int result = calc.add(5, 5);
		assertEquals(10,	result);
	}
	
	@Test
	public void minusTest() {
		int result = calc.add(5, 5);
		assertEquals(0,	result);
	}
	
	@Test
	public void multiplyTest() {
		int result = calc.add(5, 5);
		assertEquals(25, result);
	}
	
	@Test
	public void divisionTest() {
		int result = calc.add(5, 5);
		assertEquals(1,	result);
	}
}
