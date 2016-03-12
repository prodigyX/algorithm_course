package com.burningfire.designpattern.lessonone;

import java.util.Scanner;

/**
 * GCD Computation using Euclidian Algorithm
 * @author Kristian Josef L. Delos Reyes
 */
public class Gcd 
{
    public static void main( String[] args )
    {
    	
    	Scanner scanner = new Scanner(System.in);
    	int var1 = scanner.nextInt();
    	int var2 = scanner.nextInt();
    	solveGCD(var1, var2 );
    }
    
    private static int solveGCD(int var1, int var2){
    	if (var2 == 0){
    		System.out.println(var1);
//    		System.out.println("LCM:" + var1*var2));
    		return var1;
    	}
    	else{
//    		System.out.println(String.format("compute: (%d : %d) ", var1, var2));
    		int vartemp = var2;
    		var2 = var1 % var2;
    		var1= vartemp;
    	}
    	return solveGCD(var1, var2);
    }
}
