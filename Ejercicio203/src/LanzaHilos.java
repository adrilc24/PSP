
public class LanzaHilos {
	public static void main(String [] args) {
		HiloConParametros hilo1 = new HiloConParametros("Hilo1", 7 );
		HiloConParametros hilo2 = new HiloConParametros("Hilo2",  5 );
		HiloConParametros hilo3 = new HiloConParametros("Hilo3", 3 );
		
		System.out.println("Lanzando los hilos...");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		System.out.println("Hilos finalizados");
	}
}
