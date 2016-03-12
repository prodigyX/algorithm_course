package com.burningfire.designpattern.lessonone;

import java.util.Scanner;

/**
 * GCD Computation using Euclidian Algorithm
 * 
 * @author Kristian Josef L. Delos Reyes
 */
public class Lcm {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long var1 = scanner.nextInt();
		long var2 = scanner.nextInt();
		long product = var1 * var2;
		solveGCD(var1, var2, product);
	}

	private static long solveGCD(long var1, long var2, long product) {
		if (var2 == 0) {
//			System.out.println(var1);
//			 System.out.println("LCM:" + product/var1);
			 System.out.println(product/var1);
			return var1;
		} else {
			// System.out.println(String.format("compute: (%d : %d) ", var1,
			// var2));
			long vartemp = var2;
			var2 = var1 % var2;
			var1 = vartemp;
		}
		return solveGCD(var1, var2, product);
	}
}
