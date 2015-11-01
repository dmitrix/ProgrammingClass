

public class Game implements Runnable {
	
	// Game Programming - Episode 1 - Resolution
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	
	// Game Programming - Episode 2 - Threads
	private Thread thread;
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}