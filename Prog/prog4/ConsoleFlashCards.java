
/*
  ConsoleFlashCards.java
  Marcel Baarsch
  marcelbarsch@gmail.com
  Get program to work in console before the GUI
  things to do:
  come up with a couple flash cards
  read flash cards
  display flash cards
  display answer
  change flash cards
*/

import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ConsoleFlashCards extends JFrame
{
  // Screen Size
  private static final int WIDTH = 800;
  private static final int HEIGHT = 500;

  public ConsoleFlashCards()
  {
    // Title Bar
    setTitle("Physics Flash Cards");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(WIDTH,HEIGHT);


  }

  public static void main(String[] args) throws IOException{
	   try
     {

       File file = new File("Cards.json");
       Scanner input = new Scanner(file);

       /**
        * Count total lines in file.
        */
       int linesTotal = 1;
       while (input.hasNextLine())
       {
         linesTotal++;
         input.nextLine();
       }
       linesTotal = linesTotal - 2; // subtract END lines
       //System.out.println(linesTotal);
       input.close();


       /**
        * Store questions in an array
        */
       String[] questions = new String[linesTotal/2];

       input = new Scanner(file);
       for (int i = 0; i < linesTotal; i+=2){
           questions[i/2] = input.nextLine();
           //System.out.println("Question:" + questions[i/2]);
           input.nextLine();
       }
       input.close();


       /**
        * Store correspoding answers in an array.
        */
       String[] answers = new String[linesTotal/2];

       input = new Scanner(file);
       for (int i = 0; i < linesTotal; i+=2){
           input.nextLine();
           answers[i/2] = input.nextLine();
           //System.out.println("Answer:" + answers[i/2]);
       }
       input.close();

     }
     catch (Exception ex)
     {
       ex.printStackTrace();
     }

   }


}
