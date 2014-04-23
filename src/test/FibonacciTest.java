package test;

import math.Fibonacci;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testFib() {
		assertEquals("Fibonacci(4) is 3", 3, Fibonacci.fib(4));
		assertEquals("Fibonacci(7) is 13", 13, Fibonacci.fib(7));
	}
}
