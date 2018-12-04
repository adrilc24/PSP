
public class LanzaHilos213 {
	public static void main(String[] args) {
		HiloRecursivo thread = new HiloRecursivo();
		
		thread.setName("Hilo");
		
		thread.start();	
	}
}