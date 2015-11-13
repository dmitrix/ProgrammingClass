/*
	Template.java

	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	A code file just to remind me
	how java syntax works.

*/

// How you import stuff
import java.util.Scanner.

// Class name is capital
public class Template {
	
	public static void main (String args[])
	{
		Scanner kbd = new Scanner(System.in);
		System.out.printf("This is how to print to console. \n Enter a number please: ");
		int userNum = kbd.nextInt();
		System.out.println("Enough printing.");
		
		
	}
	
	// visibility and return type, methods are always camel case
	public int addition(int a, int b)
	{
		return a + b; // returns int type
	}
	
}


