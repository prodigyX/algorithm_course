package com.burningfire.designpattern.lessonone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Algorithm Assignment 1a Part 1:Fibonacci Series
 * 
 * @author kristian delos reyes
 */
public class Fibonacci {

	private static final Logger LOGGER =  LoggerFactory.getLogger(Fibonacci.class);
	private static List<Double> fib = new ArrayList<Double>();

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Get input from user
		Scanner scanner = new Scanner(System.in);

		// Get Result
		double result = solveFibonacci(fib, scanner.nextInt());
		LOGGER.info("Th fibonacci value is: {}", result);
	}

	/**
	 * @param fib
	 * @param nthTarget
	 * @return
	 */
	private static Double solveFibonacci(List<Double> fib, int nthTarget) {
		for (int ctr = 0; ctr <= nthTarget; ctr++) {
			if (ctr <= 1) {
				fib.add(ctr, (double) ctr);
			} else {
				fib.add((double) fib.get(ctr - 1) + (double) fib.get(ctr - 2));
			}
		}
		return fib.get(nthTarget);
	}
}
