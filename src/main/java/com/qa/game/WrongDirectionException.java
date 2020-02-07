package com.qa.game;

public class WrongDirectionException extends RuntimeException{
	
	public String getMessage() {
		return "Please enter 'North', 'South', 'East' or 'West'.";
	}
 
}
