package com.burningfire.designpattern.lessonone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Algorithm Assignment 1 Part 3:Fibonacci Series, gets last digit
 */
public class FibonacciLastDigit {

	private static final Logger LOGGER = LoggerFactory.getLogger(FibonacciLastDigit.class);
	private static List<Long> fib = new ArrayList<Long>();
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		// Initialize data
		fib.add(0, Long.valueOf(0));
		fib.add(1, Long.valueOf(0));
		fib.add(2, Long.valueOf(0));
		Long result = solveFibonacci(fib, scanner.nextInt());
		
		// Gets the last digit
		LOGGER.info("The last digit is: {}", result);
	}

	/**
	 * 
	 * @param fib
	 * @param nthTarget
	 * @return
	 */
	private static Long solveFibonacci(List<Long> fib, int nthTarget) {
		
		// Solves for the last digit
		for (int ctr = 0; ctr <= nthTarget; ctr++) {
			if (ctr <= 1) {
				fib.set(ctr, Long.valueOf(ctr));
			} else {
				
				// We are doing this so that we can save the data on a long
				fib.set(2, (fib.get(0) + (fib.get(1))) % 10);
				fib.set(0, fib.get(1));
				fib.set(1, fib.get(2));
			}
		}

		// Returns the result
		return fib.get(2);

	}
}
