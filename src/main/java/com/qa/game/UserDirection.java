package com.qa.game;

public class UserDirection {
	
	String userDirection = UserInput.userDirection();{

		/**
		 * This takes the answer from the previous class,
		 * and modifies the distance required to reach the prize at the end.
		 */
		
		
	double x = TriangleSideX.SideX();
	double y = TriangleSideY.SideY();
	double z = Math.hypot(TriangleSideX.SideX(), TriangleSideY.SideY());
	
	
		if (userDirection == "West") {
			 x = x - 1;;
		} else if (userDirection == "East") {
			 x = x + 1;
		} else if (userDirection == "South") {
			 y = y - 1;
		} else if (userDirection == "North") {
			 y = y + 1;
		} else {
			throw new WrongDirectionException();
		}
	}

}