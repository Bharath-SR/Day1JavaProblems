/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class StringEqualsJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class

		Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
		System.out.println("Enter the first string: "
						+ string1);
		String string2 = input.nextLine();
		System.out.println("Enter the second string :"
						+ string2);

		// Check if both strings are equal
		System.out.println("\nAre both strings same: ");

		if (string1.equals(string2) == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
