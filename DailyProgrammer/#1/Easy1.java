/**
	Easy1.java
	
	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	create a program that will ask the users name, age, and reddit username. have it tell them the information back, in the format:
		your name is (blank), you are (blank) years old, and your username is (blank)
	for extra credit, have the program log this information in a file to be accessed later.

*/
import java.util.Scanner;

public class Easy1{
	
	public static void main(String[] args)
	{
		String name, username;
		int age;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Yo! What is your name?");
		name = kbd.nextLine();
		System.out.println("I know it's rude to ask but what is your age?");
		age = kbd.nextInt();
		System.out.println("What is your Reddit username?");
		kbd.nextLine(); // Weird thing, can't remember why.
		username = kbd.nextLine();
		
		System.out.println("Your name is " + name + " you are " + age + " years old, and your username is " + username);
	}
	
}