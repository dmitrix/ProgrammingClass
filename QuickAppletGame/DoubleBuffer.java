import java.awt.Image;
import java.awt.Graphics;

public class DoubleBuffer {
		private Image dbImage;
		private Graphics dbg;
	
		public void DoubleBuffer(Graphics g, Game game)
		{
			// init buffer
			if(dbImage == null)
			{
				dbImage = createImage (this.getSize().width, this.getSize().height);
				dbg = dbImage.getGraphics();
			}
		
			// clear screen in background
			dbg.setColor(getBackground());
			dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
			// draw elements in background
			dbg.setColor(getForeground());
			paint(dbg);
		
			// draw image on the screen
			g.drawImage(dbImage, 0, 0, this);
		}