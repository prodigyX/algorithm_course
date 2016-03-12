package com.burningfire.designpattern.intro;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Introductory assignment in alogorithms
 * @author kristian delos reyes
 *
 */
public class APlusB {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(APlusB.class);
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
    	// Get 2 numbers as input
    	LOGGER.info("Please enter 2 numbers separated by space: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        // Get total and display
        int total = a + b;
        LOGGER.info("the Sum of ({} + {}) is : {}", a, b, total);
    }
}