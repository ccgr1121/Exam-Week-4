package com.qa.game;

import java.util.Scanner;

public class UserInput {
	
	public static Scanner scanner = new Scanner(System.in);

	
	public static String userInput() {
		String input = null;
		System.out.println(input);
		return input = scanner.nextLine();
	}

	public static String userDirection() {
		/**
		 * Takes in the output of the previous method, and checks to see if the answer
		 * was valid. If not, then it throws an exception. If it is, it returns the
		 * input. -> to UserDirection.
		 */
		String userDirection = userInput();

		if (userDirection == "West") {
			return userDirection;
		}

		else if (userDirection == "South") {
			return userDirection;
		}

		else if (userDirection == "East") {
			return userDirection;
		}

		else if (userDirection == "North") {
			return userDirection;
		} else {
			throw new WrongDirectionException();
		}

	}
}