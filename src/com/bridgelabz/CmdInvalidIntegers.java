/**
 * 
 */
package com.bridgelabz;

/**
 * @author Admin
 *
 */
public class CmdInvalidIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] values) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		System.out.println("Calculates Sum for below Integers");
		
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
			try {
			sum = sum + Integer.parseInt(values[i]);
			} catch (NumberFormatException e) {
			System.out.println("Invalid integer command line arguments: " + e.toString());
			}
		}
		System.out.println("Sum :" + sum);
			
	}
	}

