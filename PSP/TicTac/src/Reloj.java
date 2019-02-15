
public class Reloj {
	private boolean tac = false;
	
	public synchronized void tic() {
		while (tac) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("TIC");
			tac = true;
			notifyAll();
		}
	}
	
	public synchronized void tac() {
		while (!tac) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("TAC");
			tac = true;
			notifyAll();
		}
	}

}
