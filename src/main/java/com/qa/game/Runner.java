package com.qa.game;

import java.util.Scanner;

public class Runner {
	double x = TriangleSideX.SideX();
	double y = TriangleSideY.SideY();
	static double z = Math.hypot(TriangleSideX.SideX(), TriangleSideY.SideY());

	public static void main(String[] args) {

		/**
		 * Start with a printed message setting the scene.
		 */

		System.out.println(
				"You wake up in a blank, grey, featureless swamp. There is nothing to distinguish any particular direction, nor is there anything to even see beyond the grey greyness.");
		System.out.println(
				"In your hands you see a compass, pointing East. 'Huh!' you think. 'This must be an ancient Chinese compass, because it points east!' You always were a nerd.");
		System.out.println("You decide to use the compass to head in one of the cardinal directions.");
		System.out.println("You are facing East.");

		do {
			/**
			 * Call the UserInput Class, which contains the scanner.-> go to UserInput
			 */

			UserInput input = new UserInput();

			/**
			 * Once all that has run, print out the remaining distance, which is Triangle
			 * side z.
			 */

			System.out.println("The dial on the compass reads " + z + "metres away.");

		} while (z>0);
		
		
		if(z==0) {
		System.out.println("You have found the portal to escape! You win!");
		}
	}

}
