/*
	Game.java
	
	Marcel Baarsch
	marcelbaarsch@gmail.com
	
	Practice writing games in Java for fun.
*/

// import necessary packages
import java.applet.*;
import java.awt.*;

// inherit the applet class from the class Applet
public class Game extends Applet implements Runnable
{
	// Ball property variables
	int radius = 20, gravity = 1;
	// Ball X variables
	int x_pos = 10 + 20,  x_speed = 5;  
	// Ball Y variables
	int y_pos = 100,  y_speed = 5;
	
	int appletsize_x = 600, appletsize_y = 400;
	
	
	// First time site is entered
	public void init()
	{
	
	}
	
	// Everytime you enter
	public void start()
	{
		Thread th = new Thread(this);
		th.start();
	}

	// When you leave
	public void stop()
	{
	
	}
	
	// When you leave for good
	public void destroy()
	{
		
	}
	
	
	
	
	
	public void update(Graphics g)
	{
		new DoubleBuffer(g, this);
	}
	
	// Threads
	public void run ()
	{
		// lower ThreadPriority
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		// While loop
		while (true)
		{
			if (x_pos > appletsize_x - radius)
			{
				// Change direction
				x_speed = -x_speed;
			}
			else if (x_pos < radius)
			{
				x_speed = -x_speed;
			}
			
			if (y_pos > appletsize_y - radius)
			{
				//y_pos = appletsize_y - radius;
				y_speed = -y_speed;
				
			}
			//elsif (y_pos < 0)
			//{
			//	y_speed = -y_speed;
			//}
			
			
			
			x_pos += x_speed;
			
			y_pos += y_speed;
			
			// gravity?
			y_speed += gravity;
			
			repaint();
			
			try
			{
				Thread.sleep(20);
			}
			catch (InterruptedException ex)
			{
				// do nothing
			}
			
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}
	
	// Graphics
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 400);
		
		g.setColor(Color.white);
		
		g.fillOval(x_pos - radius, y_pos - radius, 2 * radius, 2 * radius);
		
		g.setColor(Color.white);
		g.drawString("x_pos: " + x_pos, 10, 10);
		g.drawString("y_pos: " + y_pos, 10, 20);
		g.drawString("y_speed: " + y_speed, 10, 30);
	}
}