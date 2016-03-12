package com.burningfire.designpattern.lessonone;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LCM Computation using Euclidian Algorithm
 * 
 * @author Kristian Josef L. Delos Reyes
 */
public class Lcm {
	private static Scanner scanner;
	private static final Logger LOGGER = LoggerFactory.getLogger(Lcm.class);

	public static void main(String[] args) {

		// Get input from user
		scanner = new Scanner(System.in);
		long var1 = scanner.nextInt();
		long var2 = scanner.nextInt();
		long product = var1 * var2;
		
		// Solve for GCD
		long result = solveGCD(var1, var2, product);
		LOGGER.info("The LCM is: {}", result);
	}

	/**
	 * 
	 * @param var1
	 * @param var2
	 * @param product
	 * @return
	 */
	private static long solveGCD(long var1, long var2, long product) {
		// We have a property where LCM * GCD = var1 * var2 
		if (var2 == 0) {
			 System.out.println(product/var1);
			return var1;
		} else {
			long vartemp = var2;
			var2 = var1 % var2;
			var1 = vartemp;
		}
		return solveGCD(var1, var2, product);
	}
}
