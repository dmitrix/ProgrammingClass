/*
  FlashCards.java

  Marcel Baarsch
  marcelbaarsch@gmail.com

  write your  classes with "stub" methods for testing that
   match your problem description and user stories from Prog. 3
<<<<<<< HEAD


  ----------------------------------------
  |                                      |
  |                                      |
  |      ---------------------------     |
  |      |        Question         |     |
  |      ---------------------------     |
  |                                      |
  |            |Reveal Answer|           |
  |                                      |
  ----------------------------------------
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlashCards extends JFrame
{
  // Screen Size!
  private static final int WIDTH = 800;
  private static final int HEIGHT = 500;

  // Question
  private JLabel questionL, emptyL;

  // Buttons
  private JButton prevB, nextB;

  public FlashCards()
  {
    // Title Bar
    setTitle("Physics Flash Cards");

    // Set Label
    questionL = new JLabel("What is Newton's 3rd Law?");
    questionL.setHorizontalAlignment(SwingConstants.CENTER);



    // create buttons
    prevB = new JButton("Prev");

    nextB = new JButton("Next");


    // Container Stuff
    /*Container pane = getContentPane();
    pane.setLayout(new GridLayout(3,3));



    pane.add(prevB);
    pane.add(questionL);
    pane.add(nextB);*/

    // Switching to a frame/panel thing?
    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
    JPanel p2 = new JPanel(new GridLayout(1,3));

    p2.add(prevB);
    p2.add(questionL);
    p2.add(nextB);

    p1.add(p2);

    JFrame frame = new JFrame("test");
    frame.add(p1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


    // Window Stuff
    frame.setSize(WIDTH, HEIGHT);
    //setVisible(true);
    //setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    FlashCards flash = new FlashCards(); // Run the contructor

  }

}
