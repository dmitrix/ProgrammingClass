/*
  FlashCards.java

  Marcel Baarsch
  marcelbaarsch@gmail.com

  write your  classes with "stub" methods for testing that
   match your problem description and user stories from Prog. 3
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlashCards extends JFrame
{
  // Screen Size!
  private static final int WIDTH = 800;
  private static final int HEIGHT = 400;



  public FlashCards()
  {
    // Title Bar
    setTitle("Physics Flash Cards");



    // Window Stuff
    setSize(WIDTH, HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    FlashCards flash = new FlashCards(); // Run the contructor

  }

}
