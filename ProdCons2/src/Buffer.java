import java.util.concurrent.*;

public class Buffer {
	private int contenido;
	private boolean contenidolleno = false;
	
	public synchronized int get() {
		while(!contenidolleno) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		contenidolleno = false;
		notify();
		return contenido;
	}
	
	public synchronized void put(int value) {
		while(contenidolleno) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		contenido = value;
		contenidolleno = true;
		notify();
	}
}
