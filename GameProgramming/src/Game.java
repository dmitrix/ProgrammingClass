import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1L;
	
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	
	private Thread thread;
	private JFrame frame;
	private boolean running  = false;
	
	// constructor
	public Game() {
		Dimension size = new Dimension(width*scale, height*scale);
		setPreferredSize(size);
		
		frame = new JFrame();
	}
	
	public synchronized void start() {
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public synchronized void stop(){
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		while(running){
			update();
			render();
		}
	}
	
	public void update() {
	
	}
	
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null)
		{
			createBufferStrategy(3); // triple buffering
			return; 
		}
	}
	
	public static void main(String[] args){
		Game game = new Game();
		game.frame.setResizable(false); // make sure this is the first thing to frame
		game.frame.setTitle("Rain");
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null); // center window
		game.frame.setVisible(true); // so we can actually see it
		
		game.start();
		
		
		
	}
	
}