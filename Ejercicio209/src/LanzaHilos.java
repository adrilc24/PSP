
public class LanzaHilos {
	public static void main(String [] args) {
		HiloFinPrograma hilo1 = new HiloFinPrograma("Hilo1", 7 );
		HiloFinPrograma hilo2 = new HiloFinPrograma("Hilo2",  5 );
		HiloFinPrograma hilo3 = new HiloFinPrograma("Hilo3", 3 );
		
		System.out.println("Lanzando los hilos...");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		try {
			hilo3.join();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido. ");
			return;
		}
		hilo1.interrupt();
		System.out.println("Hilos finalizados");
	}
}
