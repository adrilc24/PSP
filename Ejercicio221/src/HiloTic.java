
public class HiloTic extends Thread{
	String nombre;
	Reloj r;
	int n;
	
	public HiloTic(String nombre, Reloj r, int n) {
		this.nombre = nombre;
		this.r = r;
		this.n= n;
	}
	
	
	public void run() {
		try {
			for (int i = 0; i < n; i ++) {
				r.Tic();
				Thread.sleep(1500);	
			}
		} catch (InterruptedException e) {
			System.err.println("Thread interrumpido!");
			System.exit(-1);
		}
	}	
}
