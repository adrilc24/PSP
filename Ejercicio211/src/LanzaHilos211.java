class HiloEsperaNseg extends Thread {
	
	private int espera;
	
	public HiloEsperaNseg(int espera) {
		this.espera = espera*1000;
	}
	
	@Override
	public void run() {
		System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
		try {
			Thread.sleep(espera);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido.");
			return;
		}
		System.out.println(Thread.currentThread().getName() + " acabado.");
	}
}
 public class LanzaHilos211 {
	public static void main(String args[]) {
		HiloEsperaNseg hilo1 = new HiloEsperaNseg(3);
		HiloEsperaNseg hilo2 = new HiloEsperaNseg(5);
		HiloEsperaNseg hiloDaemon = new HiloEsperaNseg(20);
		
		hiloDaemon.setDaemon(true);
		hilo1.setName("hilo 1");
		hilo2.setName("hilo 2");
		hiloDaemon.setName("hilo Daemon");
		hilo1.start();
		hilo2.start();
		hiloDaemon.start();
		
		try {
			Thread.currentThread().sleep(3000);
			hiloDaemon.sleep(20000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido. ");
			return;
		}
		hilo1.interrupt();
	}
}