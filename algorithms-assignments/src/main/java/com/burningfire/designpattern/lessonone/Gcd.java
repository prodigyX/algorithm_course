package com.burningfire.designpattern.lessonone;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GCD Computation using Euclidian Algorithm
 * @author Kristian Josef L. Delos Reyes
 */
public class Gcd 
{
    private static Scanner scanner;
    private static final Logger LOGGER = LoggerFactory.getLogger(Gcd.class);

	public static void main( String[] args )
    {
    	// Get input from user
    	scanner = new Scanner(System.in);
    	int var1 = scanner.nextInt();
    	int var2 = scanner.nextInt();
    	
    	// Solve for GCD
    	int result  = solveGCD(var1, var2);
    	LOGGER.info("The GCD is: {}", result);
    }
    
	/**
	 * 
	 * @param var1
	 * @param var2
	 * @return
	 */
    private static int solveGCD(int var1, int var2){
    	
    	// Recursive GCD Computation, 
    	// 1. gets 2 variables
    	// 2. var2 is place on temp container
    	// 3. var2 new = var1 % of var2
    	// 4. var1 = vartemp
    	// 5. solve until var2 = 0
    	if (var2 == 0){
    		return var1;
    	}
    	else{
    		int vartemp = var2;
    		var2 = var1 % var2;
    		var1= vartemp;
    	}
    	return solveGCD(var1, var2);
    }
}
