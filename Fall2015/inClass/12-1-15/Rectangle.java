/*
	Rectangle.java
	
	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	Example Applet for calculating the the area of the rectangle.
	Given in class.

	Need caffeine (( _ _ ))..zzZZ
	
	
	UI:
	
	|----------------|
	| Length:   | 3  |
	| Width:    | 2  |
	| Area:     | 6  |
	| Perimeter:| 10 | 
	|----------------|
	| Calc  |  EXIT  | 
	|----------------|
	
	works! \o/
	
*/

import javax.swing.*; // Library with graphical elements
import java.awt.*;
import java.awt.event.*; // To know if buttons are pressed


public class Rectangle extends JFrame
{	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300; //px?
	
	private JLabel lengthL, widthL, areaL, perimeterL;
	private JTextField lengthTF, widthTF, areaTF, perimeterTF;
	
	private JButton calculateB, exitB;
	
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	public Rectangle()
	{
		setTitle("Area and Perimeter of a Rectangle"); // part of JFrame
		
		// set labels
		lengthL = new JLabel("Enter the Length: " , SwingConstants.RIGHT /* ALIGN RIGHT */);
		widthL = new JLabel("Enter the Width: ", SwingConstants.RIGHT);
		areaL = new JLabel("This is the area: ", SwingConstants.RIGHT);
		perimeterL = new JLabel("This is the perimeter: ", SwingConstants.RIGHT);
		
		// create our textFields
		lengthTF = new JTextField(10); // public JTextField(int columns)
		widthTF = new JTextField(10);
		areaTF = new JTextField(10);
		perimeterTF = new JTextField(10);
		
		// Create Calculate Button
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		
		// Create Exit Button
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		// create my container
		Container pane = getContentPane(); // http://docs.oracle.com/javase/7/docs/api/java/awt/Container.html
		pane.setLayout(new GridLayout(5, 2)); // GridLayout(int rows, int cols) https://docs.oracle.com/javase/7/docs/api/java/awt/GridLayout.html
		
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(perimeterL);
		pane.add(perimeterTF);
		pane.add(calculateB);
		pane.add(exitB);
		
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private class CalculateButtonHandler implements ActionListener  // interfaces get implemented, not extended
	{
		public void actionPerformed(ActionEvent e)
		{
			double length, width, area, perimeter;
			
			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			
			area = length * width;
			perimeter = 2 * (length + width);
			
			areaTF.setText("" + area);  // "" converts to String
			perimeterTF.setText("" + perimeter);
		}
	}
	
	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		
	}
	
	

}