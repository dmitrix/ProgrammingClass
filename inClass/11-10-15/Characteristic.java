/*
	Characteristic.java
	
	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	This was technically once a homework assignment.
	That was awhile ago and the teacher reviewed this code in class.
*/

import java.util.*;

public class Characteristic
{
	// Data Members
	private String description;
	private int rating;

	// Constructor
	public Characteristic(String desc)
	{
		description = desc;
		rating = 0;
	}
	
	// private isValid method
	private boolean isValid(int aRating)
	{	
		
		// Not actually branching, if statement is not necessary
		/*
			if (aRating >= 1 && aRating <= 10)
				return true;
			else
				return false;
		*/
		
		// This is much more efficient
		return (aRating >= 1 && aRating <= 10);
			
		
	}
	
	// public setRating method 1
	public void setRating(int aRating)
	{
		// We use isValid so it's easy to change
		if (isValid(aRating))
			rating = aRating;
		
	}
	
	// public setRating method 2
	public void setRating()
	{
		// I'm trying to beat the teacher on less lines of code written
			//System.out.println("What is your rating for " + description + "?");
			//System.out.println("Please enter an integer from 1 to 10");
		
		Scanner keyboard = new Scanner(System.in);
		int data = -1;
		boolean needTheRating = true;
		
		while(needTheRating)
		{
			// I put them here so they only appear once
			System.out.println("What is your rating for " + description + "?");
			System.out.println("Please enter an integer from 1 to 10");
			
			data = keyboard.nextInt();
			if(isValid(data))
				needTheRating = false; // if it's right we don't have to go back
			else
				System.out.println("Sorry, that number is out of range");
		}
		
		rating = data;
	}
	
	// public toString method
	public String toString()
	{
		String tmpStr = "For " + description + " your rating is " + rating;
		return tmpStr;
	}
}