/**
 * CalculateGPA.java
 *
 * Marcel Baarsch
 * marcelbaarsch@gmail.com
 *
 * A Java swing program that calculates GPA
 * for a student with up to six classes.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculateGPA extends JFrame{
  public static final int WIDTH = 400;
  public static final int HEIGHT = 600;

  private JLabel firstLabel, secondLabel,
    thirdLabel, fourthLabel, fifthLabel, sixthLabel;

  private JLabel resultLabel;

  private JComboBox firstTextField, secondTextField, thirdTextField,
    fourthTextField, fifthTextField, sixthTextField;

  private JButton calculateButton;

  private CalculateButtonHandler calculateButtonHandler;

  private String[] grades = { " ", "A", "B", "C", "D", "F"};

  public CalculateGPA()
  {
    setTitle("Calculate Grade Point Average");

    /* Set Labels */
    firstLabel = new JLabel("Enter Letter Grade: ", SwingConstants.CENTER);
    secondLabel = new JLabel("Enter Letter Grade: ", SwingConstants.CENTER);
    thirdLabel = new JLabel("Enter Letter Grade: ", SwingConstants.CENTER);
    fourthLabel = new JLabel("Enter Letter Grade: ", SwingConstants.CENTER);
    fifthLabel = new JLabel("Enter Letter Grade: ", SwingConstants.CENTER);
    sixthLabel = new JLabel("Enter Letter Grade: ", SwingConstants.CENTER);

    /* result label */
    resultLabel = new JLabel("Result", SwingConstants.CENTER);

    /* Set TextFields */
    firstTextField = new JComboBox(grades);
    secondTextField = new JComboBox(grades);
    thirdTextField = new JComboBox(grades);
    fourthTextField = new JComboBox(grades);
    fifthTextField = new JComboBox(grades);
    sixthTextField = new JComboBox(grades);

    /* Calculate Button */
    calculateButton = new JButton("Calculate!");
    calculateButtonHandler = new CalculateButtonHandler();
    calculateButton.addActionListener(calculateButtonHandler);

    /* Container */
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(7,2));

    /* First */
    pane.add(firstLabel);
    pane.add(firstTextField);

    /* Second */
    pane.add(secondLabel);
    pane.add(secondTextField);

    /* Third */
    pane.add(thirdLabel);
    pane.add(thirdTextField);

    /* Fourth */
    pane.add(fourthLabel);
    pane.add(fourthTextField);

    /* Fifth */
    pane.add(fifthLabel);
    pane.add(fifthTextField);

    /* Sixth */
    pane.add(sixthLabel);
    pane.add(sixthTextField);

    /* Button & Result */
    pane.add(calculateButton);
    pane.add(resultLabel);

    /* Frame Properties */
    setSize(WIDTH, HEIGHT);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


  private class CalculateButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      int totalClasses = 0;
      int sumGPA = 0;
      double averageGPA;
      int[] grades = new int[6];

      /**
       *
       *
       *
       * BRACE YOURSELF FOR NIGHTMARE
       * SWITCH STATEMENTS
       *
       *
       *
       */
      switch ("" + firstTextField.getSelectedItem())
      {
        case " ":
          grades[0] = 0;
          break;
        case "A":
          grades[0] = 4;
          totalClasses++;
          break;
        case "B":
          grades[0] = 3;
          totalClasses++;
          break;
        case "C":
          grades[0] = 2;
          totalClasses++;
          break;
        case "D":
          grades[0] = 1;
          totalClasses++;
          break;
        case "F":
          grades[0] = 0;
          totalClasses++;
          break;
      }

      switch ("" + secondTextField.getSelectedItem())
      {
        case " ":
          grades[1] = 0;
          break;
        case "A":
          grades[1] = 4;
          totalClasses++;
          break;
        case "B":
          grades[1] = 3;
          totalClasses++;
          break;
        case "C":
          grades[1] = 2;
          totalClasses++;
          break;
        case "D":
          grades[1] = 1;
          totalClasses++;
          break;
        case "F":
          grades[1] = 0;
          totalClasses++;
          break;
      }

      switch ("" + thirdTextField.getSelectedItem())
      {
        case " ":
          grades[2] = 0;
          break;
        case "A":
          grades[2] = 4;
          totalClasses++;
          break;
        case "B":
          grades[2] = 3;
          totalClasses++;
          break;
        case "C":
          grades[2] = 2;
          totalClasses++;
          break;
        case "D":
          grades[2] = 1;
          totalClasses++;
          break;
        case "F":
          grades[2] = 0;
          totalClasses++;
          break;
      }

      switch ("" + fourthTextField.getSelectedItem())
      {
        case " ":
          grades[3] = 0;
          break;
        case "A":
          grades[3] = 4;
          totalClasses++;
          break;
        case "B":
          grades[3] = 3;
          totalClasses++;
          break;
        case "C":
          grades[3] = 2;
          totalClasses++;
          break;
        case "D":
          grades[3] = 1;
          totalClasses++;
          break;
        case "F":
          grades[3] = 0;
          totalClasses++;
          break;
      }

      switch ("" + fifthTextField.getSelectedItem())
      {
        case " ":
          grades[4] = 0;
          break;
        case "A":
          grades[4] = 4;
          totalClasses++;
          break;
        case "B":
          grades[4] = 3;
          totalClasses++;
          break;
        case "C":
          grades[4] = 2;
          totalClasses++;
          break;
        case "D":
          grades[4] = 1;
          totalClasses++;
          break;
        case "F":
          grades[4] = 0;
          totalClasses++;
          break;
      }

      switch ("" + sixthTextField.getSelectedItem())
      {
        case " ":
          grades[5] = 0;
          break;
        case "A":
          grades[5] = 4;
          totalClasses++;
          break;
        case "B":
          grades[5] = 3;
          totalClasses++;
          break;
        case "C":
          grades[5] = 2;
          totalClasses++;
          break;
        case "D":
          grades[5] = 1;
          totalClasses++;
          break;
        case "F":
          grades[5] = 0;
          totalClasses++;
          break;
      }

      for (int i = 0; i < 6; i++)
      {
        sumGPA = sumGPA + grades[i];
      }

      if (totalClasses > 0)
      {
        averageGPA = (double)sumGPA / (double)totalClasses;
        resultLabel.setText("Grade Point Average: " + averageGPA);
      }
      else
      {
        resultLabel.setText("Please Enter Some Grades");
      }



    }
  }

  public static void main(String[] args)
  {
    CalculateGPA gpa = new CalculateGPA();
  }

}
