import sun.font.TrueTypeFont;

public class Reloj extends Thread{
	
	boolean tictac;
	
	public Reloj() {
		this.tictac = false;
	}
	
	public synchronized void Tic() {
		try {
			Thread.sleep(1500);	
			System.out.println("TIC");
			this.tictac = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void Tac() {
		try {
			Thread.sleep(1500);	
			while (tictac == true) {
				wait();
			}
			System.out.println("TAC");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
