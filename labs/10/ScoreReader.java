/*
    ScoreReader.java

    Marcel Baarsch
    marcelbaarsch@gmail.com

    Write a program that reads the file, Scores.txt, and then displays the following items in a nice,
     user-friendly format to both the screen and an output file named, Results.txt:
      *Title
      *Highest Score
      *Lowest Score
      *Average Score
      *Number of Scores Read

    The file format is a text file that has the Title for what these scores represent (like Exam 1)
    followed by a list of scores where there is 1 score per line. Your code should catch all files
    that do not have a Title line in the file and still process the scores and include a notation in
    the output that no Title was found in the file (You only have to worry about the title in the first row of the file).

    I feel like this is overly complicated for what it is but the job is done!
  
*/

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;



public class ScoreReader
{
  public static void main(String args[]) throws IOException{
    try
    {
      String title="";

      File file = new File("Scores.txt");
      Scanner input = new Scanner(file);

      // Count total lines in file
      int linesTotal = 0;
      while (input.hasNextLine())
      {
        linesTotal++;
        input.nextLine();
      }
      input.close();




      // Read Title
      input = new Scanner(file);
      if (input.hasNextLine())
      {
        title = input.nextLine();

        if (title == "")
          title = "There is no title";



      }


      double[] scoreArray = new double[linesTotal-1];
      for(int i = 0; i < linesTotal - 1; i++)
      {
          scoreArray[i] = Double.parseDouble(input.nextLine());
      }

      // Print Data
      ScoreReader sr = new ScoreReader();

      // Command Line
      System.out.println("Title: " + title);
      System.out.println("Highest Score: " + sr.highest(scoreArray));
      System.out.println("Lowest Score: " + sr.lowest(scoreArray));
      System.out.println("Average Score: " + sr.average(scoreArray));
      System.out.println("Number of Scores Read: " + scoreArray.length);

      // Results.txt
      PrintWriter write = new PrintWriter("Results.txt", "UTF-8");
      write.println("Title: " + title);
      write.println("Highest Score: " + sr.highest(scoreArray));
      write.println("Lowest Score: " + sr.lowest(scoreArray));
      write.println("Average Score: " + sr.average(scoreArray));
      write.println("Number of Scores Read: " + scoreArray.length);

      write.close();
      input.close();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }




  }

  private double highest(double[] scoreArray)
  {
      double largest = scoreArray[0];

      for (int i = 0; i < scoreArray.length; i++)
      {
        if (largest < scoreArray[i])
          largest = scoreArray[i];
      }

      return largest;
  }

  private double lowest(double[] scoreArray)
  {

      double smallest = scoreArray[0];

      for (int i = 0; i < scoreArray.length; i++)
      {
        if (smallest > scoreArray[i])
          smallest = scoreArray[i];
      }

      return smallest;
  }

  private double average(double[] scoreArray)
  {
    double sum = 0;
    double average;
    for (int i = 0; i < scoreArray.length; i++)
    {
      sum += scoreArray[i];

    }
    average = sum / scoreArray.length;
    DecimalFormat df = new DecimalFormat("##.##");

    return Double.valueOf(df.format(average));

  }


}
