package com.burningfire.designpattern.lessonone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Algorithm Assignment 1 Part 2:Fibonacci Series for Large Numbers
 *
 */
public class FibonacciLarge {

	private static List<BigDecimal> fib = new ArrayList<BigDecimal>();
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		fib.add(0, BigDecimal.valueOf(0));
		fib.add(1, BigDecimal.valueOf(0));
		fib.add(2, BigDecimal.valueOf(0));
		BigDecimal result = solveFibonacci(fib, scanner.nextInt());
		// System.out.println(result);
	}

	private static BigDecimal solveFibonacci(List<BigDecimal> fib, int nthTarget) {
		for (int ctr = 0; ctr <= nthTarget; ctr++) {
			if (ctr <= 1) {
				fib.set(ctr, BigDecimal.valueOf(ctr));
			} else {
				fib.set(2, fib.get(0).add(fib.get(1)));
				fib.set(0, fib.get(1));
				fib.set(1, fib.get(2));
			}
		}
		System.out.println((fib.get(2).remainder(BigDecimal.valueOf(10))));
		return fib.get(2);
	}
}
