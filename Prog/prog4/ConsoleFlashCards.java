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

public class ConsoleFlashCards
{

  public static void main(String[] args) throws IOException{
	   try
     {

       File file = new File("Cards.json");
       Scanner input = new Scanner(file);

       // parse file
       int linesTotal = 0;
       while (input.hasNextLine())
       {
         linesTotal++;
         input.nextLine();
       }
       input.close();

       String[] questions = new String[linesTotal/2];

       input = new Scanner(file);
       for (int i = 0; i < linesTotal; i+=2){
           questions[i/2] = input.nextLine();
           System.out.println("Question:" + questions[i/2]);
           input.nextLine();
       }
       input.close();

       String[] answers = new String[linesTotal/2];

       input = new Scanner(file);
       for (int i = 1; i < linesTotal; i+=2){
           answers[i/2] = input.nextLine();
           System.out.println("Answer:" + answers[i/2]);
           input.nextLine();
       }
       input.close();

     }
     catch (Exception ex)
     {
       ex.printStackTrace();
     }

   }


}
