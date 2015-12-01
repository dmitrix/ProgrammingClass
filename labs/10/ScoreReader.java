/*
    ScoreReader.java

    Marcel Baarsch
    marcelbaarsch@gmail.com

    Write a program that reads the file, Scores.txt, and then displays the following items in a nice, user-friendly format to both the screen and an output file named, Results.txt:
      *Title
      *Highest Score
      *Lowest Score
      *Average Score
      *Number of Scores Read

    The file format is a text file that has the Title for what these scores represent (like Exam 1) followed by a list of scores where there is 1 score per line. Your code should catch all files that do not have a Title line in the file and still process the scores and include a notation in the output that no Title was found in the file (You only have to worry about the title in the first row of the file).
*/

// First I Am going to run someone else's example.
// Woo! Now I am going to annotate it so I fully understand.

// I'm so ashamed. .___.

import java.io.*;
import java.util.Scanner; // This is a start.

public class ScoreReader
{
  public static void main(String args[]) throws IOException{
	try {
		Scanner input = new Scanner(System.in); // create scanner
		System.out.print("Enter the file name with extention : "); // for getting file name
		File file = new File(input.nextLine()); 
	
		input = new Scanner(file);
	
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}
	catch (Exception ex){
		ex.printStackTrace();
	}
	
	
  }


}
