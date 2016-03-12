package com.burningfire.designpattern.lessonone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Algorithm Assignment 1 Part 2:Fibonacci Series for Large Numbers
 *
 */
public class FibonacciLarge {

	private static final Logger LOGGER = LoggerFactory.getLogger(FibonacciLarge.class);
	
	private static List<BigDecimal> fib = new ArrayList<BigDecimal>();
	private static Scanner scanner;

	public static void main(String[] args) {
		
		// Initialize data
		fib.add(0, BigDecimal.valueOf(0));
		fib.add(1, BigDecimal.valueOf(0));
		fib.add(2, BigDecimal.valueOf(0));

		// Get input from user
		scanner = new Scanner(System.in);
		
		// Solve and display the result
		BigDecimal result = solveFibonacci(fib, scanner.nextInt());
		LOGGER.info("the result is: {}", result);
	}

	/**
	 * 
	 * @param fib
	 * @param nthTarget
	 * @return
	 */
	private static BigDecimal solveFibonacci(List<BigDecimal> fib, int nthTarget) {
		
		// Looping to get the fibonacci result
		// Uses only 3 container to save space on memory
		for (int ctr = 0; ctr <= nthTarget; ctr++) {
			if (ctr <= 1) {
				fib.set(ctr, BigDecimal.valueOf(ctr));
			} else {
				fib.set(2, fib.get(0).add(fib.get(1)));
				fib.set(0, fib.get(1));
				fib.set(1, fib.get(2));
			}
		}
	
		// Returns the result
		return fib.get(2);
	}
}
