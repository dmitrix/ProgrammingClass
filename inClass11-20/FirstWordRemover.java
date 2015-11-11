/*
	FirstWordRemover.java
	
	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	
*/
import java.util.Scanner;
import java.io.*; // stands for input/output

public class FirstWordRemover
{
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		System.out.println("What is your in-file name?");
		String inFileName = kbd.nextLine().trim(); // trim away any leading or trailing spaces
		// String inFileName = reader.nextLine();
		// inFileName.trim();
		
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your out-file name?");
		String outFileName = reader.nextLine().trim(); // trim away any leading or trailing spaces
		// String inFileName = reader.nextLine();
		// outFileName.trim();
	
		Scanner inputFile = null;
		try
		{
			inputFile = new Scanner(new File(inFileName));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error opening file " + inFileName + " for reading.");
			System.exit(0);
		}
		
		PrintWriter outputFile = null;
		try
		{
			outputFile = new PrintWriter(new File(outFileName));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error opening file " + outFileName + " for reading.");
			System.exit(0);
		}
		
		// Process the file
		while(inputFile.hasNextLine())
		{
			String line = inputFile.nextLine();
			
			// process each line to strip off the first word
			Scanner lineScanner = new Scanner(line);
			if(lineScanner.hasNext())
			{
				String word = lineScanner.next();
				int wordLocation = line.indexOf(word);
				String rest = line.subString(wordLocation + word.length());
				outputFile.println(rest);
			}	
			else
			{
				outputFile.println(line);
			}
			
			
			outputFile.println(line);
			System.out.println(line);
		}
		
		inputFile.close();
		outputFile.close();
		
		System.out.println("File processing done.");
	}
}