
class HiloEspera extends Thread {
	@Override
	public void run() {
		System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido.");
			return;
		}
		System.out.println(Thread.currentThread().getName() + " acabado.");
	}
}

public class LanzaHilos {
	public static void main(String args[]) {
		HiloEspera hilo1 = new HiloEspera();
		HiloEspera hilo2 = new HiloEspera();
		HiloEspera hilo3 = new HiloEspera();
		hilo1.setName("hilo 1");
		hilo2.setName("hilo 2");
		hilo2.setName("hilo 3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		try {
			hilo1.join();
			hilo2.join();
			hilo3.join();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido. ");
			return;
		}
		hilo1.interrupt();
	}
}