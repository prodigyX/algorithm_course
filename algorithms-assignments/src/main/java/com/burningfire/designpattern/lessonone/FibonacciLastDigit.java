package com.burningfire.designpattern.lessonone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Algorithm Assignment 1 Part 1:Fibonacci Series
 *
 */
public class FibonacciLastDigit {

	private static List<Long> fib = new ArrayList<Long>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		fib.add(0, Long.valueOf(0));
		fib.add(1, Long.valueOf(0));
		fib.add(2, Long.valueOf(0));
		Long result = solveFibonacci(fib, scanner.nextInt());
		// System.out.println(result);
	}

	private static Long solveFibonacci(List<Long> fib, int nthTarget) {
		for (int ctr = 0; ctr <= nthTarget; ctr++) {
			if (ctr <= 1) {
				fib.set(ctr, Long.valueOf(ctr));
			} else {
				fib.set(2, (fib.get(0) + (fib.get(1))) % 10 );
				fib.set(0, fib.get(1));
				fib.set(1, fib.get(2));
			}
		}
		System.out.println(fib.get(2));
		return fib.get(2);
	}
}
