
package com.burningfire.designpattern.lessonone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Algorithm Assignment 1 Part 4:Fibonacci Series, get last digit
 *
 */
public class FibonacciLastDigitLarge {

	private static final Logger LOGGER = LoggerFactory.getLogger(FibonacciLastDigitLarge.class);
	private static List<Long> fib = new ArrayList<Long>();
	private static Long result;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		// Initialize data
		fib.add(0, Long.valueOf(0));
		fib.add(1, Long.valueOf(0));
		fib.add(2, Long.valueOf(0));
		
		// Solve for the result
		result = solveFibonacci(fib, scanner.nextLong(), scanner.nextInt());

		// Gets the last digit
		LOGGER.info("The last digit is: {}", result);
	}

	/**
	 * 
	 * @param fib
	 * @param nthTarget
	 * @param mod
	 * @return
	 */
	private static Long solveFibonacci(List<Long> fib, long nthTarget, int mod) {
		int pisanoCycle = 0;

		// Solve for the pisano cycle by detecting a 0 and 1 values that comes
		// consecutively
		for (long ctr = 0; ctr <= Long.MAX_VALUE; ctr++) {
			if (ctr > 1) {
				if (fib.get(0) % mod == 0 && fib.get(1) % mod == 1 && pisanoCycle > 0) {
					break;
				} else {
					fib.set(2, (fib.get(0) + (fib.get(1))) % mod);
					fib.set(0, fib.get(1));
					fib.set(1, fib.get(2));
				}
				pisanoCycle++;
			} else {
				fib.set((int) ctr, Long.valueOf(ctr));
			}
		}

		// Reset values
		fib.set(0, Long.valueOf(0));
		fib.set(1, Long.valueOf(0));
		fib.set(2, Long.valueOf(0));

		// Get the Last digit using the value from pisano cycle
		for (long ctr = 0; ctr <= nthTarget % pisanoCycle; ctr++) {
			if (ctr <= 1) {
				fib.set((int) ctr, Long.valueOf(ctr));
			} else {
				fib.set(2, (fib.get(0) + (fib.get(1))) % mod);
				fib.set(0, fib.get(1));
				fib.set(1, fib.get(2));
			}
		}
		return fib.get(1);
	}
}
