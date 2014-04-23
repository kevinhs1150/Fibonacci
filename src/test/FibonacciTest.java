package test;

import math.Fibonacci;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testFib() {
		org.junit.Assert.assertEquals("Fibonacci(4) is 3", 3, Fibonacci.fib(4));
		org.junit.Assert.assertEquals("Fibonacci(7) is 13", 13, Fibonacci.fib(7));
	}
}
