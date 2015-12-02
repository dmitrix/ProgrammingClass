/*
	CharDriver.java

	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	Tests Characteristic.java
*/

public class CharDriver
{
	// teacher forgot to write class and main method :P
	
	public static void main(String args[])
	{
		Characteristic sports = new Characteristic("Sports");
		System.out.println(sports.toString());
		sports.setRating(11);
		System.out.println(sports.toString());
		sports.setRating(7);
		System.out.println(sports.toString());
		sports.setRating();
	}
}