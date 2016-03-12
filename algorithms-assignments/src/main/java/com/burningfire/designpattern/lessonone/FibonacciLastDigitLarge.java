
package com.burningfire.designpattern.lessonone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Algorithm Assignment 1 Part 1:Fibonacci Series
 *
 */
public class FibonacciLastDigitLarge {

	private static List<Long> fib = new ArrayList<Long>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		fib.add(0, Long.valueOf(0));
		fib.add(1, Long.valueOf(0));
		fib.add(2, Long.valueOf(0));
		Long result = solveFibonacci(fib, scanner.nextLong(), scanner.nextInt());
		// System.out.println(result);
	}

	private static Long solveFibonacci(List<Long> fib, long nthTarget, int mod) {
		int pisanoCycle = 0;
		for (long ctr = 0; ctr <= Long.MAX_VALUE; ctr++) {
			if (ctr > 1) {
				if (fib.get(0) % mod == 0 && fib.get(1) % mod == 1 && pisanoCycle > 0) {
					// System.out.println("PISANO:" + pisanoCycle);
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

		fib.set(0, Long.valueOf(0));
		fib.set(1, Long.valueOf(0));
		fib.set(2, Long.valueOf(0));

		for (long ctr = 0; ctr <= nthTarget % pisanoCycle; ctr++) {
			if (ctr <= 1) {
				fib.set((int) ctr, Long.valueOf(ctr));
			} else {
				fib.set(2, (fib.get(0) + (fib.get(1))) % mod);
				fib.set(0, fib.get(1));
				fib.set(1, fib.get(2));
//				System.out.println(fib.get(0) + ":" + fib.get(1));
			}
		}
		System.out.println(fib.get(1));
		return fib.get(1);
	}
}
